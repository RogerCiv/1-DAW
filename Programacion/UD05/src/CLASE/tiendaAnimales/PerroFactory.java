package CLASE.tiendaAnimales;

import java.util.Random;

public class PerroFactory {
    
    //Este metodo saca un numero aleatorio entre 0 y 1.
    //Si sale menor de 0.5, se devuelve un Perro cuyo nombre y raza
    //se saca aleatoramente de esta lista.
    // nombre -> "boby","max","luna","eros"
    // raza -> "bulldog", "golden", "setter", "labarador"
    // EL precio del perro(no abandonado) es aleatorio entre 200 y 1000
    // El precio del perro abandonado es de 
    // Si sale mayyor o igual de 0.5, se duelve  un PerroAbandonado cuyo
    // nombre y raza se sacan aleatoriamente de las listas anteriores.
    public static Perro generarPerroAleatorio(){

        String[] nombrePosibles = {"boby","max","luna","eros"};
        String[] razaPosibles = {"bulldog", "golden", "setter", "labarador"};
           
        Perro resultado = null;
        double tipo = Math.random();
        String nombre = nombrePosibles[new Random().nextInt(nombrePosibles.length)];
        String raza = razaPosibles[new Random().nextInt(razaPosibles.length)];

        if(tipo<0.5){
            //perro normal
            int precio = new Random().nextInt(200, 1000);
            resultado = new Perro(nombre, precio, raza);

        }else{
            //perro abandonado
            int precio = new Random().nextInt(100, 300);
            resultado = new PerroAbandonado(nombre, precio, raza);
        }
       return resultado;
    }
}
