
import java.util.Scanner;

/**
 * Realiza un programa que pregunte al usuario una palabra y cree una variable
 * de tipo char llamada letraCentral inicializada con cualquier valor. A
 * continuación, se usará el switch mejorado para hacer lo siguiente:  Si la
 * palabra tiene un número impar de letras, se guardará en letraCentral el
 * carácter de su posición central.  Si la palabra tiene un número par de
 * letras, el programa preguntará al usuario: “hay dos posibles letras
 * centrales. ¿Quieres la de la izquierda (i) o la de la derecha (d)?” Si el
 * usuario elige “i” o “I”, se guardará en letraCentral la letra cuya posición
 * pega a la izquierda del centro de la palabra. Si se elige “d” o “D” se
 * guardará en letraCentral la letra cuya posición pega a la derecha del centro
 * de la palabra. Ejemplos: o Si elegimos “ADIOS”, como hay cantidad impar de
 * letras, guardamos en letraCentral la letra I o Si elegimos “HOLA”, hay dos
 * posibles letras centrales, que serían la O (la que pega a la izquierda) y la
 * L (la que pega a la derecha)
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        System.out.println("Escribe una palabra");
        String palabra = new Scanner(System.in).nextLine();

        int cantidad = palabra.length();
        char letraCentral = 'A';

        switch (cantidad % 2) {

            case 1 -> {
                letraCentral = palabra.charAt(cantidad / 2);
                System.out.println("La palabra es impar, su letra central es " + letraCentral);

            }
            case 0 -> {
                System.out.println("Es par, hay dos posibles letras centrales. Quieres la de la izquierda(i) o derecha[d]?");
                String opcion = new Scanner(System.in).nextLine();
                
                    switch(opcion){
                        case "d" ->{
                            letraCentral = palabra.charAt(cantidad / 2);
                            System.out.println(" La palabra es par y has elegido la derecha "+letraCentral);
                        }
                        case "i" ->{
                            letraCentral = palabra.charAt((cantidad /2)-1);
                            System.out.println("La palabra es par y has elegido izquierda "+letraCentral);
                        }
                        
                    }
            }
        }

    }

}
