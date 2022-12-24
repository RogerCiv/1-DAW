
import bpc.daw.consola.Consola;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

/**
 * Haz un programa que dibuje en la pantalla 8 rectángulos cuyas coordenadas,
 * dimensiones y color sean aleatorios.
 */
public class Ejercicio16b {

    public static void main(String[] args) {
        Consola c = new Consola();

        Graphics gra = c.getCapaCanvas().getGraphics();

        Random random = new Random();

        

        

        for (int i = 0; i < 8; i++) {
            
            Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension medidas = tool.getScreenSize();
        int medidaX = (int) medidas.getWidth();
        int medidaY = (int) medidas.getHeight();

        int r = random.nextInt(0, 255);
        int g = random.nextInt(0, 255);
        int b = random.nextInt(0, 255);
        int x = random.nextInt(0, medidaX);
        int y = random.nextInt(0, medidaY);
        int w = random.nextInt(100, 200);
        int h = random.nextInt(200, 400);
            Color color = new Color(r, g, b);
            gra.setColor(color);
            gra.fillRect(x, y, w, h);
        }
        
        c.getTeclado().leerCaracter();

    }
}
