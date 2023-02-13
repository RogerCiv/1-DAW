package Ejercicio31;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Introduce una frase para aplicarle efectos: ");
        String frase = new Scanner(System.in).nextLine();
    
        System.out.println("""
                1) Aplicar todos los efectos a la frase.
                2) Aplicar solo los efectos simetricos.
                """);
        int opcion = new Scanner(System.in).nextInt();
        
        switch(opcion){
            case 1 -> {
                for(TipoEfecto i : TipoEfecto.values()){
                    
                    System.out.println(EfectoFactory.getEfecto(i).aplicarEfecto(frase));
                }
            }
            case 2 ->{
                for(TipoEfecto i : TipoEfecto.values()){
                    if(i.name().equalsIgnoreCase("inverso") || i.name().equalsIgnoreCase("corchetes")){
                        System.out.println(EfectoFactory.getEfecto(i).aplicarEfecto(frase));
                    }
                }

            }
            default -> System.out.println("Elija opcion 1 o 2");
        }
    }
  
}
