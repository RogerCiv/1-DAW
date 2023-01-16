package ejercicios.Ejercicio41;

public interface MarcadorBaloncesto {
    

    public void añadirCanasta(TipoEquipo e, TipoCanasta t);

    public String getNombreEquipo(TipoEquipo e);

    public int getPuntos(TipoEquipo e);

    //El método mostrarMarcador muestra en la misma línea, el nombre del equipo local, sus 
    //puntos, y luego el nombre del equipo visitante y sus puntos, con este formato:
    public default void mostrarMarcador(){
        System.out.println(getNombreEquipo(TipoEquipo.LOCAL)+" "+getPuntos(TipoEquipo.LOCAL)+" - "
        +getNombreEquipo(TipoEquipo.VISITANTE)+" "+getPuntos(TipoEquipo.VISITANTE));
    }
}
