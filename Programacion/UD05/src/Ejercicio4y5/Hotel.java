package Ejercicio4y5;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Hotel extends Edificio {

    private List<String> clientes;
    private int maximo;
    public Hotel(String d, int np, int m) {
        super(d, np);
        if(m<1){
            throw new IllegalArgumentException("Personas negativas");
        }
        this.maximo = m;
        this.clientes = new ArrayList<>();
        //TODO Auto-generated constructor stub
    }
    public void añadirCliente(String c){
        if(clientes.size() > maximo){
            throw new IllegalStateException("Maximo de clientes excedido");
        }
        clientes.add(c);
    }

    public void retirarCliente(String c){
        if(clientes.contains(c)){
            throw new NoSuchElementException("Cliente no se encuentra en la lista");
        }
        clientes.remove(c);
    }
    
}
