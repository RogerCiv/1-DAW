package Ejercicio31;

public class EfectoInverso implements Simetrico, EfectoEspecial {
    
    EfectoInverso(){
        
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return  TipoEfecto.INVERSO.name();
    }

    @Override
    public String aplicarEfecto(String frase) {
        // TODO Auto-generated method stub
        return new StringBuilder(frase).reverse().toString();
    }    

    
}
