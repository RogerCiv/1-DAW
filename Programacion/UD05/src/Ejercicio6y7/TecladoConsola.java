package Ejercicio6y7;

import bpc.daw.consola.CapaTexto;

public class TecladoConsola implements Teclado{

    //Es una implementación de teclado que tiene como propiedad la capa de texto de una Consola DAW creada por el programa. En esta clase el método
    //“escribirTexto” se programa escribiendo el texto en la capa de texto que tenemos en la propiedad.
    private CapaTexto ct;

    public TecladoConsola(CapaTexto ct){
        this.ct = ct;
    }

    @Override
    public void escribirTexto(String mensaje) {
        ct.print(mensaje);
        
    }
}
