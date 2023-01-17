package ejercicios.PROGRAMAREPASO;

import java.util.List;
import java.util.NoSuchElementException;

public interface CatalogoTitulos {
    
    public List<Titulo> getTitulos();
    public boolean guardar();
    public boolean añadirTitulo(String dni,String nombre, String estudio, Estado estado);
    public default Titulo getTitulo(String dni){
        Titulo respuesta = null;
        
        for(Titulo i : getTitulos()){
            if(i.getDNI().equals(dni)){
                respuesta = i;
            }else{
                throw new NoSuchElementException("No se encuentra DNI");
            }
        }
        return respuesta;
    }
        
    
}
