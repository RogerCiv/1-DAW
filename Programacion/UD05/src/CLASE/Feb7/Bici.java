package CLASE.Feb7;

import java.awt.Color;

public class Bici extends Vehiculo{
  

    private boolean timbre;

    public Bici(Color c,boolean t) {
        super(1, 45, c);
        this.timbre = t;
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Bici [timbre=" + timbre + "]";
    }

    @Override
    public void mover(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println("La bice se mueve"+x +", "+y);
    }
}
