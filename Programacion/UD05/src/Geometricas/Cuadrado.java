package Geometricas;

import java.awt.Color;
import java.awt.Point;

public class Cuadrado extends Rectangulo {
 
    private int longitudLado;

    public Cuadrado(Point esquinaSuperiorIzquierda, Color c, int longitudLado) {
        super(esquinaSuperiorIzquierda,esquinaSuperiorIzquierda,c);
        this.longitudLado = longitudLado;
        //TODO Auto-generated constructor stub
    }


}
