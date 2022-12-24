
/**
 * a) Crea una lista para guardar los nombres de los alumnos
 * b) Crea una tabla para guardar las notas de los alumnos, de tal forma que la fila 0 guarde
 * las notas del alumno que ocupe la posición 0 de la lista y así sucesivamente.
 *  Recuerda que una tabla es una lista de listas y podemos crearla así:
 * 1 2 3
 * 4 5 6
 * c) Haz un for para recorrer la lista de alumnos y después de mostrar el nombre de un
 * alumno, haz un for anidado que recorra la fila de la tabla donde están sus notas y
 * calcule su nota media.
 */
public class Ejercicio41b {

    public static void main(String[] args) {
        //Apartado A

        String[] nombres = {"pepe", "ana", "juan", "roberta"};

        int[][] tabla = {
            {9, 5, 4, 3},
            {4, 8, 10, 2},
            {2, 5, 10, 2},
            {10, 10, 10, 9}
        };
        
        double media = 0;
        for(int i = 0; i<nombres.length; i++){
              double suma = 0;
            System.out.println(nombres[i]);
          
            for(int j = 0; j<tabla[i].length; j++){
                suma+=tabla[i][j];
            }
            media=suma/tabla[i].length;
            System.out.println("La nota media es "+media);
        }
    }
}
