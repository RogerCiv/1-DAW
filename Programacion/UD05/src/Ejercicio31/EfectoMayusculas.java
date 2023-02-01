package Ejercicio31;

public class EfectoMayusculas implements EfectoEspecial {
    
    EfectoMayusculas(){

    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return TipoEfecto.MAYUSCULAS.name();
    }

    @Override
    public String aplicarEfecto(String frase) {
        // TODO Auto-generated method stub
      
        return frase.toUpperCase();
    }

}
