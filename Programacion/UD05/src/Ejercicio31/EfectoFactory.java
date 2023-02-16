package Ejercicio31;

public class EfectoFactory {
    
    public static EfectoEspecial getEfecto(TipoEfecto tipo){
        //EfectoEspecial respuesta = null;
        /*if(TipoEfecto.CORCHETES.equals(tipo)){
            respuesta = new EfectoCorchetes();
        }else if(TipoEfecto.GUIONES.equals(tipo)){
            respuesta = new EfectoGuiones();
        }else if(TipoEfecto.INVERSO.equals(tipo)){
            respuesta = new EfectoInverso();
        }else if(TipoEfecto.MAYUSCULAS.equals(tipo)){
            respuesta = new EfectoMayusculas();
        }else {
            throw new IllegalArgumentException("Ese tipo no existe!");
        }
        return respuesta;
        */
        return switch(tipo){
            case INVERSO -> new EfectoInverso();
            case CORCHETES -> new EfectoCorchetes();
            case GUIONES -> new EfectoGuiones();
            case MAYUSCULAS -> new EfectoMayusculas();
            default -> throw new IllegalArgumentException("Ese tipo no existe!");
        };
    }
}
