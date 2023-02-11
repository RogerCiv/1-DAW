package Ejercicio09;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
            
    Adivinanza a = new Adivinanza("Mejor ciudad del mundo?", "Granada");

    System.out.println(a.getEnunciado());
    String respuesta = new Scanner(System.in).nextLine();
    try{
        a.comprobar(respuesta);
    }catch(AdivinanzaException e){
        System.out.println(e.getMessage());
    }
    }
}
