package Ejercicio13a16;

import java.util.Random;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        GeneradorContraseñasArchivo g = new GeneradorContraseñasArchivo("D:/pass.txt");
        
        System.out.println(g.generarContraseña(10));

    }

}
