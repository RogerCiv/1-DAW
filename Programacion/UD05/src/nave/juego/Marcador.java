package nave.juego;
import java.awt.*;
import bpc.daw.consola.Consola;
import nave.FrameworkDAW.GameObject;

public class Marcador extends GameObject{

    private int[] puntos;

    public Marcador(){
       this.puntos = new int[2];
    }

    public void incrementarPuntos(int jugador, int puntos){
        if(puntos < 0){
            throw new IllegalArgumentException("La puntuacion no puede ser negativa");
        }
        this.puntos[jugador] += puntos;
    }

    @Override
    public void inicializar() {
        // TODO Auto-generated method stub
        this.puntos[0] = 0;
        this.puntos[1] = 0;
    }

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
             
        Graphics g  = consola.getCapaCanvas().getGraphics();
        g.setColor(Color.BLACK);
        g.drawString("Puntos ----- > Jugador 1 : "+this.puntos[0]+" Jugador 2: "+this.puntos[1], 20, 5);
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        //No hacer nada
    }


    
}
