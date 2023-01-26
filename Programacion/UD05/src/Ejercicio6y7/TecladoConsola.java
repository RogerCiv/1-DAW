package Ejercicio6y7;

import bpc.daw.consola.CapaTexto;

public class TecladoConsola implements Teclado{
    private CapaTexto ct;

    public TecladoConsola(CapaTexto ct){
        this.ct = ct;
    }

    @Override
    public void escribirTexto(String mensaje) {
        ct.print(mensaje);
        
    }
}
