package Ejercicio13a16;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
//es un tipo de generador de contraseñas que no puede generar contraseñas repetidas.
public class GeneradorContraseñasUnicas  extends GeneradorContraseñas{
    //En las propiedades posee un Set<String> en el que se van guardando todas las contraseñas generadas.
    private Set<String> contraseñasGeneradas;

    public GeneradorContraseñasUnicas(){
        this.contraseñasGeneradas = new HashSet<>();
    }

    public GeneradorContraseñasUnicas(Random r){
        super(r);
        this.contraseñasGeneradas = new HashSet<>();
    }
    //Se sobreescribirá el primer método generarContraseña para que las contraseñas se generan como en el ejercicio anterior,
    // pero cada vez que se genera una, se compruebe que no está en el Set<String>,
    // volviéndola a generar en caso de que sea así.
    @Override
    public String generarContraseña(int longitud){
        String password = super.generarContraseña(longitud);
        if(contraseñasGeneradas.contains(password)){
            contraseñasGeneradas.add(password);
        }
        return password;
    }
    //Se sobreescribirá el segundo método generarContraseña, para que se genere una contraseña de 12 caracteres de longitud.
    @Override
    public String generarContraseña(){
        return generarContraseña(12);
    }
}
