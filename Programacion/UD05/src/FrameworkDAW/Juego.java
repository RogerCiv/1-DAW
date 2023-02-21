package FrameworkDAW;
import bpc.daw.consola.*;
public class Juego {
    private Consola consola;
    private Escena escena;
    private boolean detener;
    private Resolucion resolucion;

    public void iniciar(Escena e, Resolucion r){
      Consola c = new Consola("Pantalla",r,e);
      this.resolucion = r;
      this.setEscena(e);
      this.detener = false;

      while(detener=false || consola.getTeclado().teclaPulsada(27)){
       
        consola.esperarSiguienteFrame();
      }

    }

    public void setEscena(Escena e){
        this.escena = e;
    }

    public void detener(){

    }
    public int getAnchuraPantalla(){

    }
    public int getAlturapantalla(){

    }
}
