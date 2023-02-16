package Ejercicio22a24;

public class TransporteAnimales extends Jaula{




    public TransporteAnimales() {
        super(6,500);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        // TODO Auto-generated method stub
        boolean respuesta = false;
        if(this.getCapacidadMaxima() > this.getNumeroAnimales() && this.getPesoMaximo() > this.getPesoActual()){
            for(Animal i : animales){
                if(a.equals(i)){
                    respuesta = true;
                }
            }
        }
        return respuesta;
    }
    
}
