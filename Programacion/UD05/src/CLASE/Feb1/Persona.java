package CLASE.Feb1;

import java.time.LocalDate;
// Esto no entra en el examen.
// Cuando la clase Persona implementa Comparable<Persona>, 
//se dice que "LA CLASE PERSONA TIENE UN ORDEN NATURAL"
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    //Esto es lo de arriba, que no entra en el examen.
    private Localidad localidad;
    public Persona(String n, int e, LocalDate fn, Localidad l){
        this.nombre = n;
        this.edad = e;
        this.fechaNacimiento = fn;
        this.localidad = l;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    // Hay que sobreescribir el metodo.
    /*
      Este metodo devuelve la distancia entre el objeto que estamos programando y el objeto
      recibido como parametro. Ademas, el resultado debe ser: 
      
     */
    @Override
    public int compareTo(Persona p) {
        // TODO Auto-generated method stub
       // return this.edad - p.edad;
       //return this.nombre.compareTo(p.getNombre());
        //return this.fechaNacimiento.compareTo(p.fechaNacimiento);
        return this.localidad.compareTo(p.localidad);
    }

    public Localidad getLocalidad() {
        return localidad;
    }
}
