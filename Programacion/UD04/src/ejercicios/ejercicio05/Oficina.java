package ejercicios.ejercicio05;

import daw.persona.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import daw.persona.CuentaCorriente;
import daw.persona.Persona;

public class Oficina {

    // Ejercicio 14. Poner las propiedades en private.
    private String nombre;
    private ArrayList<Persona> trabajadores;

    /*
     * El primer constructor crea una oficina que se llama como indica el nombre
     * recibido, y la lista de trabajadores está vacía.
     */
    //Ejercicio 27. Colocar en private los metodos constructores
    
    private Oficina(String nombre) {
        this.nombre = nombre;
        trabajadores = new ArrayList<>();
    }

    /*
     * El primer constructor crea una oficina que se llama como indica el nombre
     * recibido, y
     * un tipo, que hace lo siguiente:
     * o Si el tipo es 0 o mayor de 3, la lista de trabajadores estará vacía.
     * o Si el tipo es 1, la lista de trabajadores solo tiene este trabajador:
     * Antonio Pérez Pérez 11111111H 900 28/2/2000
     * o Si el tipo es 2, la lista de trabajadores tendrá al de tipo 1, y también a:
     * Luis López López 22222222J 1000 10/9/1995
     * o Si el tipo es 3, la lista de trabajadores tendrá a los trabajadores de tipo
     * 2 y a:
     * Ana Díaz Díaz 33333333P 1200 21/5/1985
     */

    private Oficina(String nombre, int tipo) throws IllegalArgumentException {
        this(nombre);

        if (tipo < 0) {
            System.out.println("error");
        } else {
            if (tipo == 1) {
                trabajadores.add(new Persona("Antonio Perez Perez", 11111111, 'H', 900, LocalDate.of(2000, 2, 28)));
            } else if (tipo == 2) {
                trabajadores.add(new Persona("Antonio Perez Perez", 11111111, 'H', 900, LocalDate.of(2000, 2, 28)));
                trabajadores.add(new Persona("Luis Lopez Lopez", 22222222, 'J', 1000, LocalDate.of(2000, 2, 28)));
            } else if (tipo == 3) {
                trabajadores.add(new Persona("Antonio Perez Perez", 11111111, 'H', 900, LocalDate.of(2000, 2, 28)));
                trabajadores.add(new Persona("Luis Lopez Lopez", 22222222, 'J', 1000, LocalDate.of(2000, 2, 28)));
                trabajadores.add(new Persona("Ana Diaz Diaz", 33333333, 'P', 1200, LocalDate.of(2000, 2, 28)));

            }else{
                throw new IllegalArgumentException("Error. Tipos de 1 a 3.");
            }
        }
    }

    // El tercer constructor crea una oficina llamada “Industrias DAW”, que es de
    // tipo 3.
    private Oficina() {
        this("Industrias DAW", 3);
    }

    // Ejercicio 11
    // Primer método añadirEmpleado: Añade a la oficina el trabajador pasado como
    // parámetro.
    public void añadirEmpleado(Persona p) {
        trabajadores.add(p);
    }

    // Primer método añadirEmpleado: Crea una persona con los parámetros recibidos y
    // la añade a la oficina.
    public void añadirEmpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac, CuentaCorriente c) {
        this.trabajadores.add(new Persona(nombre, new DNI(DNI), sueldo, fechaNac, c));
    }

    // getTotalEmpleados: Devuelve el número de trabajadores que hay en la oficina
    public int getTotalEmpleados() {
        return trabajadores.size();
    }

    // getTotalEmpleadosMileuristas: Devuelve el número de trabajadores que son
    // mileuristas.
    public int getTotalEmpleadosMileuristas() {
        return this.getMileurista().size();
    }

    // getMileuristas: Devuelve una lista formada por todos los empleados que son
    // mileuristas.

    public List<Persona> getMileurista() {
        List<Persona> mileuristas = new ArrayList<>();
        for (Persona i : trabajadores) {
            if (i.getSueldo() < 1200) {
                mileuristas.add(i);
            }
        }
        return mileuristas;
    }

    // trabaja: Devuelve true si la persona pasada como parámetro trabaja en la
    // empresa.
    public boolean trabaja(Persona p) {
        return trabajadores.contains(p);
    }

    // pagarEmpleados: Hace que todos los empleados cobren su sueldo.
    public void pagarEmpleados() {
        for (Persona i : trabajadores) {
            i.cobrarSueldo();
        }
    }
    // mostrarInformeEmpleados: Muestra por pantalla un listado con todos los
    // empleados de la empresa. Por cada empleado se mostrará su nombre, su sueldo y
    // si es
    // mileurista

    public void mostrarInformeEmpleados() {
        for (Persona i : trabajadores) {
            System.out.println("Nombre : " + i.getNombre() + " Sueldo: " + i.getSueldo());
            if (i.esMileurista()) {
                System.out.println("Es mileurista");
            } else {
                System.out.println("No es mileurista");
            }
        }
    }
    //Ejercicio 17.
    // getSueldoMedio: Devuelve la media de los sueldos de todos los empleados de la
    // oficina. Si la oficina no tiene empleados el método lanza una excepción
    public double getSueldoMedio() throws Exception {
        double media = 0;
        for (Persona i : trabajadores) {
            media += i.getSueldo();
        }
        if (trabajadores.isEmpty()) {
            throw new Exception("No hay trabajadores.");
        } else {
            return media / trabajadores.size();
        }
    }

    //Ejercicio27
   // getOficinaVacia: Devuelve una oficina de tipo 0
   public static Oficina getOficinaVacia(String nombre){
    return new Oficina(nombre);
   }
    // getOficinaPequeña: Devuelve una oficina de tipo 1
    public static Oficina getOficinaPequeña(String nombre){
        return new Oficina(nombre,1);
    }
    //getOficinaMediana: Devuelve una oficina de tipo 2
    public static Oficina getOficinaMediana(String nombre){
        return new Oficina(nombre,2);
    }
    //getOficinaGrande: Devuelve una oficina de tipo 3
    public static Oficina getOficinaGrande(String nombre){
        return new Oficina(nombre,3);
    }
}
