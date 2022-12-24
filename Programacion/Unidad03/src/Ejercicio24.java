
/**
 * Realiza un programa que use 4 listas (array) para guardar las notas de los
 * alumnos. A continuación, el programa mostrará el nombre de cada alumno y su nota media
 * Alumno/a Programación Base de datos Sistemas Nota FOL
 * Pepe 9 5 4 3
 * Ana 4 8 6 5
 * Juan 2 5 10 2
 * Roberta 10 10 10 9
 *
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        int[] pepe = {9, 5, 4, 3};
        int[] ana = {4, 8, 6, 5};
        int[] juan = {2, 5, 10, 2};
        int[] roberta = {10, 10, 10, 9};

        //double[] lista = new double [10];
        double pepe2 = 0;
        double ana2 = 0;
        double juan2 = 0;
        double roberta2 = 0;
        for (int i = 0; i < pepe.length; i++) {
            pepe2 += pepe[i];
        }
        for (int i = 0; i < ana.length; i++) {
            ana2 += ana[i];
        }
        for (int i = 0; i < juan.length; i++) {
            juan2 += juan[i];
        }
        for (int i = 0; i < roberta.length; i++) {
            roberta2 += roberta[i];
        }
        System.out.println(pepe2 / pepe.length);
        System.out.println(ana2 / ana.length);
        System.out.println(juan2 / juan.length);
        System.out.println(roberta2 / roberta.length);

      
    }
}
