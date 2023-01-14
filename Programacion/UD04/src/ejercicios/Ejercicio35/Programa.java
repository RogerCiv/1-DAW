package ejercicios.Ejercicio35;

import bpc.daw.consola.Consola;

public class Programa {
    public static void main(String[] args) {
        Consola c = new Consola();
        Boligrafo b = new Boligrafo(c.getCapaTexto());

        //b.setColor(1);

        b.escribirGuay("hola");

        c.getTeclado().leerCaracter();
    }
}
