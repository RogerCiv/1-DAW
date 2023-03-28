
import java.util.stream.Stream;


public class EjerciciosImportanteFuncional {
    public static void main(String[] args) {
           Empleado a = new Empleado("Antonio", "programador", 1000);
           Empleado b = new Empleado("manuel","Analista",2000);
           Empleado c = new Empleado("Ana", "programador", 1000);
           Empleado d = new Empleado("lucia", "Jefe proyecto", 5000);
           
        
        // sube 100€ a los empleados que ganan menos de 1500€
        System.out.println("Ejercicio 00 -----");
        Stream.of(a,b,c,d)
                .filter(e -> e.getSueldo() < 1500)
                .forEach(e -> e.setSueldo(e.getSueldo()+100));
        
        
        // Guarda en una lista todos los empleados que sean programadores
        System.out.println("Ejercicio 01 ---");
        List<Empleado> programadores = Stream.of(a,b,c,d)
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
        
    }
}
