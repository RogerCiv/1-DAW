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
        moverX(vx);
        moverY(vy);
        if(vx <=0 && vy<=0 || vx > juego.getAnchuraPantalla() || vy > juego.getAlturaPantalla()){
            escena.finalizar();  
        }
       
        //List<JuegoNaves> listaEne = new ArrayList<>();
        getSprite().comprobarColision(getSprite());
        if(escena instanceof JuegoNaves enemigo){
            //List<Enemigo> prueba =  enemigo.getEnemigos();
          
            if(getSprite().comprobarColision(getSprite())){
                enemigo.getEnemigos().remove();
               
            }
        }
        
        
    }
    
}
