package Ejercicio29;

import java.util.List;

public record Persona(String nombre, int edad, boolean soltero) {
    
    public static void mostrarEnPantalla(List<Persona> personas, Filtro filtro){
        for(Persona i : personas){
            if(filtro.aceptar(i)){
                System.out.println(i.nombre());
            }
        }
    }
}
