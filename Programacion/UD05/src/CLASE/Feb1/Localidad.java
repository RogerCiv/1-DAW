package CLASE.Feb1;

public record Localidad(int id,String nombre) implements Comparable<Localidad>{

    @Override
    public int compareTo(Localidad l) {
        // TODO Auto-generated method stub
        return this.nombre.compareTo(l.nombre);
        //return this.id - l.id;
    }
   
}
