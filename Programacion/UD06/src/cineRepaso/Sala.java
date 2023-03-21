
package cineRepaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Sala {
    private int numero;
    private int capacidad;
    private Pelicula pelicula;
    private List<Integer> plazasLibres;
    
    
    
    public Sala(int n, int c, Pelicula p){
        this.numero =n;
        capacidad = c;
        pelicula = new Pelicula(p.titulo(),p.rutaFoto());
        plazasLibres = new ArrayList<>();
        
        for(int i = 1; i<capacidad; i++){
            plazasLibres.add(i);
        } 
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    public Pelicula getPelicula(){
        return pelicula;
    }
    public int getNumeroPlazasLibres(){
        return plazasLibres.size();
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
        return new Random().nextInt(plazasLibres.size());
    }
    
    public boolean reservar(int n){
        boolean respuesta = false;
        if(plazasLibres.contains(n)){
            respuesta = true;
            plazasLibres.remove(n);
        }
        return respuesta;
    }
    @Override
    public String toString(){
        return "Sala "+numero;
    }
}
