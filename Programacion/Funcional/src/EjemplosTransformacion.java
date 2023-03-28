
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 */
public class EjemplosTransformacion {

    public static void main(String[] args) {
        
        // Hago una variable que va a guardar la transformacion que
        // a cada entero lo transforma en su cuadrado.
        Function<Integer,Integer> t1 = n -> n*n; // expresion lambda
        int resultado = t1.apply(10);
        System.out.println(resultado);
       
        
        //ransformacion que convierte un String en su
        // primera letra
        
       Function<String,Character> t2 = s -> s.charAt(0);
       
       //mostramos por pantalla en que se transforma "Viernes"
        System.out.println(t2.apply("Viernes"));
        
        
        //Transformacion que convierte un string en su ultima letra
        Function<String,Character> t3 = (String s) -> s.charAt(s.length()-1);
        
        System.out.println(t3.apply("Viernes"));
        
        // una transformacion que transforma una fecha 
        // en el numero 524
        
        Function<LocalDate,Integer> t4 = ld -> 524;
        System.out.println(t4.apply(LocalDate.now()));
        
        //transformacion que convierte un String en su numero de caracteres
        
        Function<String,Integer> t5 = s -> s.length();
        
        System.out.println(t5.apply("Sabado"));
        
        //Transformacion que convierte un numero entero en true , si es par y en false si es impar
        
        Function<Integer,Boolean> t6 = i -> i%2==0; //? true : false;
        
        System.out.println(t6.apply(6));
        
        //transformacion que convierte una lista de enteros en el primer entero de la lista
        List<Integer> lista = List.of(1,2,3,4,5);
        Function<List<Integer>,Integer> t7 = n -> n.get(0);
        
        System.out.println(t7.apply(lista));
        ///////////////////////////////////////////////////////
        // PREDICATE
        ////////////////////////////////////////////////////
        //transformacion que recibe una lista de String
        // y nos devuelve true si la lista NO esta vacia
       // 
        Predicate<List<String>> t8 = list -> !list.isEmpty();
       
        //creamos lista con las palabras "Hola" y "adios"
        // Y vamos a transfromar esa lista en true/false
        
        List<String> palabras = List.of("Hola","Adios");
        System.out.println(t8.test(palabras));
        
        // Haz una transformacion que reciba un String y nos devuelva
        // true si comienza por mayuscula
        
        Predicate<String> t9 = s -> Character.isUpperCase(s.charAt(0));
        
        System.out.println(t9.test("Silla"));
        
        //Haz una transfromacion que reciba una Fecha y nos devuelva
        // true si esa fecha ya ha pasado
        
        Predicate<LocalDate> t10 =   f -> f.isBefore(LocalDate.now());
        System.out.println(t10.test(LocalDate.of(2023, Month.MARCH, 22)));
        
        
         // haz una transformacion que reciba un numero entero
         // y nos devuelva true si es un numero primo
        
         Predicate<Integer> t12 = n -> {
             boolean primo = true;
             for(int i=2; i<n && primo;i++){
                 if(n % i == 0){
                     primo = false;
                 }
             }
             return primo;
         };
         
         System.out.println(t12.test(15));
         
         
         /////////////////////////////////////////////////////
         // Consumer<A>
         //////////////////////////////////////
         
         //transformacion que recibe una palabra y la muestra en la pantalla
         // convertida en mayusculas
         
         Consumer<String> t13 =  s -> System.out.println(s.toUpperCase());
         t13.accept("hola");
         
         // transformacion que recibe una palabra y la guarda en un archivo llamado palabra.txt
         Consumer<String> t14 = s -> {
           
             try( PrintWriter wr = new PrintWriter(new File("palabra.txt"));){
                
                 wr.println(s);
                
                 
             }catch(IOException error){
                 System.out.println("error");
             }
             
         };
         t14.accept("Palabra");
         
         
         /////////////////////
         // supplier<A>
         /////////////////
         
         //Transformacion que genera un numero aleatorio entre 0 y 1
         
         Supplier<Double> t15 = () -> Math.random();
         System.out.println(t15.get()+" ------- "+t15.get());
         
         //////////////////
         // Runnable
         //////////////
         
         // Haz una transformacion que escriba en la pantalla
         // el mensaje HOY ES JUEVES
         
         Runnable  t16 = () -> System.out.println("HOY ES JUEVES");;
         t16.run();
         
         ///Repaso semana
         // quiero transformar un numero en su cuadrado
         Function<Integer,Integer> t17 = n -> n*n ;
         // Cuando quieres transformar de un tipo al mismo tipo (integer a integer) se usa UnaryOperator
         UnaryOperator<Integer> t18 = n -> n*n;
         
         
         // Transformacion que transforme una persona en true si es mayor de edad
         
         Predicate<Persona> t19 = p -> p.getEdad() >= 18;
         System.out.println(t19.test(new Persona("Pepe",17)));
         
         // transformacion que coge dos numeros y los transforma en su suma
         
         BiFunction<Integer,Integer,Integer> t20 = (a,b) -> a+b;
         System.out.println(t20.apply(5, 10));
         
         // Transformacion que recibe una persona y un numero y
         // los transforma en true si la persona tiene mas años que ese numero.
         
         BiPredicate<Persona,Integer> t21 = (p,i) ->  p.getEdad() > i ;
         
         //Transformacion que recibe una fecha y una hora y las muestra en la pantalla
         
         BiConsumer<LocalDate,LocalTime> t22 = (ld,lt) -> System.out.println(ld+" "+lt);
         
         
                
      }
}

