package clases.repaso.dic15;

import java.io.IOException;
import java.util.Random;

public class Impresora {
    private String marca;
    private boolean encendido;

    //Constructores
    private Impresora(String m, boolean e){
        marca = m;
        encendido= e;
    }

    public Impresora(String marca){
        this(marca,false);
    }

    public Impresora(){
        this("EPSON");
    }
    

    //Este metodo muestra el texto en pantalla solo si la impresora está encendida,
    //con una probabilidad del 50%. En caso de que la impresora este apagada se lanzara una IOException
    //con el mensaje "Impresora apagada". Si el mensaje no se imprime se lanzara una IOException
    // con el mensaje "no se puede imprimir el texto";


    public void imprimir(String texto) throws IOException{
        
        if(encendido){
            boolean aleatorio = new Random().nextBoolean();
            if(aleatorio){
                System.out.println(texto);
            }else{
                throw new IOException("no se puede imprimir el texto");
            }
        }else{
            throw new IOException("Impresora apagada");
        }
    }

    public void encender(){
        encendido=true;
    }


}
