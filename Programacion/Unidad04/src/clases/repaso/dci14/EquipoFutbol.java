package clases.repaso.dci14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
    private String nombre;
    private List<Futbolista> jugadores;
    private long presupuesto;

    // COnstructor
    // Crea un equipo con el nombre pasado como parametro y lista de jugadores vacia
    //El nombre del equipo de futbol  solo puede empezar por : "FC","Atletico","Real",Deportivo",
    //En caso contrario, se lanza una IllegalArgumentException con el mensaje "nombre inocrrecto"
    //Si el presupuesto es negativo, lanza una IllegalArgumentException con el mensae "saldo incorrecto"
    public EquipoFutbol(String n, long p) {
        
        if(n.startsWith("FC") || n.startsWith("Atletico") || n.startsWith("Real") || n.startsWith("Deportivo")){
            nombre = n;
        }else{
            throw new IllegalArgumentException("Nombre incorrecto");
        }
        
        jugadores = new ArrayList<>();
        if(p>0){
            presupuesto = p;
        }else{
            throw new IllegalArgumentException("Presupuesto negativo");
        }
       

    }

    // metodos
    // devuelve el numero de jugadores del equipo
    // +int getNumeroJugadores()

    public int getNumeroJugadores() {
        return jugadores.size();
    }

    // devuelve el sueldo de todos los jugadores
    // long getSueldoJugadors
    public long getSueldoJugadores() {
        long respuesta = 0;
        /*
         * for(int i = 0; i<jugadores.size();i++){
         * respuesta += jugadores.get(i).getSueldo();
         * }
         * 
         */
        for (Futbolista i : jugadores) {
            respuesta += i.getSueldo();
        }

        return respuesta;
    }

    // devuelve una lista con todos los jugadores que juegan en la posicion como
    // parametro
    // si la posicion no es validad, devuelve una lista vacia
    //si la pòsicion no es valida, lanza un IllegalArgumentException con el mensaje "posicion invalidad"
    // +List<Futbolista> getJugadores(String posicion)
    // 
    public List<Futbolista> getJugadores(String posicion) {
        List<Futbolista> jugCliente = new ArrayList<>();
        List<String> posiciones = List.of("portero","defensa","mediocentro","Delantero");
       if(posiciones.contains(posicion)){
        for (Futbolista i : jugadores) {
            if (i.getPosicion().equals(posicion)) {
                jugCliente.add(i);
            }
        }
       }else{
        throw new IllegalArgumentException("Posicion incorrecta");
       }
        
        return jugCliente;
    }
    //Contrata al futbolista pasado como parametro.
    //Solo se puede contrar si queda presupuesto una vez contodas todos los
    // jugadores que ya hay en el equipo.
    //Esto es sobrecarga(overload) por tener dos metodos iguales
    //+void contratar(Futbolista f)
    //+void contratar(String nombre, int dorsal)

    public void contratar(Futbolista f){
        
        long precio = 0;

        if(presupuesto >= f.getSueldo()){
            jugadores.add(f);
            presupuesto -= precio;
        }else{
            System.out.println("No hay suficinte presupuesto para fichar a "+f.getNombre());
        }
    


    }
    public void contratar(String nombre, int dorsal){
         Futbolista f = new Futbolista(dorsal, nombre);
    }
    
    
    //Este metodo crea un archivo txt en la ruta que pasamos como parametro,
    //con el nombre de tosos los jugadores del equipo
    //+void guardar(String ruta) throws IOException

    public void guardar(String ruta) throws IOException{
        
        PrintWriter p = new PrintWriter(ruta);        
        for(Futbolista i : jugadores){
           p.println(i.getNombre());
        }
        p.close();
    }


    }

