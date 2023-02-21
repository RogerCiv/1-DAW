package Colegio;

public record Nota(double valorNumerico) {
    public Valoracion getValoracion(){
        Valoracion respuesta = null;
       
       if(valorNumerico>0 && valorNumerico <=10){
        if(valorNumerico<3){
            respuesta = Valoracion.MUY_DEFICIENTE;
        }else if(valorNumerico <5){
            respuesta = Valoracion.INSUFICIENTE;
        }else if(valorNumerico<6){
            respuesta = Valoracion.SUFICIENTE;
        }else if(valorNumerico <7){
            respuesta = Valoracion.BIEN;
        }else if (valorNumerico <9){
            respuesta = Valoracion.NOTABLE;
        }else{
            respuesta = Valoracion.SOBRESALIENTE;
        }
       }else{
        throw new IllegalArgumentException("Valor nota negativo");
       }
       
        return respuesta;
    }
}
