package nave.juego.img;

import nave.juego.CacheImagenes;
import nave.juego.Enemigo;

public class Enemigo2 extends Enemigo{
    private int centroX;
    private int centroY;
    private int radio;
    private double angulo;
    private double velocidad;

    public Enemigo2(int x, int y, int cx ,int cy, int r, int v){
        super(CacheImagenes.getInstancia().getImagen("../img/malo2.png"),x,y);
        this.centroX = cx;
        this.centroY= cy;
        this.radio = r;
        this.angulo = 0;
        this.velocidad =v;
    }

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
        this.angulo += this.velocidad;
        if(this.angulo >= 2*Math.PI){
            this.angulo = 0;
        }
       this.setX((int)(centroX+radio*Math.cos(angulo)));
       this.setY((int)(centroY+radio*Math.sin(angulo)));
    }

    @Override
    public int getpuntuacion() {
        // TODO Auto-generated method stub
        return (int) (3*this.velocidad);
    }
}
