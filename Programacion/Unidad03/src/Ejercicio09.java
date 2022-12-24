
import bpc.daw.consola.Consola;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

/**
 * Usa la Consola DAW para realizar un programa que pregunte al usuario
 * "¿Cuántos círculos desea dibujar?". El usuario escribirá un número entero (si
 * el número es incorrecto o negativo, el programa dirá "Número incorrecto" y
 * finalizará sin hacer nada más) y la pantalla se borrará y se dibujarán tantos
 * círculos como haya indicado el usuario. Cada círculo tendrá un color con
 * valores RGB aleatorios entre 0 y 255, y sus coordenadas también serán
 * aleatorias entre (0,0) y la resolución de la pantalla
 */
public class Ejercicio09 {

    public static void main(String[] args) {

        Consola c = new Consola();

        c.getCapaTexto().println("Cuantos circulos desea dibujar?:");
        int num = c.getTeclado().leerNumeroEntero();

        if (num < 0) {
            c.getCapaTexto().println("Numero incorrecto, pulsa tecla para salir");
            c.getTeclado().leerCaracter();
        } else {
            //boolean repetir = true;
            int contador = 0;
            
            while (contador != num) {
                Random random = new Random();
                Toolkit tools = Toolkit.getDefaultToolkit();
                Dimension medida = tools.getScreenSize();
                int medidaX = (int) medida.getWidth();
                int medidaY = (int) medida.getHeight();
                int r = random.nextInt(0, 255);
                int g = random.nextInt(0, 255);
                int b = random.nextInt(0, 255);
                int x = random.nextInt(0, medidaX);
                int y = random.nextInt(0, medidaY);
                c.getCapaTexto().cls();
                
                Graphics capaG = c.getCapaCanvas().getGraphics();
                Color col = new Color(r,g,b);
                capaG.setColor(col);
                capaG.fillOval(x, y, 80, 80);
                contador++;
               
            }
             c.getTeclado().leerCaracter();
        }

    }

}

