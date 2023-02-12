package Ejercicio22a24;

public class Jaula extends ContenedorAnimales{

    private int capacidadMaxima;
    private int pesoMaximo;

    public Jaula(int cm, int pm){
        super();
        this.capacidadMaxima = cm;
        this.pesoMaximo = pm;
    }


    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        // TODO Auto-generated method stub
      
        return this.getCapacidadMaxima() > this.getNumeroAnimales() && this.getPesoMaximo() > this.getPesoActual();
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }


    public int getPesoMaximo() {
        return pesoMaximo;
    }
    
}
