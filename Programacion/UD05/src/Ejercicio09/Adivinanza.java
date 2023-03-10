package Ejercicio09;

import java.time.*;

public class Adivinanza {
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;

    public Adivinanza(String e, String rc){
        this.enunciado = e;
        this.respuestaCorrecta = rc;
        this.inicio = null;
    }

    public String getEnunciado() {
        this.inicio = Instant.now();
        return this.enunciado;
    }

    public void comprobar(String respuesta) throws AdivinanzaException{
       if(inicio !=null){
            if(respuesta.equalsIgnoreCase(respuestaCorrecta)){
                if(Duration.between(inicio, Instant.now()).getSeconds() > 30){
            
                    throw new TiempoSuperadoException();
                }else{
                System.out.println("Respuesta correcta!"); 
                }
            }else{
                throw new AdivinanzaIncorrectaException();
            }
       }
        
    
    }

}
