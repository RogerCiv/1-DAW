package com.colores;

import java.awt.*;

public interface FiguraGeometrica extends Coloreable {
    public double getArea();

    public int getPerimetro();

    public void dibujar(Graphics g);

    public default Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda) {
        return new Cuadrado(esquinaSuperiorIzquierda, (int) (Math.sqrt(this.getArea())), this.getColor());
    }
}
