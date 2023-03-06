
/*package Clases;

import java.util.Random;

public class ProgramaHacker {
    public static void main(String[] args) {
      /*  LoginNovato login = new LoginNovato();
        String clave = generarClaveAleatoria(login.getLongitud());
        int aciertos = login.getNumeroAciertos(clave);
        while(aciertos != login.getLongitudClave()){
            String mutacion = introducirMutacion(clave);
            if(login.getNumeroAciertos(mutacion)>aciertos){
                clave = mutacion;
                aciertos = login.getNumeroAciertos(mutacion);
                System.out.println("Encontrada mejora: "+clave);
            }
        }
        */
        System.out.println("Clave encontrada: "+clave);
        
        /* ALGORITIMO GENÉNTICO */
        // Creamos una contraseña aleatoria de LENGHT caracteres
        // Se introduce una mutación aleatoria
        //si la clave con la mutación MEJORA la que ya había, nos quedamos con esa clave mutada
        // Y SE REPITE EL PROCESO HASTA ACERTAR LA CLAVE
        
    }
    private static String introducirMutacion(String clave){
       
        Random r = new Random();
        int posicion = r.nextInt(0,clave.length());
        int ascii = r.nextInt('0','z');
        String claveMutada= clave.substring(0,posicion)
                + (char)ascii
                + clave.substring(posicion+1);
        return claveMutada;
    }
    private static String generarClaveAleatoria(int longitud){
        String clave ="";
        Random r = new Random();
        for(int i=0;i<longitud;i++){
         int ascii = r.nextInt('0','z');
         clave += (char)ascii;        
        }      
        return clave;
    }
}
