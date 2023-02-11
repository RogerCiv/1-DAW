package TREN;

public class Locomotora extends Vagon{

    public Locomotora(){
        super();
    }

    public int getNumeroVagonesTren(){
        int total = 0;
        while(getVagonSiguiente() instanceof Vagon v){
            total++;
        }
        return total;
    }

    public int getPesoTren(){
        int peso = 0;
        while(getVagonSiguiente() instanceof Vagon ){
            if(getVagonSiguiente() instanceof Vagon v){
                 peso += v.getPeso(); 
            }
        }
        return peso;
    }

    public void arrancar(){
        if(getPesoTren()<145600){
            System.out.println("Tren en marcha");
        }else{
            throw new IllegalArgumentException("La locomotora no puede tirar del tren");
        }
    }
    @Override
    public void enganchar(Vagon v){
        if(v instanceof Locomotora){
            throw new IllegalArgumentException("Solo puede haber una locomotora");
        }
        super.getVagonAnterior().enganchar(v);
        super.getVagonSiguiente().enganchar(v);
       
    }

    @Override
    public int getPeso() {
        // TODO Auto-generated method stub
        return 76400;
    }
    
}
