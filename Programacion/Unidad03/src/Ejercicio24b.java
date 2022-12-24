
/**
 * Realiza un programa que use 4 listas (array) para guardar las notas de los
 * alumnos. A continuación, el programa mostrará el nombre de cada alumno y su nota media
 * Alumno/a Programación Base de datos Sistemas Nota FOL
 * Pepe 9 5 4 3
 * Ana 4 8 6 5
 * Juan 2 5 10 2
 * Roberta 10 10 10 9
 */
public class Ejercicio24b {

    public static void main(String[] args) {

        int[] pepe = {9, 5, 4, 3};
        int[] ana = {4, 8, 10, 2};
        int[] juan = {2, 5, 10, 2};
        int[] roberta = {10, 10, 10, 9};
        
        double notaPepe = 0;
        for(int i= 0;i<pepe.length;i++){
            notaPepe+=pepe[i];
        }
        
        System.out.println(notaPepe/pepe.length);
    }

}
