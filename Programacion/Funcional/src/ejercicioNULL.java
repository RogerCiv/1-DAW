
import java.io.IOException;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 */
public class ejercicioNULL {
    private static void trabajar(Persona p){
        try{
            p.trabajar();
        }catch(IOException error){
            System.out.println(error.getMessage());
        }
    }
    public static void main(String[] args) {
    // Persona p = new Persona("Antonio",30);
    //   
    // System.out.println(p.getHijo().getNombre());

    /*
    Asi no da NullPointerException
    Persona p = new Persona("Antonio",30);
    Optional<Persona> optHijo = p.getHijo();
    
    if(optHijo.isEmpty()){
        System.out.println("No tiene hijos");
    }else{
        Persona hijo = optHijo.get();
        System.out.println(hijo.getNombre());
    }
    */
    
    // Forma 100% optima :D
    
    Persona p = new Persona("Antonio",30,new Persona("Pepe",10));
    p.getHijo().ifPresentOrElse(
            hijo -> System.out.println(hijo.getNombre()),
            () -> System.out.println("No tiene hijos"));
        
    
    
    
    
        
    List<Persona> personas = List.of(
       new Persona("Antonio",40),
       new Persona("Luis",15),
       new Persona("Manuel",60),
       new Persona("Maria",12)
    );
    
    //quiero poner a trabajar a todas las personas
      //personas.forEach(Persona::trabajar);
/*
      personas.forEach(p -> {  
      try{
          p.trabajar();
      }catch(IOException error){
          System.out.println(error.getMessage());
      }
      });
     */
      personas.forEach(per -> trabajar(per));//lambda
      personas.forEach(ejercicioNULL::trabajar);//referencia a metrodo
      
    }

   
}
