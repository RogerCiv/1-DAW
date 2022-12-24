
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio49b {

    public static void main(String[] args) {
        String[] disponibles = {"HOLA", "PERRO", "GATO", "LEON", "LORO", "WALABI"};

        int vidas = 4;
        List<String> palabras = new ArrayList<>();

        for (String pal : disponibles) {
            palabras.add(pal);
        }
        Collections.shuffle(palabras);

        boolean repetir = true;
        String palabra = null;
        for (int i = 0; repetir; i++) {
            palabra = palabras.get(i);
            palabras.remove(palabra);

            int size = palabra.length();

            boolean[] bool = new boolean[size];

            List<Character> letras = new ArrayList<>();

            for (int j = 0; j < palabra.length(); j++) {

                char letra = palabra.charAt(j);

                letras.add(letra);
            }
                String vistaUsuario = null;
                char guion = '-';
                
                for (int k = 0; k < bool.length; k++) {

                    vistaUsuario += guion;

                }
                
             for(int l = 0; l<palabra.length(); l++){
                 System.out.println("Introduce una letra:");
                 char letra = new Scanner(System.in).nextLine().charAt(0);
                 
                 int posicion = 0 ;
                 if(letras.contains(letra)){
                     
                     posicion = letras.indexOf(letra);
                     bool[l]=true;
                 }
             }
                

            }

        
    }
}