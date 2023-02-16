package daw.zoo;

public class TransporteAnimales extends Jaula{

    public TransporteAnimales() {
        super(6, 500);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a){
        boolean respuesta = false;
        if(getNumeroAnimales() < this.getCapacidadMaxima() && getPesoActual() < this.getPesoMaximo()){
            if(a instanceof Leon l){
                animales.add(l);
                respuesta = true;
            }else{
                animales.add(a);
                respuesta = true;
            }
        }

        return respuesta;
    }
    
}
