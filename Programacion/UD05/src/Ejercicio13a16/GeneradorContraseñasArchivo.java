package Ejercicio13a16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorContraseñasArchivo extends GeneradorContraseñas {
    private File archivo;


    public GeneradorContraseñasArchivo(String ruta){
        this.archivo = new File(ruta);
    }
    
    public GeneradorContraseñasArchivo(String ruta, Random r){
        super(r);
        this.archivo = new File(ruta);
    }
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
