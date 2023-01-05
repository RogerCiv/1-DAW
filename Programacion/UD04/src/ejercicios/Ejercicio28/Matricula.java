package ejercicios.Ejercicio28;

public class Matricula {
    //La propiedad estática guarda el siguiente número que se usará para matricular a un
    //alumno. El primer número de matrícula disponible será el 1
    private static int siguienteNumeroMatricula=1;
    private int numeroMatricula;
    private String nombreAlumno;
    private String nombreAsignatura;


    //El constructor crea una matrícula para un alumno en la asignatura indicada. Su número
    //de matrícula será el que indique la propiedad estática “siguienteNúmeroMatrícula”,
    //que deberá incrementarse una vez asignado dicho número a una matrícula concreta.
    public Matricula(String nombreAlumno, String nombreAsignatura){
        this.nombreAlumno = nombreAlumno;
        this.nombreAsignatura = nombreAsignatura;
        this.numeroMatricula = siguienteNumeroMatricula++;
    }
    //Los getters devuelven los valores de las propiedades.
    public String getNombreAlumno(){
        return nombreAlumno;
    }
    public String getNombreAsignatura(){
        return nombreAsignatura;
    }
    public int getNumeroMatricula(){
        return numeroMatricula;
    }
}
