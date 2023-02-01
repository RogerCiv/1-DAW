package CLASE.tiendaAnimales;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Perro> compra;


    //crea un carrito vacio
    public Carrito(){
        this.compra = new ArrayList<>();
    }

    public void comprar(Perro p){
        this.compra.add(p);
    }
    // devuelve el precio de todos los perros que has comprado
    public ResultadoCompra getPrecio(){
        boolean descuento = false;
       int acumulador = 0;
        for(Perro i : compra){
            acumulador += i.getPrecio();
           if(i instanceof PerroAbandonado a && !a.estaSano()){
                descuento = true;
           }
        }
        if(descuento){
            acumulador = (int) 0.95*acumulador;
        }
        return new ResultadoCompra(descuento, acumulador);
    }

}
