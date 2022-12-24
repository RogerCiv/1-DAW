package clases.repaso.restaurantev2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Restaurante {
    private String nombre;
    private Map<String, Integer> carta;

    // Constructor principal
    public Restaurante(String n, Map<String, Integer> p) {
        nombre = n;
        carta = p;
    }

    // crea un restaurante con estos platos: bocadillo (5€), sopa(8€), filete(10€)
    public Restaurante(String n) {
        nombre = n;
        carta = Map.of(
                "bocadillo", 5,
                "sopa", 8,
                "filete", 15);
    }

    // devuelve el nombre del restaurante
    public String getNombre() {
        return nombre;
    }

    // hace que el restaurante ofrezca el plato pasado como parámetro
    public void añadir(String plato, int precio) {
        carta.put(plato, precio);
    }

    // devuelve el precio del plato que pasamos como parámetro. Si el plato no lo
    // ofrece
    // el restaurante,se lanzará una IllegalArgumentException con el mensaje “Ese
    // plato no se ofrece”
    public int getPrecio(String plato) {
        if (!carta.containsKey(plato)) {
            throw new IllegalArgumentException("Este plato no se ofrece");
        } else {
            return carta.get(plato);
        }
    }

    // devuelve true si el plato pasado como parámetro se ofrece en el restaurante
    public boolean estaDisponible(String plato) {
        boolean respuesta = false;
        if (carta.containsKey(plato)) {
            respuesta = true;
        }
        return respuesta;
    }

    // devuelve una lista con los platos que cuestan más de 12 €
    public List<String> getPlatosCaros() {
        List<String> platosCaros = new ArrayList<>();

        for (Map.Entry<String, Integer> i : carta.entrySet()) {
            if (i.getValue() > 12) {
                platosCaros.add(i.getKey());
            }

        }
        return platosCaros;

    }

    // devuelve el precio de todos los platos que se pasan como parámetro. Si alguno de los
    // platos no está en el restaurante, se lanzará una IllegalArgumentException con el mensaje “Ese
    //plato no se ofrece”
    public int getCuenta(String[] platos){
        int precioTotal = 0;
        for(String i : platos){
            if(carta.containsKey(i)){
                throw new IllegalArgumentException("Este plato no se ofrece");
            }else{
                precioTotal += carta.get(i);
            }
        }
        return precioTotal;
    }

    // Este método guarda en el archivo menu.txt todos los platos ofrecidos por el restaurante, cada
    //uno con su precio
    public void guardar() throws IOException{
        PrintWriter file = new PrintWriter("menu.txt");
        for(Map.Entry<String,Integer> i : carta.entrySet()){
            String plato = i.getKey();
            int precio = i.getValue();
            file.println("Plato: "+plato+ " Precio: "+precio);
        }
    }
}
