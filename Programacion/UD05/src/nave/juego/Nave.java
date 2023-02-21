package nave.juego;

import java.time.Duration;
import java.time.Instant;
import bpc.daw.consola.*;
import nave.FrameworkDAW.SpriteGameObject;

import java.awt.*;
public abstract class Nave extends SpriteGameObject{
    private int teclaIzquierda;
    private int teclaDerecha;
    private int teclaDisparo;
    private int velocidad;
    private Instant ultimoDisparoRealizado;

    public Nave(int ti, int tde, int tdi, int v, Image imagen, int x,int y){
        super(imagen, x, y);
        this.teclaIzquierda = ti;
        this.teclaDerecha = tde;
        this.teclaDisparo = tdi;
        this.velocidad = v;
        this.ultimoDisparoRealizado = Instant.now();
    }

    public void disparar(){
        Duration difTiempo = Duration.between(ultimoDisparoRealizado, Instant.now());
        if(difTiempo.getSeconds() > 1){
            this.ultimoDisparoRealizado =Instant.now();
            realizarDisparo();
        }
    }
    public abstract void realizarDisparo();

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
       /*
       Consola c = new Consola();
        Teclado t = c.getTeclado();
       */ 
        Teclado t = consola.getTeclado();
    
        
        if(t.teclaPulsada(teclaIzquierda)){
            //Toolkit.getDefaultToolkit().getScreenSize().getWidth() --- version antigua y mal.
           if(this.getX() - this.velocidad > 0 && this.getX() - this.velocidad < juego.getAnchuraPantalla()){
            this.setX(this.getX()-this.velocidad);
           }
           
        }else if(t.teclaPulsada(teclaDerecha)){
            int nuevaD = this.getX() + this.velocidad;
            if(nuevaD > 0 && nuevaD < juego.getAnchuraPantalla()){
                this.setX(nuevaD);
            }
           
        }else if(t.teclaPulsada(teclaDisparo)){
            this.disparar();
        }
        
    }

    public int getTeclaIzquierda() {
        return teclaIzquierda;
    }

    public int getTeclaDerecha() {
        return teclaDerecha;
    }

    public int getTeclaDisparo() {
        return teclaDisparo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Instant getUltimoDisparoRealizado() {
        return ultimoDisparoRealizado;
    }
}
