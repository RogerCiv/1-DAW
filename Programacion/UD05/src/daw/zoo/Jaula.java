package daw.zoo;

public abstract class Jaula extends ContenedorAnimales{
    private int capacidadMaxima;
    private int pesoMaximo;

    public Jaula(int cm, int pm){
        this.capacidadMaxima = cm;
        this.pesoMaximo =pm;
    }

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public int getPesoMaximo() {
        return this.pesoMaximo;
    }

    
    protected boolean comprobarDisponibilidadPlaza(Animal a){
        boolean respuesta = false;
        
        if(getNumeroAnimales() < getCapacidadMaxima() && getPesoMaximo() < getPesoMaximo()){
            animales.add(a);
            respuesta = true;
        }
        return respuesta;
        
    }

    
}
