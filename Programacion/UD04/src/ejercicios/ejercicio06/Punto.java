package ejercicios.ejercicio06;

import java.awt.Toolkit;

public class Punto {
    public int x;
    public int y;

    // El primer constructor crea un punto situado en las coordenadas (0,0)
    public Punto() {

    }

    // l segundo constructor crea un punto situado en las coordenadas (x,y). Si las
    // coordenadas caen fuera de la pantalla (utiliza la clase Toolkit de la
    // librería Java 2D para
    // 25 obtener el tamaño de la pantalla), el punto se pondrá en la esquina
    // inferior derecha de
    // la pantalla.

    public Punto(int x, int y) {
        Toolkit tool = Toolkit.getDefaultToolkit();
        int ancho = tool.getScreenSize().width;
        int alto = tool.getScreenSize().height;

        if (x > ancho) {
            x = ancho;
        } else {
            this.x = x;
        }
        if (y > alto) {
            y = alto;
        } else {
            this.y = y;
        }
    }

    // El tercer constructor crea un punto situado en el punto medio del origen
    // (0,0) y el
    // punto pasado como parámetro. Observa la imagen adjunta para ver lo que se
    // pide.
    public Punto(Punto p) {
        this(p.x / 2, p.y / 2);
    }

    // El cuarto constructor crea un punto situado a un ángulo y distancia del
    // origen, según
    // se indica la imagen adjunta. (Sugerencia: usa la definición de seno y coseno
    // para
    // obtener el valor de las coordenadas x e y
    public Punto(double angulo, double distancia) {
        this((int) (distancia * Math.cos(angulo)),
                (int) (distancia * Math.sin(angulo)));
    }
}
