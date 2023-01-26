package Ejercicio6y7;

public class TrabajadorTecleante extends Trabajador {
    private int pulsacionesMinuto;
    protected Teclado teclado;
    public TrabajadorTecleante(String nombre, int sueldo, int numDNI, char letraDNI, int ppm) {
        super(nombre, sueldo, numDNI, letraDNI);
        this.pulsacionesMinuto = ppm;
        //TODO Auto-generated constructor stub
    }
    public int getPulsacionesMinuto() {
        return pulsacionesMinuto;
    }
    public Teclado getTeclado() {
        return teclado;
    }
  
    public void setTeclado(Teclado t) {
        this.teclado = t;
    }
    
    
}
