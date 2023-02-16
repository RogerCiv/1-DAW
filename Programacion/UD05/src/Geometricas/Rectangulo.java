package Geometricas;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;
public class Rectangulo    implements Centrable,Apoyable {
    protected Point esquinaSuperiorizquierda;
    protected Point esquinainferiorDerecha;
    private Color color;

    public Rectangulo(Point esi, Point eid, Color c){
        this.esquinaSuperiorizquierda = esi;
        this.esquinainferiorDerecha = eid;
        this.color = c;
    }

    @Override
    public Point getCentro() {
        // TODO Auto-generated method stub
        int x = (esquinaSuperiorizquierda.x + esquinainferiorDerecha.x) / 2;
        int y = (esquinaSuperiorizquierda.y + esquinainferiorDerecha.y) / 2;
        return new Point(x,y);
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
       return getLongitudBase() * getLongitudAltura();
    }

    @Override
    public int getPerimetro() {
        // TODO Auto-generated method stub
       
        return 2*(getLongitudBase() * getLongitudAltura());
    }

    @Override
    public void dibujar(Graphics g) {
        // TODO Auto-generated method stub
        g.drawRect(this.esquinaSuperiorizquierda.x,this.esquinaSuperiorizquierda.y ,getLongitudBase(), getLongitudAltura());
    }

    @Override
    public Color getColor() {
        // TODO Auto-generated method stub
        return this.color;
    }

    @Override
    public int getLongitudBase() {
        // TODO Auto-generated method stub
        return this.esquinainferiorDerecha.x - esquinaSuperiorizquierda.x;
    }

    @Override
    public int getLongitudAltura() {
        // TODO Auto-generated method stub
        return esquinaSuperiorizquierda.y - esquinainferiorDerecha.y;
    }


}
