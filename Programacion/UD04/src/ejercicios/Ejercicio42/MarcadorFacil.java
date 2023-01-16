package ejercicios.Ejercicio42;

import ejercicios.Ejercicio41.MarcadorBaloncesto;
import ejercicios.Ejercicio41.TipoCanasta;
import ejercicios.Ejercicio41.TipoEquipo;

public class MarcadorFacil implements MarcadorBaloncesto {

    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;

    //El constructor simplemente rellena las propiedades con los valores recibidos y les pone
    //0 a las puntuaciones de ambos equipos

    public MarcadorFacil(String local, String visitante){
            this.nombreEquipoLocal = local;
            this.nombreEquipoVisitante = visitante;
            this.puntosLocal = 0;
            this.puntosVisitante = 0;
    }
    //añadirCanasta añade una canasta del tipo recibido como parámetro al equipo que
    //también se pasa como parámetro

    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        // TODO Auto-generated method stub
        if(e.equals(TipoEquipo.LOCAL)){
           // this.nombreEquipoLocal = TipoEquipo.LOCAL.name(); 
            this.puntosLocal += t.getValor();
        }else if(e.equals(TipoEquipo.VISITANTE)){
           // this.nombreEquipoVisitante = TipoEquipo.VISITANTE.name();
            this.puntosVisitante += t.getValor();
        }
        
    }
    //getNombreEquipo devuelve el nombre del equipo local o del visitante, según sea el
    //parámetro recibido.

    @Override
    public String getNombreEquipo(TipoEquipo e) {
        // TODO Auto-generated method stub
    /*
        String respuesta = "";
        if(e.equals(TipoEquipo.LOCAL)){
            respuesta = nombreEquipoLocal;
        }else if(e.equals(TipoEquipo.VISITANTE)){
            respuesta = nombreEquipoVisitante;
        }
        return respuesta;
        return e.equals(TipoEquipo.LOCAL) ? nombreEquipoLocal : nombreEquipoVisitante;
       */
        return e.name();
    }
    //getPuntos devuelve los puntos del equipo local o del visitante según sea el parámetro
    //recibido.
    @Override
    public int getPuntos(TipoEquipo e) {
        // TODO Auto-generated method stub
        
        return e.equals(TipoEquipo.LOCAL) ? puntosLocal : puntosVisitante;
    }

}
