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

       this.camara = new Rectangle(0,0,juego.getAnchuraPantalla(),juego.getAlturaPantalla());
    }

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
       Graphics g = consola.getCapaCanvas().getGraphics();
       
        g.drawImage(imagen,(int) camara.getX(), (int)camara.getY(),(int)camara.getWidth(),(int)camara.getHeight(),null);
        this.camara.translate(0,velocidadCamara);
        if(this.imagen.getHeight(null) < this.camara.getY()){
            camara.setLocation(0, 0);
        }
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        //No hacer nada
    }
    
}
