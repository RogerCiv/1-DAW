package ejercicios.Ejercicio29;

public class BolaDragon {
   // La propiedad estática MAXIMO_BOLAS indica la cantidad máxima de bolas que se
    //pueden crear. Se inicializará a 7. La palabra “final” que la acompaña nos indica que esa
    //propiedad se convierte en constante, y por tanto, no se podrá modificar.
    private static int MAXIMO_BOLAS = 7;
    //La propiedad estática siguienteBola es el número de la siguiente bola de dragón que se
    //generará. Por defecto, valdrá 1.
    private static int siguienteBola = 1 ;
    private int numero;

    private BolaDragon(int numero){
        this.numero = numero;
    }
    //getNúmero: devuelve el número de la bola de dragón
    public int getNumero(){
        return numero;
    }
    //El método estático crearBolaDragón hace lo siguiente:
    // Si se ha alcanzado la cantidad máxima de bolas creadas, el método lanzará una
    //excepción con el mensaje “Ya se han creado 7 bolas de dragón”.
    // En caso contrario, se creará una nueva bola de dragón con el número que
    //indique la propiedad “siguienteBola” y se devolverá. Además, la propiedad “siguienteBola” se incrementará.
    public static BolaDragon crearBolaDragon() throws Exception{
        if(siguienteBola > MAXIMO_BOLAS){
            throw new Exception("Ya se han creado 7 bolas de dragon");
        }
        BolaDragon bola = new BolaDragon(siguienteBola);
        siguienteBola++;
        return bola;
    }
}
