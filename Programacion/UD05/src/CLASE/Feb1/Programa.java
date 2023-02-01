package CLASE.Feb1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Localidad gr = new Localidad(1, "Granada");
        Localidad ma = new Localidad(2, "Malaga");
        Localidad ja = new Localidad(3, "Jaen");

        lista.add(new Persona("jose", 30, LocalDate.now().minusYears(30),gr));
        lista.add(new Persona("Maria", 20, LocalDate.now().minusYears(20),ma));
        lista.add(new Persona("Hermenegildo", 120, LocalDate.now().minusYears(120),gr));
        lista.add(new Persona("Antonio", 80, LocalDate.now().minusYears(80),ja));
        lista.add(new Persona("Ana", 50, LocalDate.now().minusYears(50),ja));
     
        // Ordenar la lista
        //Da error con el collections.sort porque la clase Persona NO TIENE LA
        // HABILIDAD de poder ser ordenada
        
        //En java paraque la clase Persona adquiera la habilidad de poderse ordenar
        // (de menor a mayor) debemos hacer que implemente la interfaz Comparable<Persona>.
        // Burrada : La interfaz Comparable<Persona> YA ESTA EN JAVA y NO HAY QUE PROGRAMARLA.
        // ordena la lista segun orden natural.
       // Collections.sort(lista);
        //Este comparador ordena por edad
        ComparadorPersonasEdad comparador = new ComparadorPersonasEdad();
        // ordenamos la lista con el comparador.
        Collections.sort(lista,comparador);
        for(Persona i : lista){
           // System.out.println(i.getNombre()+" ... "+i.getEdad()+" ... "+i.getFechaNacimiento());
           System.out.println("%s .. %d ... %s ... %s".formatted(i.getNombre(),i.getEdad(),i.getFechaNacimiento().toString(),i.getLocalidad().toString()));
        }
        
    }
}
