package daw.zoo;

import java.util.HashSet;
import java.util.Set;

public abstract class ContenedorAnimales {
    protected Set<Animal> animales;

    public ContenedorAnimales(){
        this.animales = new HashSet<>();
    }

    public boolean añadir(Animal a){
        boolean respuesta = false;


        return respuesta;
    }

    public boolean retirar(Animal a){
        boolean respuesta = false;
        

        return respuesta;
    }
    public int getPesoActual(){
       int peso = 0;

       for(Animal i : animales){
        peso += i.getPeso();
       }
        return peso;
    }
    public int getNumeroAnimales(){
        return this.animales.size();
    }

    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);
}
