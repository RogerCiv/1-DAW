
import bpc.daw.consola.Consola;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Usa la Consola DAW y las clases de Java Time para realizar un programa que
 * muestre en el centro de la pantalla la hora, minutos y segundos actuales.
 * Durante medio minuto, a cada segundo la pantalla se borrará y se volverá a
 * imprimir la hora actual, dando la apariencia de un reloj.
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        Consola c = new Consola();
        LocalTime hora = LocalTime.now();
        Toolkit tools = Toolkit.getDefaultToolkit();
        Dimension medida = tools.getScreenSize();
        int medidaX = (int) medida.getWidth();
        int medidaY = (int) medida.getHeight();

        int i = 0;
        for (i = 0; i <= 30; i++) {

            String horaLocal = hora.format(DateTimeFormatter.ofPattern("HH-mm-ss"));
            c.getCapaTexto().print(50, 50, horaLocal);
            c.getCapaTexto().cls();
             c.getCapaTexto().print(50, 50, horaLocal);
            if (i == 30) {
                String horaLocal2 = hora.format(DateTimeFormatter.ofPattern("HH-mm-ss"));
                c.getCapaTexto().print(50, 50, horaLocal2);
            }
        }
        c.getTeclado().leerCaracter();
    }
}
