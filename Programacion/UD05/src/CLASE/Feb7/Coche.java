package CLASE.Feb7;

import java.awt.Color;

public class Coche extends Vehiculo{




    private String matricula;
    private int potencia;



    public Coche(String m, int p, Color c,int numeroPasajeros) {
        super(numeroPasajeros, 120, c);
        this.matricula = m;
        this.potencia = p;
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", potencia=" + potencia + "]";
    }
    @Override
    public void mover(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println("El coche se mueve! "+x+" , "+y);
    }
    
    
}
