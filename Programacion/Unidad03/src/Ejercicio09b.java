
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
 * aleatorias entre (0,0) y la resolución de la pantalla.
 */
public class Ejercicio09b {

    public static void main(String[] args) {
        Consola c = new Consola();
        Graphics gra = c.getCapaCanvas().getGraphics();

        Random random = new Random();
        c.getTeclado().setTipoCursor(c.getTeclado().CURSOR_NULO);
        c.getCapaTexto().println("Cuantos circulos desea dibujar?");
        int num = c.getTeclado().leerNumeroEntero();

        if (num > 0) {
            int contador = 0;

            while (contador != num) {

                Toolkit tools = Toolkit.getDefaultToolkit();
                Dimension medida = tools.getScreenSize();
                int medidaX = (int) medida.getWidth();
                int medidaY = (int) medida.getHeight();
                int x = random.nextInt(0, medidaX);
                int y = random.nextInt(0, medidaY);
                int r = random.nextInt(0, 255);
                int g = random.nextInt(0, 255);
                int b = random.nextInt(0, 255);
                c.getCapaTexto().cls();
                Color color = new Color(r, g, b);
                gra.setColor(color);
                gra.fillOval(x, y, 80, 80);
                contador++;

            }
        } else {
            c.getCapaTexto().println("Numero incorrecto");
        }

        c.getTeclado().leerCaracter();
    }
}
