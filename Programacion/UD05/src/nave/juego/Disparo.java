package nave.juego;

import java.awt.Image;

import nave.FrameworkDAW.SpriteGameObject;

public class Disparo extends SpriteGameObject{
 
    private int idJugador;
    private int vx;
    private int vy;

    public Disparo(Image img, int x, int y, int id, int vx, int vy) {
        super(CacheImagenes.getInstancia().getImagen("./img/Disparo.png"), x, y);
        this.idJugador = id;
        this.vx = vx;
        this.vy = vy;
        //TODO Auto-generated constructor stub
    }
    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
        
        
    }
    
}
