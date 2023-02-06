package Geometricas;
import java.awt.*;

import javax.imageio.ImageIO;
public interface FiguraGeometrica extends Coloreable{
    public double getArea();
    public int getPerimetro();
    public void dibujar(Graphics g);

    public default Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda){
        double lado = Math.sqrt(getArea());
        int x = esquinaSuperiorIzquierda.x;
        int y = esquinaSuperiorIzquierda.y;
        
        g.dibujar(g.drawRect(x, y, (int) lado, (int) lado));
        
    }
}
