package nave.juego;

import java.awt.Image;

import nave.FrameworkDAW.*;

public class Nave1 extends Nave{

    public Nave1(int ti, int de, int tdi, int v, Image imagen, int x, int y) {
        super(ti, de, tdi, 5,CacheImagenes.getInstancia().getImagen("./img/nave1.png"), 100, 1000);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void realizarDisparo() {
        // TODO Auto-generated method stub
        Disparo d = new Disparo(CacheImagenes.getInstancia().getImagen("./img/Disparo.png"),
         100, 1000, 0, 0, -10);
         //añadir(d);
       
       
    }
    
}
