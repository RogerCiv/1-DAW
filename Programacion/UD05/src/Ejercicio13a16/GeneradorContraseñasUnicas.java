package Ejercicio13a16;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneradorContraseñasUnicas  extends GeneradorContraseñas{
    
    private Set<String> contraseñasGeneradas;

    public GeneradorContraseñasUnicas(){
        this.contraseñasGeneradas = new HashSet<>();
    }

    public GeneradorContraseñasUnicas(Random r){
        super(r);
    }

    @Override
    public String generarContraseña(int longitud){
        String password = super.generarContraseña(longitud);
        if(contraseñasGeneradas.contains(password)){
            contraseñasGeneradas.add(password);
        }
        return password;
    }

    @Override
    public String generarContraseña(){
        return generarContraseña(12);
    }
}
