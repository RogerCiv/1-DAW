
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger
 */
public class Ejercicio53 {
    public static void main(String[] args) {
        Set<String> palabras = new HashSet<>();
        palabras.add("perro");
         palabras.add("gato");
         palabras.add("canario");
         palabras.add("hamster");
         palabras.add("pez");
         palabras.add("caballo");
         palabras.add("tortuga");
         palabras.add("loro");
         palabras.add("conejo");
         palabras.add("periquito");
         palabras.add("gallina");
         palabras.add("vaca");
         palabras.add("oveja");
         palabras.add("cerdo");
         palabras.add("cabra");
         
         for(String pal : palabras){
             System.out.println("La palabra es "+pal.toUpperCase()+" y su longitud es de "+pal.length()+" caracteres");
         }
    }
}
