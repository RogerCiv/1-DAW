package nave.FrameworkDAW;
import bpc.daw.consola.*;
public class Juego {
    private Consola consola;
    private Escena escena;
    private boolean detener;
    private Resolucion resolucion;

    public void iniciar(Escena e, Resolucion r){
      this.consola = new Consola();
      this.resolucion = r;
      this.setEscena(e);
      this.detener = false;

      while(!detener){
        consola.esperarSiguienteFrame();
        escena.ejecutarFrame();
        
        if(this.consola.getTeclado().teclaPulsada(27)){
          this.detener = true;
        }
      }

    }

    public void setEscena(Escena e){
        
        this.escena = e;
        this.escena.juego = this;
        this.escena.consola = this.consola;
        this.escena.inicializar();

    }

    public void detener(){
      this.detener = true;

    }
    public int getAnchuraPantalla(){
      return (int) this.resolucion.getResolucion().getWidth();
    }
    public int getAlturaPantalla(){
      return (int) this.resolucion.getResolucion().getHeight();
    }
}
