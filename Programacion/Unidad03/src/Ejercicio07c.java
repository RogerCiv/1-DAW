import java.util.Scanner;

/**
Según el reglamento de la federación de caza, un cazador no puede cazar más
piezas de las que se permiten en un día. Queremos hacer un programa que nos lleve la cuenta
de piezas cazadas e indique cuando se ha excedido el límite. Para ello primero se leerá por
teclado el límite del día y a continuación los valores de las piezas cazadas en el orden que se
obtienen. El programa imprimirá un mensaje en el momento en que el límite haya sido
excedido. Después de que cada pieza ha sido registrada, el programa mostrará el número total
de piezas que se llevan hasta ese momento cazadas. 
 */
public class Ejercicio07c {
    public static void main(String[] args) {
        
        int piezas = 30;
        int contador = 0;
        while(contador<30){
            System.out.println("Cuantas piezas se pueden cazar hoy?: "+piezas);
            System.out.println("Cuantas piezas has cazado? :");
            int num = new Scanner(System.in).nextInt();
              if(contador>30){
                System.out.println("Te has pasado cazando");
            }else{
            contador+=num;
              }
            System.out.println("Llevas "+contador+" piezas de "+piezas+" posible");
          
        }
    }
}
