package Ejercicio13a16;

import java.util.Random;

public class GeneradorContraseñasRaras extends GeneradorContraseñasUnicas {

    public GeneradorContraseñasRaras(){
        super();
    }

    public GeneradorContraseñasRaras(Random r){
        super(r);
    }

    @Override
    public String generarContraseña(int longitud) {
        StringBuilder respuesta = new StringBuilder();
        
        for(int i= 0; i<longitud ; i++){
            int r = new Random().nextInt(3);
            if(r==0){
                int num1 = new Random().nextInt(48, 57);
                num1+=122;
                respuesta.append((char) num1);
            }else if(r==1){
                int num2 = new Random().nextInt(65, 90);
                num2+=122;
                respuesta.append((char) num2);
            }else if(r==2){
                int num3 = new Random().nextInt(97, 122);
                num3+=122;
                respuesta.append((char) num3);
            }

        }
        return respuesta.toString();
    }
    
}
