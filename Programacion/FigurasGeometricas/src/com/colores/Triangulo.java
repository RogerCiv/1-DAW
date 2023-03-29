package com.colores;

import java.awt.*;

public class Triangulo implements Apoyable {
    private Point[] vertices;

    public Triangulo(Point v1, Point v2, Point v3) {
        vertices = new Point[] { v1, v2, v3 };
    }

    private double getLongitud(Point a, Point b) {
        return Math.sqrt(Math.pow((b.x - a.x), 2) + (Math.pow((b.y - a.y), 2)));
    }

    @Override
    public double getArea() {
        double semiperimetro = this.getPerimetro() / 2;
        double ladoA = getLongitud(this.vertices[0], this.vertices[1]);
        double ladoB = getLongitud(this.vertices[1], this.vertices[2]);
        double ladoC = getLongitud(this.vertices[2], this.vertices[0]);

        return Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
    }

    @Override
    public int getPerimetro() {
        return (int) (getLongitud(this.vertices[0], this.vertices[1]) + getLongitud(this.vertices[1], this.vertices[2])
                + getLongitud(this.vertices[2], this.vertices[0]));
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.getColor());
        g.fillPolygon(new int[] { vertices[0].x, vertices[1].x, vertices[2].x },
                new int[] { vertices[0].y, vertices[1].y, vertices[2].y }, 3);
    }

    @Override
    public Color getColor() {
        return Color.blue;
    }

    @Override
    public int getLongitudBase() {
        // Busco el ejeX mas pequeño y el ejeX más grande
        // Calculo su diferencia, será la longitud de la base
        int ejeXmasPequeño = Math.min(this.vertices[0].x, Math.min(this.vertices[1].x, this.vertices[2].x));
        int ejeXmasGrande = Math.max(this.vertices[0].x, Math.max(this.vertices[1].x, this.vertices[2].x));
        return ejeXmasGrande - ejeXmasPequeño;
    }

    @Override
    public int getLongitudAltura() {
        int ejeYmasPequeño = Math.min(this.vertices[0].y, Math.min(this.vertices[1].y, this.vertices[2].y));
        int ejeYmasGrande = Math.max(this.vertices[0].y, Math.max(this.vertices[1].y, this.vertices[2].y));
        return ejeYmasGrande - ejeYmasPequeño;
    }
}
