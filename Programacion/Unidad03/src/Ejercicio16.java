
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
public class Ejercicio16 {

    public static void main(String[] args) {
        Consola c = new Consola();
       // Random random = new Random();
      /*  int r = random.nextInt(0, 255);
        int g = random.nextInt(0, 255);
        int b = random.nextInt(0, 255);

        int x = random.nextInt(0, 1200);
        int y = random.nextInt(0, 800);

        int d = random.nextInt(20, 300);
        int d2 = random.nextInt(20, 300);
*/
        for (int i = 1; i <= 8; i++) {

           /* Graphics capaG = c.getCapaCanvas().getGraphics();

            Color color = new Color(r, g, b);
            capaG.setColor(color);
            capaG.fillRect(x, y, d, d2);
*/
           
                Random random = new Random();
                Toolkit tools = Toolkit.getDefaultToolkit();
                Dimension medida = tools.getScreenSize();
                int medidaX = (int) medida.getWidth();
                int medidaY = (int) medida.getHeight();
                int r = random.nextInt(0, 255);
                int g = random.nextInt(0, 255);
                int b = random.nextInt(0, 255);
                int w = random.nextInt(10, 200);
                int h = random.nextInt(50, 400);
                int x = random.nextInt(0, medidaX);
                int y = random.nextInt(0, medidaY);
                c.getCapaTexto().cls();
                
                Graphics capaG = c.getCapaCanvas().getGraphics();
                Color col = new Color(r,g,b);
                capaG.setColor(col);
                capaG.fillRect(x, y, h, w);
        }
        c.getTeclado().leerCaracter();

    }
}
