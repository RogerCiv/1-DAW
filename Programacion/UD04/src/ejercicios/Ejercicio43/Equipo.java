package ejercicios.Ejercicio43;

import ejercicios.Ejercicio41.TipoCanasta;

public record Equipo(String nombre, int puntos) {
 
    //El constructor secundario crea un equipo que lleva 0 puntos
    public Equipo(String nombre){
        this(nombre,0);
    }

    //El método añadirCanasta devuelve un Equipo con las mismas características del que
    //estamos programando, pero añadimos a su puntuación los puntos que nos indica el
    //tipo de canasta pasada como parámetro
    public Equipo añadirCanasta(TipoCanasta t){
        
        return new Equipo(this.nombre, puntos+t.getValor());
    }
}
