package clases.ejercicios.ejercicio16;

public class DNIMejorado {
    private int  numero;
    private char letra;


    //Constructor
    //El constructor crea un DNI cuyo número se pasa como parámetro y cuya letra se
    //obtiene llamando al método privado calcularLetra.

    public DNIMejorado(int n){
        numero = n;
        letra=calcularLetra();
    }

    //Metodos

    //Los métodos getNúmero y getLetra devuelven el número y la letra del DNI
    public int getNumero(){
        return numero;
    }
    public char getLetra(){
        return letra;
    }

    //El método privado calcularLetra recibe un número y nos devuelve la letra que tendría
    //el DNI correspondiente a ese número teniendo en cuenta el procedimiento del
    //ejercicio 19 del tema 4.

    private char calcularLetra(){
        char[] lista = {'T','R','W','A','G','M','Y','F','P','D','X','B',
        'N','J','Z','S','Q','V','H','L','C','K','E','T'}; 
        return lista[this.numero % 23];
    }
}
