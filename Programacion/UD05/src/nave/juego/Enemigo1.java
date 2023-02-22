package nave.juego;



public class Enemigo1 extends Enemigo{
    private int velocidad;

    public Enemigo1( int x, int y, int v) {
        super(CacheImagenes.getInstancia().getImagen("./img/malo1.png"), x, y);
        this.velocidad = v;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ejecutarFrame() {
        // TODO Auto-generated method stub
      
       // this.moverX(this.velocidad);
       //this.juego.getAnchuraPantalla();
        if(this.getX()>=this.getAnchura()){
            this.moverX(-this.velocidad);
        }else{
            this.moverX(this.velocidad);
        }
    }

    @Override
    public int getpuntuacion() {
        // TODO Auto-generated method stub
        return 2*this.velocidad;
    }
}
