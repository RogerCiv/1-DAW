package Colegio;

public enum Valoracion {
    MUY_DEFICIENTE,INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE;


    public boolean esAprobado(){
        return ordinal()>1;
    }

    public boolean esSuspenso(){
        return ordinal()<=1;
    }
}
