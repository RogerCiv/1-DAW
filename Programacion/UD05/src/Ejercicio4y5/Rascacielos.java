package Ejercicio4y5;

public class Rascacielos extends Edificio {
    private int altura;


    public Rascacielos(String d, int np, int a) {
        super(d, np);
        if(a<0){
            throw new IllegalArgumentException("Altura de edificio negativa");
        }
        this.altura = a;
        //TODO Auto-generated constructor stub
    }


    public int getAltura() {
        return altura;
    }
    
}
