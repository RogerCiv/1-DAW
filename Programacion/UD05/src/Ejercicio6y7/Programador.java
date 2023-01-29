package Ejercicio6y7;

import java.util.HashMap;
import java.util.Map;

public class Programador extends TrabajadorTecleante {
   //Un Programador es un empleado que conoce lenguajes de programación y sabe escribir el programa “Hola mundo” en ellos.
   // Para eso dispone de un Map<String,String> donde guarda la asociación entre cada lenguaje conocido
   // y el código fuente de su programa Hola Mundo.
    private Map<String,String> lenguajes;

    public Programador(String n, int s, int ndni, char ldni, int ppm) {
        super(n, s, ndni, ldni, ppm);
        //TODO Auto-generated constructor stub
        this.lenguajes = new HashMap<>();
    }
    //El método aprenderLenguaje recibe como parámetros el nombre de un lenguaje, 
    //y un String con el código fuente del programa “Hola mundo” en dicho lenguaje.
  public void  aprenderLenguaje(String lenguaje,String holaMundo){
    lenguajes.put(lenguaje,holaMundo);
  }

  //El método programarHolaMundo recibe como parámetro el nombre de un lenguaje 
  //y nos devuelve el código fuente del programa Hola Mundo de dicho lenguaje. Si
 //el el programador no conoce el lenguaje, se lanzará una IllegalStateException.
  public String programaHolaMundo(String lenguaje){
        String respuesta = null;
     for(Map.Entry<String, String> i : lenguajes.entrySet()){
            if(i.getKey().equals(lenguaje)){
               respuesta = i.getValue();
            }
     }
     if(!lenguajes.containsKey(lenguaje)){
        throw new IllegalStateException("No existe");
     }
     return respuesta;
     
  }

}