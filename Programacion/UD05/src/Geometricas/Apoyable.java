package Geometricas;

public interface Apoyable extends FiguraGeometrica {
    public int getLongitudBase();
    public int getLongitudAltura();

    public default boolean esHorizontal(){
        return getLongitudBase() > getLongitudAltura();
    }

    public default boolean esVertical(){
        return getLongitudAltura() > getLongitudBase();
    }

}
