
import bpc.daw.consola.*;

/**
 * Usa la Consola DAW para realizar un programa que muestre 20 veces por
 * pantalla la frase "En clase no se juega" cada una en renglón diferente. Las
 * veces impares se alinearán a la izquierda y las pares a la derecha.
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Consola c = new Consola();

        for (int i = 1; i < 20; i++) {
            if (i % 2 == 1) {

                c.getCapaTexto().print(i, 0, i + ") En clase no se juega");
            } else {
                c.getCapaTexto().print(i, 50, i + ") En clase no se juega");
            }

        }

        c.getTeclado().leerCaracter();
    }
}
