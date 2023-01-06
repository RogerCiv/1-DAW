package ejercicios.Extra;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Restaurante {
    private String nombre;
    private Map<String,Integer> carta;
    

    //Constructor principal
    public Restaurante(String n, Map<String,Integer> p){
        this.nombre = n;
        this.carta = p;
    }
    //// crea un restaurante con estos platos: bocadillo (5€), sopa(8€), filete(10€)

    public Restaurante(String n){
        this(n,Map.of("Bocadillo",5,
        "sopa",8,
        "filete",10));
    }

    // devuelve el nombre del restaurante
    public String getNombre(){
        return nombre;
    }
    //// hace que el restaurante ofrezca el plato pasado como parámetro
    public void añadir(String plato, int precio){
        carta.put(plato, precio);
    }
    //// devuelve el precio del plato que pasamos como parámetro. Si el plato no lo ofrece
// el restaurante,se lanzará una IllegalArgumentException con el mensaje “Ese plato no se ofrece”
    public int getPrecio(String plato){
        if(!carta.containsKey(plato)){
            throw new IllegalArgumentException("Esta plato no se ofrece");
        }
        
        return carta.get(plato);
        
    }
    // devuelve true si el plato pasado como parámetro se ofrece en el restaurante
    public boolean estaDisponible(String plato){
        return carta.containsKey(plato) ;
    }
    
    //// devuelve una lista con los platos que cuestan más de 12 €
    public List<String> getPlatosCaros(){
        
        List<String> platosC = new ArrayList<>();
        for(Map.Entry<String,Integer> i : carta.entrySet()){
            if(i.getValue() > 12){
                platosC.add(i.getKey());
            }
        }
        return platosC;
    }

    // devuelve el precio de todos los platos que se pasan como parámetro. Si alguno de los
    // platos no está en el restaurante, se lanzará una IllegalArgumentException con el mensaje “Ese
    //plato no se ofrece”
    public int getCuenta(String[] platos){
        int cuenta = 0;
        for(String i  : platos){
            cuenta += this.getPrecio(i);
        }
        return cuenta;
    }
    // Este método guarda en el archivo menu.txt todos los platos ofrecidos por el restaurante, cada
    //uno con su precio
    public void guardar() throws IOException{
        PrintWriter write = new PrintWriter("menu.txt");
        for(Map.Entry<String,Integer> i : carta.entrySet()){
            write.println("Plato: "+i.getKey()+" Precio: "+i.getValue());
        }
        write.close();
    }
}
