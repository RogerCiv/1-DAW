package Ejercicio6y7;

import java.util.HashMap;
import java.util.Map;

public class Programador extends TrabajadorTecleante {
    private Map<String,String> lenguajes;

    public Programador(String n, int s, int ndni, char ldni, int ppm) {
        super(n, s, ndni, ldni, ppm);
        //TODO Auto-generated constructor stub
        this.lenguajes = new HashMap<>();
    }
    
  public void  aprenderLenguaje(String lenguaje,String holaMundo){
    lenguajes.put(lenguaje,holaMundo);
  }
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