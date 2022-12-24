package clases.ejercicios.ejercicio30;

public class Altavoz {
    // Las constantes VOL_MIN y VOL_MAX indican los valores mínimo y máximo que
    // puede
    // tener cualquier altavoz. Estos valores se deberán inicializar a 0 y 255
    // respectivamente.
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;

    private int volumen;

    // La propiedad de instancia volumen indica el volumen del altavoz.
    public Altavoz() {
        volumen = 0;
    }

    // El método ponerVolumenMaximo pone el altavoz al máximo de su volumen
    public void ponerVolumenMaximo() {
        this.volumen = VOL_MAX;
    }

    // El método setVolumen pone el altavoz al nivel pasado como parámetro
    public void setVolumen(int v) {
        /*
         * if (v < VOL_MIN) {
         * volumen = VOL_MIN;
         * } else if (v > VOL_MAX) {
         * volumen = VOL_MAX;
         * } else {
         * volumen = v;
         * }
         */
        volumen = v < VOL_MIN ? VOL_MIN
                : v > VOL_MAX ? VOL_MAX : v;
    }
    // El método getVolumen devuelve el volumen del altavoz.

    public int getVolumen() {
        return volumen;
    }

    // El método toString devuelve un String con este formato: entre corchetes se ve
    // el
    // volumen, y luego se ve una barra formada por un total de 10 asteriscos y
    // guiones que
    // indican de forma gráfica el tanto por ciento del volumen del altavoz sobre su
    // máximo.
    // Ejemplo: [127] *****-----

    public String toString() {
        StringBuilder respuesta = new StringBuilder();
        respuesta.append("[" + volumen + "] ");
        int numAsteriscos = (int) Math.round(((double) volumen / VOL_MAX) * 10);
        for (int i = 0; i < numAsteriscos; i++) {
            respuesta.append("*");
        }
        for (int i = 0; i < 10 - numAsteriscos; i++) {
            respuesta.append("-");
        }
        return respuesta.toString();
    }
}
