
package clases.ejercicios.ejercicio05;

import daw.persona.CuentaCorriente;
import daw.persona.DNI;
import daw.persona.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Oficina {

    //ejercicio 14 poner las propiedades como privadas.
    private String nombre;
    private  ArrayList<Persona> trabajadores;
    

    //El primer constructor crea una oficina que se llama como indica el nombre recibido, y
    //la lista de trabajadores está vacía

    // EJERCICIO 27
    //pon privados sus métodos constructores, y haz 
    //varios métodos estáticos que devuelvan un objeto Oficina, según su tipo:
    private Oficina(String nombre){
        this.nombre=nombre;
        
        // hay que iniciar la lista vacia, para que no de error de NullPointerException
        trabajadores = new ArrayList<>();
    }
    /*
    El primer constructor crea una oficina que se llama como indica el nombre recibido, y
    un tipo, que hace lo siguiente:
    o Si el tipo es 0 o mayor de 3, la lista de trabajadores estará vacía.
    o Si el tipo es 1, la lista de trabajadores solo tiene este trabajador:
    Antonio Pérez Pérez 11111111H 900 28/2/2000
    o Si el tipo es 2, la lista de trabajadores tendrá al de tipo 1, y también a:
    Luis López López 22222222J 1000 10/9/1995
    o Si el tipo es 3, la lista de trabajadores tendrá a los trabajadores de tipo 2 y a:
    Ana Díaz Díaz 33333333P 1200 21/5/198
    */
    private Oficina(String nombre, int tipo){
        this(nombre);
        
        if(tipo ==1){
            trabajadores.add(new Persona("Antonio Perez Perez", 11111111, 'H',900, LocalDate.of(2000, 2, 28)));
        }else if(tipo==2){
            //añadir aqui el trabajador tipo 1
            trabajadores.add(new Persona("Luis Lopez Lopez", 22222222, 'J',1000, LocalDate.of(1995, 9, 10)));
            trabajadores.add(new Persona("Antonio Perez Perez", 11111111, 'H',900, LocalDate.of(2000, 2, 28)));
        }else if(tipo==3){
            //añadir aqui los de tipo2.
            trabajadores.add(new Persona("Ana Diaz Diaz", 33333333, 'P',1200, LocalDate.of(1985, 5, 21)));
            trabajadores.add(new Persona("Luis Lopez Lopez", 22222222, 'J',1000, LocalDate.of(1995, 9, 10)));
            trabajadores.add(new Persona("Antonio Perez Perez", 11111111, 'H',900, LocalDate.of(2000, 2, 28))); 
        }
    }
    
    //El tercer constructor crea una oficina llamada “Industrias DAW”, que es de tipo 3.
    
    private Oficina(){
        this("Industrias DAW", 3);
        
    }
   
    //Ejercicio 11
    //Primer método añadirEmpleado: Añade a la oficina el trabajador pasado como parámetro.
    
    public void añadirEmpleado(Persona p){
        trabajadores.add(p);
    }
    //Segundo método añadirEmpleado: Crea una persona con los parámetros recibidos y la añade a la oficina.
    
    public void añadirEmpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac, CuentaCorriente c){
        DNI dniEmpl = new DNI(DNI);
        Persona empleado = new Persona(nombre,dniEmpl,sueldo,fechaNac,c);
        trabajadores.add(empleado);
    }

     //Ejercicio 14
     //getTotalEmpleados: Devuelve el número de trabajadores que hay en la oficina
    public int getTotalEmpleados(){
        return this.trabajadores.size();
    }

    //getTotalEmpleadosMileuristas: Devuelve el número de trabajadores que son
    //mileuristas.
    public int getTotalEmpleadosMileuristas(){
       /* int contador =0;
        for(Persona empleado : trabajadores ){
            if(empleado.getSueldo() <1000 ){
                contador++;
            }
        }
        return contador;*/
        List<Persona> mileuristas =this.getMileuristas();
        return mileuristas.size();
        /*
         * return this.getMileuristas().size();
         */

    }

        //getMileuristas, devuelve una lista formada por todos los empleados que son mileuristas.
    public List<Persona> getMileuristas(){
        List<Persona> mileuristas = new ArrayList<>();
        for(Persona per : trabajadores){
            if(per.getSueldo() <=1000){
                mileuristas.add(per);
            }
        }
        return mileuristas;
    }

    //trabaja: Devuelve true si la persona pasada como parámetro trabaja en la empresa.
    public boolean trabaja (Persona p){
  
        return this.trabajadores.contains(p);
    }
    //pagarEmpleados: Hace que todos los empleados cobren su sueldo.

    public void pagarEmpleados(){
        for(Persona per : trabajadores){
            per.cobrarSueldo();
        }
    }

    //mostrarInformeEmpleados: Muestra por pantalla un listado con todos los empleados
    //de la empresa. Por cada empleado se mostrará su nombre, su sueldo y si es mileurista.

    public void mostrarInformeEmpleados(){

        for(Persona per : trabajadores){
            System.out.println("Nombre: "+per.getNombre()+" DNI: "+per.getDNI()+" Sueldo: "+per.getSueldo());
            if(per.esMileurista()){
                System.out.println(" Es mil eurista");
            }else{
                System.out.println(" No es mileurista");;
            }
        }

    }

    //Ejercicio 17
    //getSueldoMedio: Devuelve la media de los sueldos de todos los empleados de la 
    //oficina. Si la oficina no tiene empleados el método lanza una excepción. 

    public double getSueldoMedio() throws Exception{
        double sueldoM = 0;
        
        for(Persona i: trabajadores){
            sueldoM+= i.getSueldo();
        }
        if(trabajadores.isEmpty()){
            throw new Exception("La oficina no tiene empleados");
        }else{
            return sueldoM/trabajadores.size();
        }
    }
    //Ejercicio 27
    // Metodos estaticos
    //getOficinaVacia: Devuelve una oficina de tipo 0 

    public static Oficina getOficinaVacia(String a){
        return new Oficina(a,0);
    }
    //getOficinaPequeña: Devuelve una oficina de tipo 1 
    public static Oficina getOficinaPequña(String b){
        return new Oficina(b,1);
    }

    //getOficinaMediana: Devuelve una oficina de tipo 2
    public static Oficina getOficinaMediana(String c){
        return new Oficina(c,2);
    }
    //getOficinaGrande: Devuelve una oficina de tipo 3 
    public static Oficina getOficinaGrande(String d){
        return new Oficina(d,3);
    }
} 
