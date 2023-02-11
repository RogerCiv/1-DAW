package CLASE.Feb7;
import java.awt.Color;

/*
 CLASE ABSTRACTA --> Es un concepto del mundo real que es muy generico,
  y que al pensar en el,nos vamos a algo concreto.

Ejemplos: Vehiculo, Comida

Las CLASES ABSTRACTAS pueden tener metodos abstractos, que deberan ser programados
 obligatoriamente en sus clases hijas ( a menos que sean abstractas)

 Las CLASES ABSTRACTAS solo tienen sentido si se hacen clases hijas.

 Un metodo abstractao "baja" por el arbol de herencia hasta que se programa
 en algun sitio y entonces deja de ser abstracto, las siguientes clases lo heredan.
 
 */
public abstract class Vehiculo {
    private String[] pasajeros;
    private int velocidadMaximaReglamentaria;
    private Color color;

    //Este constructor crea un vehiculo con el num de plazas que se pasa
    //como parametro y esas plazas estan vacias.
    public  Vehiculo(int numeroPlazas,int vm, Color c){
        this.pasajeros = new String[numeroPlazas];
        this.velocidadMaximaReglamentaria = vm;
        this.color = c;
    }

    //Metodo añade el pasajero cuyo nombre se pasa como parametro al
    //sitio indicado.
    public void añadirPasajero(String nombre, int sitio){
        this.pasajeros[sitio]=nombre;
    }


    //Metodo devulve el num de pasajeros que hay ahora mismo en el 
    //vehiculo
    public int getNumeroPasajeros(){
        int contador = 0;
        for(String i : pasajeros){
            if(i!=null){
               contador++; 
            } 
        }

        return contador;
    }

    //Este metodo mueve el vehiculo a las coordenadas que se pasan como parametro
    public abstract void mover(int x, int y);
}
