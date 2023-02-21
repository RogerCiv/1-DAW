package nave.FrameworkDAW;

import bpc.daw.consola.*;
import java.awt.*;

public abstract class SpriteGameObject extends GameObject{
    private Sprite sprite;
    private Image imagen;
    private Point puntoInicial;
    
    public SpriteGameObject(Image img, int x, int y){
        this.imagen = img;
        this.sprite = null;
        this.puntoInicial = new Point(x,y);
        
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        Consola c = new Consola();
        c.getCapaSprites().eliminarSprite(this.sprite);
        
    }

    @Override
    public void inicializar() {
        // TODO Auto-generated method stub
     //   Consola c = new Consola();
        this.sprite =  consola.getCapaSprites().crearSprite(this.imagen, new Rectangle(0, 0, getAnchura(), getAltura()),
       puntoInicial.x, puntoInicial.y);
     
    }
    public int getX(){
        return this.puntoInicial.x;
    }
    public int getY(){
        return this.puntoInicial.y;
    }
    public int getAnchura(){
        return this.imagen.getWidth(null);
    }
    public int getAltura(){
        return this.imagen.getHeight(null);
    }
    public void moverX(int cx){
        this.sprite.moverX(cx);
    }
    public void moverY(int cy){
        this.sprite.moverY(cy);
    }
    public void setX(int x){
        int difX = x - getX();
       this.sprite.moverX(difX);
    }
    public void setY(int y){
        int difY = y - getY();
        this.sprite.moverY(difY);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public Image getImagen() {
        return imagen;
    }

    public Point getPuntoInicial() {
        return puntoInicial;
    }
}
