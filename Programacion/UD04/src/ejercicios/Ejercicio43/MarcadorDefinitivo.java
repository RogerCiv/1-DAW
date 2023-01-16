package ejercicios.Ejercicio43;

import ejercicios.Ejercicio41.MarcadorBaloncesto;
import ejercicios.Ejercicio41.TipoCanasta;
import ejercicios.Ejercicio41.TipoEquipo;

public class MarcadorDefinitivo implements MarcadorBaloncesto {
    
    
    private Equipo local;
    private Equipo visitante;

    //El constructor inicializa las propiedades creando objetos Equipo a partir de los nombres
    //de los equipos recibidos.
    public MarcadorDefinitivo(String local, String visitante){
        this.local = new Equipo(local, 0);
        this.visitante = new Equipo(visitante, 0);
    }
    
    //añadirCanasta añade una canasta del tipo recibido como parámetro al equipo que
    //también se pasa como parámetro
    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        // TODO Auto-generated method stub
        if(e.equals(TipoEquipo.LOCAL)){
            local = local.añadirCanasta(t);
        }else if(e.equals(TipoEquipo.VISITANTE)){
            visitante = visitante.añadirCanasta(t);
        }
    }
    //getNombreEquipo devuelve el nombre del equipo local o del visitante, según sea el
    //parámetro recibido.
    @Override
    public String getNombreEquipo(TipoEquipo e) {
        // TODO Auto-generated method stub
        return e.equals(TipoEquipo.LOCAL) ? local.nombre() : visitante.nombre();
    }
    //getPuntos devuelve los puntos del local o del visitante según indica el parámetro
    @Override
    public int getPuntos(TipoEquipo e) {
        // TODO Auto-generated method stub
        return e.equals(TipoEquipo.LOCAL) ? local.puntos() : visitante.puntos();
    }
    
}
