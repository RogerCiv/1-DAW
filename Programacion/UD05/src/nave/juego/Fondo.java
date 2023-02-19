package nave.juego;

import nave.FrameworkDAW.GameObject;
import java.awt.*;

import bpc.daw.consola.Consola;
public class Fondo extends GameObject{
    private Image imagen;
    private Rectangle camara;
    private int velocidadCamara;

    public Fondo(int vc){
        this.imagen = CacheImagenes.getInstancia().getImagen("./img/fondo.png");
    
        this.velocidadCamara = vc;
    }

    @Override
    public void inicializar() {
        // TODO Auto-generated method stub
        consola.getCapaFondo();

       this.camara = new Rectangle(0,0,0,0);
    }

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        //No hacer nada
    }
    
}
