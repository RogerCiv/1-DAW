package TREN;

public record Maleta(Persona dueño, int peso) implements Pesado{

    @Override
    public int getPeso() {
        // TODO Auto-generated method stub
        return this.peso;
    }
    
}
