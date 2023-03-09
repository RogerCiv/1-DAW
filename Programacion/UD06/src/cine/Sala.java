
package cine;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sala {
    private int numero;
    private int capacidad;
    private Pelicula pelicula;
    private List<Integer> plazasLibres;
    
    
    public Sala(int n,int c, Pelicula p){
        this.numero = n;
        this.capacidad = c;
        this.pelicula = p;
        this.plazasLibres = new ArrayList<>();
    }

  
    public int getCapacidad() {
        return capacidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    public int getNumeroPlazasLibres(){
        return this.plazasLibres.size();
    }
    
    public String getPlazasLibres(){
        StringBuilder respuesta = new StringBuilder();
       for(Integer i : plazasLibres){
           respuesta.append(i).append(",");
       } 
       
       return respuesta.toString();
       
    }
    public int buscarPlazaLibre(){
       
        if(plazasLibres.isEmpty()){
            throw new IllegalArgumentException("No hay plazas libres");
        }
         int plazaLibre = new Random().nextInt(plazasLibres.size());
         plazasLibres.remove(Integer.valueOf(plazaLibre));
        
        return plazaLibre;
            
    }
    
    public boolean reservar(int n){
        boolean respuesta = false;
      /*  if(plazasLibres.contains(n)){
            for(Integer i : plazasLibres){
                if(i.equals(n)){
                    plazasLibres.remove(n);
                    respuesta = true;
                }
            }
        }
*/      if(plazasLibres.contains(n)){
            plazasLibres.remove(n);
            respuesta = true;
        }
        return respuesta;
    }
    @Override
    public String toString(){
        return "Sala "+numero+" - "+pelicula;
    }
}
