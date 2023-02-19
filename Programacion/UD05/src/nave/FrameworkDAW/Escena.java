package nave.FrameworkDAW;
import java.util.ArrayList;
import java.util.List;

import bpc.daw.consola.*;

public abstract class Escena implements ElementoJuego{
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> objetos;
    
    public Escena(){

    }
    protected abstract void añadirObjetosIniciales();

    protected void añadir(GameObject obj){
        obj.juego =this.juego;
        obj.consola = this.consola;
        obj.escena = this;
        obj.inicializar();
    }

    protected void retirar(GameObject obj){
        obj.finalizar();
        this.objetos.remove(obj);
        obj.consola = null;
        obj.escena = null;
    }

    
    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
        for(int i =0; i<this.objetos.size(); i++){
            this.objetos.get(i).ejecutarFrame();
        }
        
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        for(GameObject i : objetos){
            this.objetos.remove(i);
        }
        
    }

    @Override
    public void inicializar() {
        // TODO Auto-generated method stub
        if(this.consola == null  || this.juego == null){
            throw new IllegalStateException("ha que añadir la escena al juego para poder inicializarla");
        }
        this.objetos = new ArrayList<>();
        this.añadirObjetosIniciales();
        
    }


}
