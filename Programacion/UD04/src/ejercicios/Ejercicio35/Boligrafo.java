package ejercicios.Ejercicio35;

import bpc.daw.consola.CapaTexto;
import java.awt.Color;
import java.util.Random;
import java.util.StringTokenizer;

public class Boligrafo {

    private static final Color[] COLORES = { Color.red, Color.green, Color.white, Color.yellow };
    private int color;
    private CapaTexto ct;

    /*
     * El constructor crea un bolígrafo para escribir en la capa de texto que se
     * pasa como
     * parámetro. La propiedad “color” es la posición del color con el que se va a
     * dibujar,
     * dentro la lista COLORES. Inicialmente estará activado el color rojo.
     */
    public Boligrafo(CapaTexto ct) {
        this.color = 0;
        ct.setColorTexto(COLORES[0]);
    }

    /*
     * El método setColor recibe como parámetro el número de posición del color con
     * el que  se va a escribir el texto.
     */

     public void setColor(int n){
       ct.setColorTexto(COLORES[n]);
     }
     /*
      * El método escribir recibe un String y lo escribe en la capa de texto con el color activo 
 El método escribirGuay recibe un String y lo escribe en la capa de texto, usando u
      */

     public void escribir(String texto){
        ct.print(texto);
     }
     /*
      * El método escribirGuay recibe un String y lo escribe en la capa de texto, usando un 
color diferente de la lista de colores para cada letra. Los colores deberán rotarse. 
      */

      public void escribirGuay(String texto){
        /*Random r = new Random();
        
        
       for(StringTokenizer stringTokenizer = new StringTokenizer(texto);stringTokenizer.hasMoreTokens();){
            String letra = stringTokenizer.nextToken();
            int posicion = r.nextInt(0, COLORES.length);
            setColor(posicion);
            ct.print(letra);
       }
      }
      */
      
      for(int i = 0; i < texto.length(); i++){
           
            ct.(texto.charAt(i) + "", COLORES[i % COLORES.length]);
      }
}
