package ejercicios.PROGRAMAREPASO;

public class TituloArchivo implements Titulo {
    
    private String dni;
    private String nombre;
    private String estudios;
    private Estado estado;

    public TituloArchivo(String d, String n, String e, Estado s){
        this.dni = d;
        this.nombre = n;
        this.estudios = e;
        this.estado = s;
    }


    public String toString(){
        return getDNI()+";"+getNombre()+";"+getEstudios()+";"+getEstado().ordinal();
    }


    @Override
    public String getDNI() {
        // TODO Auto-generated method stub
        return this.dni;
    }


    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return this.nombre;
    }


    @Override
    public String getEstudios() {
        // TODO Auto-generated method stub
        return this.estudios;
    }


    @Override
    public Estado getEstado() {
        // TODO Auto-generated method stub
        return this.estado;
    }


    @Override
    public void setEstado(Estado e) {
        // TODO Auto-generated method stub
        this.estado = e;
    }
}
