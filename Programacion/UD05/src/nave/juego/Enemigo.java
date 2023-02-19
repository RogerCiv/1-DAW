package nave.juego;

import java.awt.Image;

import nave.FrameworkDAW.SpriteGameObject;

public abstract class Enemigo extends SpriteGameObject{

    public Enemigo(Image img, int x, int y) {
        super(img, x, y);
        //TODO Auto-generated constructor stub
    }
    public abstract int getpuntuacion();
    
}
