package nave.juego;

import java.awt.Image;

public class Enemigo2 extends Enemigo{
    private int centroX;
    private int centroY;
    private int radio;
    private double angulo;
    private double velocidad;

    public Enemigo2( int x, int y,int cx, int cy, int r, int v) {
        super(CacheImagenes.getInstancia().getImagen("./img/malo2.png"), x, y);
        this.centroX = cx;
        this.centroY = cy;
        this.radio = r;
        this.velocidad = v;
        this.angulo = 0;
        
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub

        if((this.angulo = this.velocidad)>= 2*Math.PI){
            this.angulo = 0;
        }else{
            this.angulo = this.velocidad;
        }
        moverX((int)Math.cos(this.centroX));
        moverY((int)Math.sin(this.centroY));
    }

    @Override
    public int getpuntuacion() {
        // TODO Auto-generated method stub
        return  (int)(3*this.velocidad);
    }
    
}
