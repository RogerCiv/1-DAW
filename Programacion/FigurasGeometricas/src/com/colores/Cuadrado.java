package com.colores;

import java.awt.*;

public class Cuadrado extends Rectangulo {
    private int longitudLado;

    public Cuadrado(Point esquinaSuperiorIzquierda, int longitudLado, Color color) {
        super(esquinaSuperiorIzquierda, new Point((int) (esquinaSuperiorIzquierda.getX() + longitudLado),
                (int) (esquinaSuperiorIzquierda.getY() + longitudLado)), color);
        this.longitudLado = longitudLado;
    }
}