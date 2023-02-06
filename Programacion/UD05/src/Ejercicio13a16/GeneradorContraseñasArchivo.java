package Ejercicio13a16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
// es un tipo de generador de contraseñas que guarda todas las contraseñas que genera en un archivo.
public class GeneradorContraseñasArchivo extends GeneradorContraseñas {
    //En las propiedades posee un File que indica la ruta del archivo donde se irán guardando las contraseñas generadas.
    private File archivo;

    public GeneradorContraseñasArchivo(String ruta){
        this.archivo = new File(ruta);
    }
    
    public GeneradorContraseñasArchivo(String ruta, Random r){
        super(r);
        this.archivo = new File(ruta);
    }

    //Las contraseñas se generan como en el ejercicio 14, pero cada vez que se genera una, deberá añadirse al archivo (se añadirá al final del archivo una línea con la
    //nueva contraseña). Se recomienda usar la clase FileWriter para programar el método.
    @Override
    public String generarContraseña(int longitud){
        String password = super.generarContraseña(longitud);

        try{
            FileWriter file = new FileWriter(archivo,true);
            file.write(password+"\n");
            file.close();
        }catch(IOException error){
            System.out.println("Error");
        }
        return password.toString();
    }
}
