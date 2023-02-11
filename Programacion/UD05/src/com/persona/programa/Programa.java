package com.persona.programa;

import com.persona.clases.Persona;
import com.persona.clases.PersonaBuilder;

public class Programa {
    public static void main(String[] args) {
        /*PersonaBuilder p = new PersonaBuilder("Jaime", "Lara", "Ramos");
        p.setTelefono("958000000").setCiudad("Granada").setEdad(15);
*/
        PersonaBuilder p = new PersonaBuilder("Jaime", "Lara", "Ramos")
            .setTelefono("958000000")
            .setCiudad("Granada")
            .setEdad(15);



        PersonaBuilder p2 = new PersonaBuilder("Maria", "Garcia", "Perez");
        PersonaBuilder pareja = new PersonaBuilder("Juan", "Molina", "Molina");
        pareja.setEdad(30).setPais("Ecuador");
        p2.setCiudad("Almeria").setPareja(pareja.build());

    }
}
