package com.colores;

import java.awt.*;
/**
 * 
 * @author roger
 * @version 1.2
 */
public class Circulo implements FiguraGeometrica, Centrable {
    private Point centro;
    private int radio;
    private Color color;

    /**
     * Constructor de la clase circulo
     * @param centro
     * @param radio
     * @param color 
     */
    public Circulo(Point centro, int radio, Color color) {
        this.centro = centro;
        this.radio = radio;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public int getPerimetro() {
        return (int) (Math.PI * 2 * radio);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.centro.x - radio, this.centro.y - radio, radio * 2, radio * 2);
    }

    @Override
    public Point getCentro() {
        return this.centro;
    }
}