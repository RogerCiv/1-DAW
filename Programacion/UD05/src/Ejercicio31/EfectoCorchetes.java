package Ejercicio31;

public class EfectoCorchetes implements EfectoEspecial, Simetrico {

     EfectoCorchetes() {
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return TipoEfecto.CORCHETES.name();
    }

    @Override
    public String aplicarEfecto(String frase) {
        // TODO Auto-generated method stub
        StringBuilder respuesta =null;
        if(frase.startsWith("[") && frase.endsWith("]")){
        
           StringBuilder texto = new StringBuilder(frase).deleteCharAt(0);
            texto = new StringBuilder(texto).deleteCharAt(texto.length()-1);
            respuesta = texto;
        }else{
            respuesta = new StringBuilder(frase).insert(0, '[').insert(frase.length()+1, ']');
        }
        return respuesta.toString();
    }
    
}
