package clases.ejercicios.ejercicio29;

public class BolaDragon {
    // Propiedades de la clase (estaticas)
    private static final int MAXIMO_BOLAS = 7;
    private static int siguienteBola = 1;
    // Propiedades (variables de instancia, atributos, propiedades)
    private int numero;

    private BolaDragon(int numero) {
        this.numero = numero;
    }

    // getNúmero: devuelve el número de la bola de dragón.
    public int getNumero() {
        return numero;
    }

    /*
     * El método estático crearBolaDragón hace lo siguiente:
     * o Si se ha alcanzado la cantidad máxima de bolas creadas, el método lanzará
     * una
     * excepción con el mensaje “Ya se han creado 7 bolas de dragón”.
     * o En caso contrario, se creará una nueva bola de dragón con el número que
     * indique la propiedad “siguienteBola” y se devolverá. Además, la propiedad
     * “siguienteBola” se incrementará
     */
    public static BolaDragon crearBolaDragon() throws Exception{

        if(siguienteBola > MAXIMO_BOLAS){
            throw new Exception(" Ya se han creado 7 bolas de dragon");
        }
            BolaDragon bola = new BolaDragon(siguienteBola);
            siguienteBola++;       
            return bola;
    }
}
