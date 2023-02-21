package nave.juego;

import nave.FrameworkDAW.GameObject;


public class ControladorFinJuego extends GameObject{



    @Override
    public void inicializar() {
        // TODO Auto-generated method stub
        // No hacer nada
    }

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
        if(escena instanceof JuegoNaves ene){
            if(ene.getEnemigos().isEmpty()){
                escena.finalizar();
            }
        }
    
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        //No hacer nada
    }
    
}
