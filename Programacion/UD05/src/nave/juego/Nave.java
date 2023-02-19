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
         
           this.setX(this.getX() - this.velocidad);
        }else if(t.teclaPulsada(teclaDerecha)){
            int nuevaD = this.getX() + this.velocidad;
            if(nuevaD > 0){
                this.setX(nuevaD);
            }
           
        }else if(t.teclaPulsada(teclaDisparo)){
            this.disparar();
        }
        
    }
}
