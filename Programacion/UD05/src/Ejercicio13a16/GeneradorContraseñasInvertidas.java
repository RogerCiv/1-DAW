package Ejercicio13a16;

import java.util.Random;

public class GeneradorContraseñasInvertidas extends GeneradorContraseñasUnicas{
    //es un tipo de generador de contraseñas únicas que genera una contraseña única y después le cambia todas las letras que estén en
    //mayúsculas por minúsculas, y viceversa.

    public GeneradorContraseñasInvertidas(){
      super();
    }
    public GeneradorContraseñasInvertidas(Random r){
        super(r);
    }
    @Override
    public String generarContraseña(int longitud) {
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

        for(int i = 0; i<respuesta.length(); i++){
            char pw = respuesta.charAt(i);
            if(Character.isUpperCase(pw)){
                respuesta.setCharAt(i, Character.toLowerCase(pw));
            }else{
                respuesta.setCharAt(i, Character.toUpperCase(pw));
            }
        }

        return respuesta.toString();

    }
    
}
