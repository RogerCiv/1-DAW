package CLASE.JuegoNaves;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Nave player1 = null;
        System.out.println("""
                Elige la nave.
                1. Nave A.
                2. Nave B.
                3. Nave C.
                """);
        int opcion = new Scanner(System.in).nextInt();

        player1 = switch (opcion) {
            case 1 -> new NaveA();
            case 2 -> new NaveB();
            case 3 -> new NaveC();
            default -> throw new IllegalArgumentException("Opcion no valida.");
        };

        //============================================================
        // || A PARTIR DE ESTE MOMENTO, EL PROGRA ES INDEPENDIENTE
        // || DEL TIPO DE NAVE ELEGIDO.
        // ===========================================================

        // No sabemos que hace lo siguiente hasta el momento de elegir la nave.
        player1.disparar();
        player1.poderEspecial();
        
    }

}
