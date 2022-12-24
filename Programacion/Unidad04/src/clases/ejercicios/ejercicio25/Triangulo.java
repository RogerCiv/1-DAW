package clases.ejercicios.ejercicio25;

import java.awt.Point;

import clases.ejercicios.ejercicio06.Punto;

public class Triangulo {
    
    private Point a ;
    private Point b;
    private Point c;


    public Triangulo (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Point getPuntoMedio(Point p1, Point p2){
        Point pun1 = new Point(p1.x,p1.y);
        Point pun2 = new Point(p2.x,p2.y);
        return this.getPuntoMedio(pun1.getX()+pun2.getX()/2,pun1.getY()+pun2.getY());
    }
   

}
