package clases.ejercicios.ejercicio03;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class MarcadorBaloncesto {
    //Ejercicio 15, poner las propiedades en privado
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;

    /*
     * El primer constructor crea un marcador que recibe los nombres del equipo
     * local y
     * visitante, ambos tienen 0 puntos y se juega en la fecha actual.
     */
    public MarcadorBaloncesto(String nL, String nV) {
        this(nL, 0, nV, 0, LocalDate.now());
    }

    /*
     * El segundo constructor crea un marcador que recibe los nombres del equipo
     * local y
     * visitante, ambos tienen 0 puntos y se juega en la fecha recibida como
     * parámetro.
     */
    public MarcadorBaloncesto(String nL, String nV, LocalDate f) {

        this(nL, 0, nV, 0, f);
    }

    public MarcadorBaloncesto(String nL, int pL, String nVi, int pV, LocalDate fecha) {
        nombreLocal = nL;
        nombreVisitante = nVi;
        puntosLocal = pL;
        puntosVisitante = pV;
        this.fecha = fecha;

    }

    // ejercicio 09

    /*
     * añadirCanasta: Si recibe una L, añade los puntos indicados al local. Si
     * recibe una V, los
     * añade al visitante. Solo se añadirán los puntos que sean 1,2 o 3.
     */

    public void añadirCanasta(char equipo, int puntos) {
        if (puntos == 1 || puntos == 2 || puntos == 3) {
            if (equipo == 'L') {
                puntosLocal += puntos;
            } else if (equipo == 'V') {
                puntosVisitante += puntos;
            }

        }

    }

    // reset: Hace que el marcador se vuelva a poner a 0.

    public void reset() {
        puntosLocal = 0;
        puntosVisitante = 0;
    }

    //Ejercicio 15

    //getPuntosLocal y getPuntosVisitante devuelven los puntos de los respectivos equipos

    public int getPuntosLocal(){
        return puntosLocal;
    }
    public int getPuntosVisitante(){
        return puntosVisitante;
    }

    //ganaLocal, ganaVisitante y hayEmpate devuelven true según esté ganando el equipo
    //local, el visitante, o ambos equipos tengan los mismos puntos

    public boolean ganaLocal(){
       /*  boolean respuesta = false;
        if(puntosLocal>puntosVisitante){
            respuesta = true;
        }
        return respuesta;*/
        return this.puntosLocal>this.puntosVisitante;
    }
    public boolean ganaVisitante(){
        /*boolean respuesta = false;
        if(puntosVisitante>puntosLocal){
            respuesta = true;
        }
        return respuesta;*/
        return this.puntosVisitante>this.puntosLocal;
    }

    public boolean hayEmpate(){
        /*boolean respuesta = false;
        if(puntosLocal==puntosVisitante){
            respuesta = true;
        }
        return respuesta;*/
        return this.puntosLocal==this.puntosVisitante;
    }

    // ejercicio 19
    //guardar: Escribe en el archivo de texto cuya ruta se pasa como parámetro el nombre
    //del equipo local, sus puntos, el nombre del equipo visitante y sus puntos.
    public void guardar(String ruta) throws IOException{

        PrintWriter file = new PrintWriter(ruta);
        file.println("Equipo Local: "+nombreLocal+" Puntos: "+getPuntosLocal());
        file.println("Equipo Visitante: "+nombreVisitante+" Puntos: "+getPuntosVisitante());
        file.close();

    }

    //Ejercicio 20

}
