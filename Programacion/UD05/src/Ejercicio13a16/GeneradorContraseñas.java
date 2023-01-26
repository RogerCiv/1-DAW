package Ejercicio13a16;

import java.util.Random;

public class GeneradorContraseñas {
    private Random random;

    public GeneradorContraseñas(){
        random = new Random();
    }

    public GeneradorContraseñas(Random r){
        this.random = r;
    }

    public String generarContraseña(int longitud){

        StringBuilder respuesta = new StringBuilder();
        
        for(int i= 0; i<longitud ; i++){
            int r = new Random().nextInt(3);
            if(r==0){
                int num1 = new Random().nextInt(48, 57);
                
                respuesta.append((char) num1);
            }else if(r==1){
                int num2 = new Random().nextInt(65, 90);

                respuesta.append((char) num2);
            }else if(r==2){
                int num3 = new Random().nextInt(97, 122);
                respuesta.append((char) num3);
            }

        }

        return respuesta.toString();

    }

    public String generarContraseña(){

        return generarContraseña(8);
    }
}
