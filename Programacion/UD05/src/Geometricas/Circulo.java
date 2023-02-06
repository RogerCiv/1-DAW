package Geometricas;
import java.awt.*;
public class Circulo  implements Centrable,FiguraGeometrica{
    private Point centro;
    private int radio;
    private Color color;

    public Circulo(Point centro, int radio, Color color){
        this.centro = centro;
        this.radio = radio;
        this.color = color;
    }

    @Override
    public Point getCentro() {
        // TODO Auto-generated method stub
        return this.centro;
    }

    @Override
    public Color getColor() {
        // TODO Auto-generated method stub
        return this.color;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public int getPerimetro() {
        // TODO Auto-generated method stub
        return (int) (2 * Math.PI * radio);
    }

    @Override
    public void dibujar(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(color);
        g.fillOval(radio, radio, radio, radio);
    }

 
}
