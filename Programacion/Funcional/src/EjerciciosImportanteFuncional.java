
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class EjerciciosImportanteFuncional {
    public static void main(String[] args) {
           EMPLEADODOSMOVER a = new EMPLEADODOSMOVER("Antonio", "programador", 1000);
           EMPLEADODOSMOVER b = new EMPLEADODOSMOVER("manuel","Analista",2000);
           EMPLEADODOSMOVER c = new EMPLEADODOSMOVER("Ana", "programador", 1000);
           EMPLEADODOSMOVER d = new EMPLEADODOSMOVER("lucia", "Jefe proyecto", 5000);
           
        
        // sube 100€ a los empleados que ganan menos de 1500€
        System.out.println("Ejercicio 00 -----");
        Stream.of(a,b,c,d)
                .filter(e -> e.getSueldo() < 1500)
                .forEach(e -> e.setSueldo(e.getSueldo()+100));
        
        
        // Guarda en una lista todos los empleados que sean programadores
        System.out.println("Ejercicio 01 ---");
        List<EMPLEADODOSMOVER> programadores = Stream.of(a,b,c,d)
                .filter(e -> e.getPuesto().equalsIgnoreCase("Programador"))
                .toList();
                //.forEach(System.out::println);
        
        // haz un programa que muestre los nombres de todos los programadores
        // ordenados de menos a mas sueldo
        System.out.println("Ejercicio 02------");
          Stream.of(a,b,c,d)
                  .sorted()
                  .forEach(System.out::println);
          
          
        // haz un programa que muestre en mayusculas el nombre de tosos los empleados
        //que no son programadores y cuyo sueldo es mayor de 1500€
        System.out.println("Ejercicio 03 -----");
          Stream.of(a,b,c,d)
                  .filter(p -> p.getPuesto().equalsIgnoreCase("programador"))
                  .filter(p -> p.getSueldo()>1500)
                  .forEach(System.out::println);
          
          
          // haz un programa que muestre en pantalla todos los numeros pares entre 10 y 50
          System.out.println("Ejercicio 04 ----");
          
          IntStream.range(10, 50)
                  .filter(i -> i%2 == 0)
                  .forEach(System.out::println);
          
          // haz programa que pida por teclado el nombre de un empleado y nos muestre todos sus datos
          System.out.println("Ejercicio 05 ----- ");
          String nombre = "Antonio";
          Stream.of(a,b,c,d)
                  .filter(e -> e.getNombre().equals(nombre))
                  .findAny()
                  .ifPresentOrElse(
                          e -> System.out.println(e.getNombre()+" "+e.getPuesto()+" "+e.getSueldo()),
                          () -> System.out.println("NO")
                  );
        
    }
}
