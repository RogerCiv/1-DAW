package TREN;

public abstract class VagonPesoLimitado extends Vagon{
    private int pesoMaximo;
        
   

    public VagonPesoLimitado(int pm){
       //super();
       if(pm<=0){
        throw new IllegalArgumentException("El peso maximo debe ser positivo");
       }
       this.pesoMaximo = pm;
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
