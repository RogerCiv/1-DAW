
import java.io.IOException;
import java.util.Optional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 */
public class Persona {
    private String nombre;
    private int edad;
    private Persona hijo;
    
    
    public Persona(String n, int e){
       this(n, e, null);
    }
    
    public Persona(String n, int e, Persona h){
        nombre = n;
        edad = e;
        hijo = h;
    }

    public void trabajar() throws IOException{
        if(edad<18){
            throw new IOException("Un menor no puede trabajar");
        }else{
            System.out.println("La persona "+nombre+" está trabajando");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    /*
    public Optional<Persona> getHijo() {
       Optional<Persona> o = Optional.empty();
       
       if(hijo!=null){
          o = Optional.of(hijo);
       }
       return o;
    }
    */
    /*
    public Optional<Persona> getHijo(){
      return hijo==null? Optional.empty() : Optional.of(hijo);
    }
    */
    public Optional<Persona> getHijo(){
        //si hijo es null, devuelve la caja vacia, sino devuelve la caja con el hijo dentro
        return Optional.ofNullable(hijo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        return nombre;
    }

    public void setHijo(Persona hijo) {
        this.hijo = hijo;
    }
    
    
}
