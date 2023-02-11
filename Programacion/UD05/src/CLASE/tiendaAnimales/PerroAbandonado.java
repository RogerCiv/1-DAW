package CLASE.tiendaAnimales;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PerroAbandonado extends Perro {
    private Set<String> enfermedades;

    //Crea un perro abandonado y un numero entre 0 y 4 enfermedades aleatorias.
    public PerroAbandonado(String n,int p,String r) {
        super(n,p,r);
        this.enfermedades = new HashSet<>();
        rellenarEnfermedadesAleatoriamente();
        //TODO Auto-generated constructor stub
    }

    private void rellenarEnfermedadesAleatoriamente(){
        String[] enfermedadesPosibles = {
            "rabia","sarna","pulgas","covid"
        };
        Random r = new Random();
        int numeroEnfermedades = r.nextInt(enfermedadesPosibles.length);
        for(int i = 0; i<numeroEnfermedades; i++){
            int enfermedad = r.nextInt(enfermedadesPosibles.length);
            enfermedades.add(enfermedadesPosibles[enfermedad]);
        }
    }

    public Set<String> getEnfermedades() {
        return this.enfermedades;
    }

    public boolean estaSano(){
        return enfermedades.isEmpty();
    }    

    
    
}
