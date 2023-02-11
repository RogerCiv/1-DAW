package CLASE.Feb7;

import java.awt.Color;
//No podemos usar new para crear un objeto de una clase abstracta.
// Prohibido Vehiculo v = new Vehiculo();
//Para obtener un objeto de una clase abstracta tendremos que hacer 
//CLASES HIJAS y usar abstraccion.
public class Programa {
    public static void main(String[] args) {
        Vehiculo v = new Coche("1111aaa",200,Color.red,4);
        Vehiculo b = new Bici(Color.BLUE, true);
        v.mover(10, 10);
        b.mover(20, 20);
        System.out.println(v.toString());
        System.out.println(b.toString());
    }
}
