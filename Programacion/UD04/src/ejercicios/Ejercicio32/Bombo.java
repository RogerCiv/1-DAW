package ejercicios.Ejercicio32;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Bombo {
    private Queue<Bola> bolas;

    //El constructor creará una ArrayDeque<Bola> para inicializar la propiedad “bolas”. A
    //continuación, le añadirá la cantidad de bolas indicada como parámetro. Cada bola
    //tendrá un número aleatorio entre 1 y 100. No importa que se repitan los números de
    //las bolas.
    public Bombo(int totalBolas){
        bolas = new ArrayDeque<Bola>();
        for(int i = 0; i <totalBolas; i++){
            bolas.add(new Bola(new Random().nextInt(0,100)));
        }
    }
    
    //El método getNúmeroBolas devolverá la cantidad de bolas que hay en el bombo.
    public int getNumeroBolas(){
        return bolas.size();
    }
    //El método sacarBola devuelve un objeto Bola con la siguiente bola de la cola, o null si no queda
    //ninguna bola en el bombo.
    public Bola sacarBola(){
        return bolas.poll();
    }
}