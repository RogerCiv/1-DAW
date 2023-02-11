package Ejercicio13a16;

import java.util.Random;

public class GeneradorContraseñas {
    //Es una clase que genera contraseñas aleatorias y utiliza para ello la clase StringBuilder, de la librería estándar de Java.
    //La propiedad “random” es el objeto que la clase usa internamente para generar números aleatorios que den lugar a las letras de las contraseñas.
    private Random random;

    //El primer constructor crea un generador de contraseñas, creando su Random interno.
    public GeneradorContraseñas(){
        this.random = new Random();
    }
    //El segundo constructor crea un generador de contraseñas con el Random suministrado
    public GeneradorContraseñas(Random r){
        this.random = r;
    }
    //El primer generarContraseña genera una contraseña usando el total de caracteres pasado como parámetro. La contraseña se generará así:
    //o Se empieza generando un número aleatorio entre 0, 1 y 2.
    //o Si el número sale 0, generará aleatoriamente otro número entre 48 y 57 (ese es el rango de los códigos ASCII de los números).
    //o Si el número sale 1, generará aleatoriamente otro número entre 65 y 90 (ese es el rango de los códigos ASCII de las letras mayúsculas).
    //o Si el número sale 2, generará aleatoriamente un número entre 97 y 122, (ese es el rango de los códigos ASCII de las letras minúsculas).
    //o Se añadirá a la contraseña el carácter cuyo código ascii se ha generado. Aunque no es imprescindible, se aconseja usar la clase StringBuilder para ir
    //construyendo el String de la contraseña.
    public String generarContraseña(int longitud){

        StringBuilder respuesta = new StringBuilder();
        
      /*
       *   for(int i= 0; i<longitud ; i++){
            int r = new Random().nextInt(3);
            if(r==0){
                int num1 = new Random().nextInt(48, 58);
                
                respuesta.append((char) num1);
            }else if(r==1){
                int num2 = new Random().nextInt(65, 91);

                respuesta.append((char) num2);
            }else if(r==2){
                int num3 = new Random().nextInt(97, 122);
                respuesta.append((char) num3);
            }

        }
       */
      int[][] rangos = {
        {48,57},
        {64,91},
        {97,123}
      };
      for(int i= 0; i<longitud ; i++){
         int filaAleatoria = random.nextInt(3);
         int aleatorio = random.nextInt(rangos[filaAleatoria][0],rangos[filaAleatoria][1]);
         respuesta.append((char) aleatorio);
      }

        return respuesta.toString();

    }

    public String generarContraseña(){
        //El segundo generarContraseña genera una contraseña de 8 caracteres de longitud.
        return generarContraseña(8);
    }
/*
    public static void main(String[] args) {
        GeneradorContraseñas c = new GeneradorContraseñas();

        for(int i = 0; i<4; i++){
            System.out.println(c.generarContraseña(4*(i+1)));
        }
    }
    */
}
