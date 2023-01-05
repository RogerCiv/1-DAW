package daw.persona;
//Ejercicio 01 Clase DNI

public class DNI {
    
    public int numero;
    public char letra;


    public DNI(int n, char l){
        numero = n;
        letra = l;
    }

    public DNI(String dni){
        this(Integer.parseInt(dni.substring(0,8)), dni.charAt(8));
    }
}
