package Ejercicio6y7;

import java.time.LocalDateTime;

public class Administrativo extends TrabajadorTecleante{

    public Administrativo(String n, int s, int ndni, char ldni, int ppm) {
        super(n, s, ndni, ldni, ppm);
        //TODO Auto-generated constructor stub
    }
    
    public void escribirInforme(String t){
        LocalDateTime fecha = LocalDateTime.now();
        teclado.escribirTexto(t+fecha);
    }
}
