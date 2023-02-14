package Colegio;

public record TutorLegal(String nombre, Alumno[] hijos) implements CalificacionListener{

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        // TODO Auto-generated method stub
        for(Alumno i : hijos){
            if(i.equals(a)){
                if(nota.getValoracion().esAprobado()){
                    System.out.println("Bien hecho "+i.nombre()+" has sacado un "+nota+" en "+p.getAsignatura());
                }else{
                    System.out.println("Muy mal "+i.nombre()+" has suspendido  "+p.getAsignatura()+" y te voy a matar");
                }
            }else{
                throw new IllegalArgumentException("Alumno no encontrado");
            }
        }
    }
    
}
