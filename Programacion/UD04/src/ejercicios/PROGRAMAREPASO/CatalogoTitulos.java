package ejercicios.PROGRAMAREPASO;

import java.util.List;
import java.util.NoSuchElementException;

public interface CatalogoTitulos {
    
    public List<Titulo> getTitulos();
    public boolean guardar();
    public boolean añadirTitulo(String dni,String nombre, String estudio, Estado estado);
    public default Titulo getTitulo(String dni){
        Titulo respuesta = null;
        
        /*for(Titulo i : getTitulos()){
            if(i.getDNI().equals(dni)){
                respuesta = i;
            }else{
                throw new NoSuchElementException("No se encuentra DNI");
            }
        }*/
        List<Titulo> titulos = getTitulos();
        for(int i = 0; i< titulos.size() &&  respuesta == null; i++){
            Titulo ti = titulos.get(i);
            if(dni.equals(ti.getDNI())){
                respuesta = ti;
            }
        }
        if(respuesta == null){
            throw new NoSuchElementException("No se encuentra DNI");
        }

        return respuesta;
    }
        
    
}
