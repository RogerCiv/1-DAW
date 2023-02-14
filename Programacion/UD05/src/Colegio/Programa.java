package Colegio;

public class Programa {
    public static void main(String[] args) {
        EmpleadoColegio director = new DirectorColegio("Antonio", "IES Granada Capital");
        EmpleadoColegio jefe = new JefeEstudios("Alberoto", "IES Granada Capital");
        Profesor pMatematicas = new Profesor("Luis", "Matematicas");
        Profesor pHistoria = new Profesor("Juan", "Historia");

        
    }
}
