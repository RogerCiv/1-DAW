package Ejercicio31;

public class EfectoGuiones implements EfectoEspecial {
    EfectoGuiones(){

    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return TipoEfecto.GUIONES.name();
    }

    @Override
    public String aplicarEfecto(String frase) {
        
       // return new StringBuilder(frase).replace(frase.indexOf(" "), frase.indexOf(" ")+1, "_").toString();
        return frase.replace(" ", "_");
      }
    
}
