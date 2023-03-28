
import java.util.ArrayList;
import java.util.List;
/// Algunas lambdas se pueden acortar

public class EjerciciosFuncional {
    public static void main(String[] args) {
        
        List<String> frases = new ArrayList<>();
        frases.add("hola");
        frases.add("adios");
        frases.add("viernes");
        frases.add("vacaciones");
        
        // muestra por pantalla en renglones diferente cada palabra de la lista
        
        for(String i : frases){
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("AHORA MODO FUNCIONAL");
        System.out.println("");
        frases.forEach(f -> System.out.println(f));
        
        //Programa que borra las palabras que contienen la letra a
        System.out.println("");
        System.out.println("PROGRAMA NUEVO");
     /*   for(int i = frases.size()-1; i>=0;i--){
            String p = frases.get(i);
            if(p.contains("a")){
                 frases.remove(p);              
            }         
        }
*/
  /*      System.out.println("FUNCIONAL");
        frases.removeIf(s -> s.contains("a"));
        frases.forEach(f -> System.out.println(f));
        */
        // Crea un Lis<Persona> con tres personas de estas edades:
        //10,50,18. Borra las personas mayores de edad
        
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepe",10));
        personas.add(new Persona("paco",50));
        personas.add(new Persona("ana",18));
        
        personas.removeIf(p -> p.getEdad() >= 18);
        personas.forEach(f -> System.out.println(f.toString()));
        
        // queremos actualizar cada palabra de la lista de frases pasandola a mayusculas
        
      /* for(int i=0; i<frases.size();i++){
            String palabra = frases.get(i);
            String mayuscula = palabra.toUpperCase();
            frases.set(i, mayuscula);
        }
        
        */
        System.out.println("");
        System.out.println("FUNCIONAL");
        //esta lambda se puede acortar. Las que son un metodo aplicado al parametro.
        
        //frases.replaceAll(f -> f.toUpperCase());
       frases.replaceAll(String::toUpperCase);//referencia al metodo
       //frases.forEach(a -> System.out.println(a));
       frases.forEach(System.out::println);
        
       
       // Transformacion que incrementa 1 a la variable x
      // int x = 3;
       // no se puede mutar una variable
      //Runnable r = () -> x++;
       
    }
}
