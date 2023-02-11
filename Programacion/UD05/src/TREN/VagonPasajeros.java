package TREN;

import java.util.ArrayList;
import java.util.List;

public class VagonPasajeros extends VagonPesoLimitado{
    
   

    private List<Persona> personas;

    public VagonPasajeros(int pm) {
        super(pm);
        //TODO Auto-generated constructor stub
        this.personas = new ArrayList<>();
    }
    public void subir(Persona p){
        if(p.getMaleta() != null){
            boolean repetir = true;
            while(getVagonSiguiente() instanceof Vagon  || repetir){
                if(getVagonSiguiente() instanceof  VagonEquipaje ve){
                    ve.añadir(p.getMaleta());
                      repetir = false;          
                }else{
                    throw new IllegalArgumentException("No se puede guardar la maleta del pasajero");
                }
            }
        }
        this.personas.add(p);
        comprobarPesoMaximoExcedido(); 
    }
    public void bajar(Persona p){
        if(p.getMaleta() != null){
            boolean repetir = true;
            while(getVagonSiguiente() instanceof Vagon  || repetir){
                if(getVagonSiguiente() instanceof  VagonEquipaje ve){
                    ve.retirar(p.getMaleta());
                      repetir = false;          
                }else{
                    throw new IllegalArgumentException("No se puede guardar la maleta del pasajero");
                }
            }
        }
      
        this.personas.remove(p);
    }

    @Override
    public int getPeso() {
        // TODO Auto-generated method stub
        int peso = 0;
        for(Persona i: personas){
            peso += i.getPeso();
        }
        return peso;
    }
    
}
