package nave.juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import nave.FrameworkDAW.Escena;
import nave.FrameworkDAW.GameObject;
import nave.FrameworkDAW.Juego;
import nave.FrameworkDAW.Resolucion;

public class JuegoNaves extends Escena{

    private List<Enemigo> enemigos;

    public List<Enemigo> getEnemigos(){
        return this.enemigos;
    }

    public static void main(String[] args){
       Juego partida = new Juego();
       partida.iniciar(new JuegoNaves(), Resolucion.VENTANA_FULLHD);
    }

    @Override
    protected void añadirObjetosIniciales() {
        // TODO Auto-generated method stub
        ControladorFinJuego cfg = new ControladorFinJuego();
        this.añadir(cfg);
        Fondo fondo = new Fondo(0);
        this.añadir(fondo);
        Nave nave1 = new Nave1(65, 68, 32, 0, 
        CacheImagenes.getInstancia().getImagen("./img/nave1.png"), 100, 1000);
        this.añadir(nave1);
        Nave nave2 = new Nave2(37, 29, 10, 0, 
        CacheImagenes.getInstancia().getImagen("./img/nave2.png"), 400, 1000);
        this.añadir(nave2);

        
        this.enemigos = new ArrayList<>();

        int x = new Random().nextInt((int)Resolucion.VENTANA_FULLHD.getResolucion().getWidth());
        int y = new Random().nextInt((int)Resolucion.VENTANA_FULLHD.getResolucion().getHeight());
        int v = new Random().nextInt(8);
        for(int i = 0; i<12 ; i++){
           Enemigo e = new Enemigo1(x, y, v);
           this.enemigos.add(e);
           this.añadir(e);
        }
        Marcador marcador = new Marcador();
        this.añadir(marcador);
       
    }
    @Override
    protected void añadir(GameObject obj){
        super.añadir(obj);
        if(obj instanceof Enemigo e){
            this.enemigos.add(e);
        }
    }
    @Override
    protected void retirar(GameObject obj){
        super.añadir(obj);
        if(obj instanceof Enemigo e){
            this.enemigos.remove(e);
        }
    }
    
}
