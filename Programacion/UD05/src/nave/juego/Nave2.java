package nave.juego;

import java.awt.Image;

public class Nave2 extends Nave{

    public Nave2(int ti, int de, int tdi, int v, Image imagen, int x, int y) {
        super(ti, de, tdi, 3, CacheImagenes.getInstancia().getImagen("./img/nave2.png"), 400, 1000);
        //TODO Auto-generated constructor stub
    }



    @Override
    public void realizarDisparo() {
        // TODO Auto-generated method stub
        Disparo d1 = new Disparo(CacheImagenes.getInstancia().getImagen("./img/Disparo.png"), 
        400, 1000, 1,-3,-3);
        Disparo d2 = new Disparo(CacheImagenes.getInstancia().getImagen("./img/Disparo.png"), 
        400, 1000, 1, 3,-3);
        
    }
    
}
