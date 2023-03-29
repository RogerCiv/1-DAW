package com.colores;

public interface Apoyable extends FiguraGeometrica {
    public int getLongitudBase();

    public int getLongitudAltura();

    public default boolean esHorizontal() {
        return this.getLongitudBase() > this.getLongitudAltura();
    }

    public default boolean esVertical() {
        return this.getLongitudAltura() > this.getLongitudBase();
    }
}
