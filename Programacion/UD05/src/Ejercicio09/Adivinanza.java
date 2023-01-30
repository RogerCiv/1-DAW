package Ejercicio09;

import java.time.Instant;

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
        return this.enunciado;
    }

    public void comprobar(String respuesta) throws AdivinanzaException{
       // Instant ahora = Instant.now();
        //Instant treinta = ahora.plusSeconds(30);
        if(respuesta.equalsIgnoreCase(respuestaCorrecta)){
            if(Instant.now().isAfter(Instant.now().plusSeconds(31))){
                throw new TiempoSuperadoException("Han pasado más de 30 segundos sin responder.");
            }
        }else{
            throw new AdivinanzaIncorrectaException("Respuesta incorrecta");
        }
    }

}
