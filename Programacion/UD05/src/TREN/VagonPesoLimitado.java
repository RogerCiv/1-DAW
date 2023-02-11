package TREN;

public abstract class VagonPesoLimitado extends Vagon{
    private int pesoMaximo;
        
   

    public VagonPesoLimitado(int pm){
       super();
    }

    public int getPesoMaximo() {
        return this.pesoMaximo;
    }

    
    

    
    protected boolean comprobarPesoMaximoExcedido(){
        boolean respuesta = true;
        if(getPeso()> getPesoMaximo()){
            throw new IllegalArgumentException("Se ha superado el peso maximo");
            
        }
        return respuesta;
    }
    
   
}
