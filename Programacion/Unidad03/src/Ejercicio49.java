/*
Realiza el famoso juego del ahorcado de la siguiente manera: 
 Haz un ArrayList<String> llamado "palabras" en el que guardarás la lista de palabras 
disponibles en el juego, y una variable llamada "vidas" con el valor 4. 
 Usa la clase Collections para desordenar aleatoriamente la lista, y saca la primera 
palabra que haya en la lista, borrándola de ella al sacarla. 
 Cuenta el número de letras que hay en la variable "palabra" y haz un array de 
booleanos de ese tamaño llamado "aciertos", todos con el valor inicial false. 
Cada booleano controla si la letra que hay en la posición correspondiente de la 
 variable "palabra" ha sido adivinada por el usuario. 
42 
 Haz una variable String llamada "vistaUsuario" que estará formada de la siguiente 
forma: se recorre el array "aciertos" y por cada false, se añade un guión (-). Por cada 
true, se pone la letra de la variable "palabra" que se corresponde con la posición del 
booleano. 
 Muestra por pantalla las variables "vistaUsuario" y "vidas". 
 Pide una letra al usuario y comprueba si está dentro de la variable "palabra". En caso 
de encontrarla, pon a true todos los booleanos que se correspondan con la posición de 
la letra encontrada y actualiza la variable "vistaUsuario". En caso de no encontrarla, 
haz que el usuario pierda una vida. 
 Repite los dos últimos puntos hasta que el usuario pierda o acierte la palabra. Muestra 
un mensaje de éxito o fracaso al final de la partida. 
 Si el usuario acierta la palabra, repite el proceso sacando nuevamente la primera 
palabra de la lista, hasta que el usuario acierte todas las palabras o pierda sus vidas. 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio49 {

    public static void main(String[] args) {

        String[] lista = {"mano","pie","oreja","raton"};       
        List<String> palabras = new ArrayList<>();
        
        for(String palabra : lista){
            palabras.add(palabra);
        }
        
        Random rnd = new Random();
        
        Collections.shuffle(palabras, rnd);
        
        int vidas = 4;
        
        String palabra = "";
        
        boolean acertado = true;
        
        for(int i = 0; acertado;i++){
            palabra = palabras.get(i);
            
            palabras.remove(palabra);
            
            int tamaño = palabra.length();
            
            boolean[] aciertos = new boolean[tamaño];
            
            List<Character> letras = new ArrayList<>();
            
            for(int j = 0; j<palabra.length();j++){
                
                char letra = palabra.charAt(j);
                
                letras.add(letra);
                
            }
            
            String pred = "-";         
            
            List<String> vistaUsuario = new ArrayList<>();
            
            for(int l = 0;l<palabra.length();l++){
                vistaUsuario.add(pred);
            }
            
            for(int m = 0;m<palabra.length() && acertado;m++){
                
                System.out.print("Introduce una letra: ");
                char letra = new Scanner(System.in).nextLine().charAt(0);
                
                int posicion = 0;
                
                if(letras.contains(letra)){
                    
                    posicion = letras.indexOf(letra);
                    
                    aciertos[m] = true;
                    
                    for(int n = 0;n<aciertos.length;n++){
                        if(aciertos[n] != false){
                            String letra2 = String.valueOf(letra);
                            vistaUsuario.remove(posicion);
                            vistaUsuario.add(posicion, letra2);
                        }
                    }
                    System.out.println("Vista usuario: "+vistaUsuario);
                }else{
                    vidas--;
                }
                System.out.println("Vidas: "+vidas);   
                
                if(m==4){
                    System.out.print("¿Sabes que palabra es?: ");
                    String respuesta = new Scanner(System.in).nextLine();

                    if (respuesta.equals(palabra)){
                        System.out.println("Es la palabra correcta!!");
                        acertado = false;
                    }else{
                        System.out.print("Es incorrecta");
                        acertado = false;
                    }
                }
            }
            
            vidas = 4;            
                            
        }
        
    }
}