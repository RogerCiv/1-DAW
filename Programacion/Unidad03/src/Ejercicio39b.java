

/**
 Realiza un programa que muestre por pantalla todas las tablas de multiplicar del 1
al 10.
 */
public class Ejercicio39b {
    public static void main(String[] args) {
        
        for(int i = 0 ; i<=10; i++){
            for(int j = 0; j<=10 ; j++){
                System.out.println(i+" X "+j+" = "+i*j);
            }
        }
    }
}
