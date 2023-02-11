package TREN;

public abstract class Vagon implements Pesado{
    
    private Vagon vagonSiguiente;
    private Vagon vagonAnterior;

    public void enganchar(Vagon v){
        this.vagonSiguiente = v;
        this.vagonAnterior = this.vagonSiguiente;
    }

    public Vagon getVagonSiguiente() {
        return vagonSiguiente;
    }

    public Vagon getVagonAnterior() {
        return vagonAnterior;
    }

    public abstract int getPeso();

 
}
