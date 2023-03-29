
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Funcional29Marzo {

    private static List<String> palabras = List.of("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo");

    private static List<Departamento> departamentos = List.of(
            new Departamento("Informatica", List.of(
                    new Empleado("Antonio", 1000),
                    new Empleado("Jose", 900),
                    new Empleado("Maria", 1200)
            )),
            new Departamento("limpieza", List.of(
                    new Empleado("Luis", 900),
                    new Empleado("Manuel", 1100))),
            new Departamento("transporte", List.of(
                    new Empleado("Ana", 1000),
                    new Empleado("HErmenegildo", 950))
            ));

    public static void main(String[] args) {
        
        // a partir de la lista de departamentos, muestra en pantalla el nombre  y sueldo de todos los empleados
        // ganan mas de 1000€ ordenados alfabeticamente
        departamentos.stream()
                .flatMap(departamento -> departamento.getEmpleados().stream())
                .filter(empleado -> empleado.sueldo()>1000)
                .sorted(Comparator.comparing(empleado -> empleado.nombre()))
                .map(empleado -> empleado.nombre()+" "+empleado.sueldo())
                .forEach(System.out::println);
        
    }

    public static void main5(String[] args) {
        //forma un string con todas las palabras pegadas y separadas por comas
        String prueba = palabras.stream()
                .reduce("", (identidad, string) -> identidad + ", " + string);
        System.out.println(prueba);

        String prueba2 = palabras.stream()
                .collect(Collectors.joining(","));
        System.out.println(prueba2);

    }

    public static void main4(String[] args) {
        // genera 1000 numeros aleatorios entre 0 y 500, quita los que se repitan
        // quita los que se repitan y calcula la suma de sus cuadrados
        //opcion 100% funcional
        int resultado = Stream.generate(() -> new Random().nextInt(0, 501))
                .limit(1000)
                .distinct()
                .map(numero -> numero * numero)
                .reduce(0, (identidad, numero) -> identidad + numero);

        /// otra opcion
        int resultado2 = Stream.generate(() -> new Random().nextInt(0, 501))
                .limit(1000)
                .distinct()
                .map(numero -> numero * numero)
                .mapToInt(i -> i)
                .sum();
        // Otra version 
        IntStream.generate(() -> new Random().nextInt(0, 501))
                .limit(1000)
                .distinct()
                .map(numero -> numero * numero)
                .sum();

    }

    public static void main3(String[] args) {
        // Pide al usuario un string y muestra por pantalla cuantas veces sale la letra a
        String pal = "hola";

        long total = pal.chars()
                .filter(codigoAscii -> codigoAscii == 'a')
                .count();
    }

    public static void main2(String[] args) {
        //genera 500 num aleatorios diferentes entre 100 y 5000
        List<Integer> numeros = Stream.generate(() -> new Random().nextInt(100, 5001))
                .distinct()
                .limit(500)
                .toList();

    }

    public static void main1(String[] args) {

        //muestra en pantalla las palabras que empiezan por la letra "m" en mayusculas y tienen mas de 5 letras
        palabras.stream()
                .filter(p -> p.startsWith("m"))
                .filter(p -> p.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
