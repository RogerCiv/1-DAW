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
        if(comprobarDisponibilidadPlaza(a)){
            animales.add(a);
            a.setEncerrado(true);
            respuesta =true;
        }

        return respuesta;
    }

    public boolean retirar(Animal a){
      /*
      boolean respuesta = false;
        if(animales.contains(a)){
            animales.remove(a);
            respuesta = true;
        }
        return respuesta;
      */  
      return animales.remove(a);
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
