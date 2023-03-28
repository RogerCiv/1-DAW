
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ImportanteFuncional {
    public static void main(String[] args) {
        List<String>  palabras = List.of("lunes","hola","martes","viernes","adios","jueves","domingo");
        // programa que cuente cuantas palabras llevan la letra "a"
        long resultado = palabras.stream()
                        .filter(p -> p.contains("a"))
                        .count();
        System.out.println(resultado);
        
        // programa que muestre en mayusculas todas las palabras de mas de 3 letras que contengan "a"
        
         palabras.stream()
                    .filter(p -> p.contains("a"))
                    .filter(p -> p.length() > 3)
                    .map(p -> p.toUpperCase())
                    .forEach(System.out::println);
                    
         
         // programa que nos dice si el 12531 es un numero primo
         /*
        long divisores =  IntStream.range(2, 1250)
                 .filter( i -> 1253%i == 0)
                 .count();
        if(divisores != 0){
            System.out.println("Primo");
        }else{
            System.out.println("No primo");
        }
         */
                        IntStream.range(2, 12530) // cadena montaje de numeros
                                    .filter( i -> 12531%i == 0) // filtro  que solo deja pasar divisores
                                    .findAny() // me devuelve una caja con cualquier divisor
                                    .ifPresentOrElse(
                                            n -> System.out.println("El 12531 no es primo"),
                                            () -> System.out.println("El 12531 es primo")
                                    ); 
                        
           // Programa que ordena esta lista de numeros, de menor a mayor (5,2,9,4,6)
     
           
           IntStream.of(5,2,4,9,6)
                   .sorted()
                   .forEach(n -> System.out.println(n));
           
           
           
           //  creamos 4 empleado
           Empleado a = new Empleado("Antonio", "programador", 1000);
           Empleado b = new Empleado("manuel","Analista",2000);
           Empleado c = new Empleado("Ana", "programador", 1000);
           Empleado d = new Empleado("lucia", "Jefe proyecto", 5000);
           
           // p funcional para consegior una lista de empleados
           // ordenados de menor a mayor sueldo
           
           
           List<Empleado> lista = Stream.of(a,b,c,d)
                   .sorted()
                   .toList();
           
           // ordenar lo anterior pero por orden alfabetico nombres
           
            List<Empleado> listaN = Stream.of(a,b,c,d)
                   .sorted((e1,e2) -> e1.getNombre().compareTo(e2.getNombre()))
                   .toList();       
            
         //
         //
         
         
    }
}
