package Ejercicio29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona juan = new Persona("Juan Perez", 25, true);
        Persona maria = new Persona("Maria Lopez", 39, false);
        Persona javier = new Persona("Javier Presley", 19, false);
        Persona robert = new Persona("Rober Jimenez", 30, false);
        
        personas.add(juan);
        personas.add(maria);
        personas.add(javier);
        personas.add(robert);

        System.out.println("""
                    1) Ver personas casadas.
                    2) Ver personas solteras mayores de edad.
                    3) Ver personas cuyo nombre empieza por la letra J.
                """);
        int opcion = new Scanner(System.in).nextInt();


        Filtro casados = new Filtro() {

            @Override
            public boolean aceptar(Persona p) {
                // TODO Auto-generated method stub
                return !p.soltero();
            }

            
        };

        Filtro solteros = new Filtro() {

            @Override
            public boolean aceptar(Persona p) {
                // TODO Auto-generated method stub
                return p.soltero() && p.edad()>=18;
            }
            
        };
        Filtro nJ = new Filtro() {

            @Override
            public boolean aceptar(Persona p) {
                // TODO Auto-generated method stub
                return p.nombre().startsWith("J");
            }
           
        };
            
    
        switch(opcion){
            case 1 -> {         
           Persona.mostrarEnPantalla(personas, casados);          
          }
            case 2 -> {
                Persona.mostrarEnPantalla(personas, solteros);   
            }
            case 3 -> { 
                Persona.mostrarEnPantalla(personas, nJ);
            }
            default -> {
                System.out.println("Opcion incorrecta");
            }
        }

    }
}
