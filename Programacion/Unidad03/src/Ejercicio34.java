
/**
 * : Calcula la suma de los cuadrados de los números comprendidos entre 5 y 13:  *
 */
public class Ejercicio34 {

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 5; i <= 13; i++) {
            suma += Math.pow(i, 2);
        }
        System.out.println(suma);
    }
}
