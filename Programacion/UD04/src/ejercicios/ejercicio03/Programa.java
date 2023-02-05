package ejercicios.ejercicio03;

public class Programa {
    public static void main(String[] args) {
        MarcadorBaloncesto m = new MarcadorBaloncesto("CB Granada", "Estudiantes");
        m.añadirCanasta('L', 3);
        m.añadirCanasta('L', 2);
        System.out.println(m.getPuntosLocal());
    }
}
