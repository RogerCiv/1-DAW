package com.colores;

import java.awt.*;

public class Rectangulo implements Centrable, Apoyable {
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;

    public Rectangulo(Point esi, Point eid, Color c) {
        this.esquinaSuperiorIzquierda = esi;
        this.esquinaInferiorDerecha = eid;
        this.color = c;
    }

    @Override
    public Point getCentro() {
        return new Point((int) ((esquinaSuperiorIzquierda.getX() - esquinaInferiorDerecha.getX()) / 2),
                (int) ((esquinaSuperiorIzquierda.getY() - esquinaInferiorDerecha.getY()) / 2));
    }

    @Override
    public double getArea() {
        return getLongitudBase() * getLongitudAltura();
    }

    @Override
    public int getPerimetro() {
        return (getLongitudAltura() * 2) + (getLongitudBase() * 2);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.esquinaSuperiorIzquierda.x, this.esquinaSuperiorIzquierda.y, getLongitudBase(),
                getLongitudAltura());
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public int getLongitudBase() {
        return (int) this.esquinaInferiorDerecha.getX() - (int) (this.esquinaSuperiorIzquierda.getX());
    }

    @Override
    public int getLongitudAltura() {
        return (int) (this.esquinaInferiorDerecha.getY() - this.esquinaSuperiorIzquierda.getY());
    }
}