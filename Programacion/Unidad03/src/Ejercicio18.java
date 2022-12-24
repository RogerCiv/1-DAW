
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;

/**
 * Usa la Consola DAW para realizar un programa que muestre 20 veces por
 * pantalla la frase "En clase no se juega" de forma que las primeras 10 veces
 * aparezcan pegadas a la izquierda y las siguientes 10 veces aparezcan pegadas
 * a la derecha.
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Consola c = new Consola();

        for (int i = 1; i < 21; i++) {
            if (i < 11) {

                c.getCapaTexto().print(i, 0, i + ") En clase no se juega");
            } else {
                c.getCapaTexto().print(i-10, 30, i + ") En clase no se juega");
            }

        }

        c.getTeclado().leerCaracter();
    }
}
