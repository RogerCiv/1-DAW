
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Roger
 */
public class Ejercicio47 {

    public static void main(String[] args) {

        //apartado A
        /*
            String[] esp = {"hola","casa", "caballo", "hacha", "manzana" , "ventana" , "tortuga", "ratón", "mesa"};
            String[] eng ={"hello", "house", "horse", "axe", "apple", "window", "turtle", "mouse", "table"};
            
            System.out.println("Introduce la palabra en espa;ol");
            String palabra = new Scanner(System.in).nextLine();
            
            for(int i = 0; i<esp.length;i++){
                if(palabra.equals(esp[i])){
                   
                        System.out.println(eng[i]);
                    }
                }
         */
 /*
        // Apartado B
        String[][] tabla = {
            {"hola", "hello"},
            {"casa", "house"},
            {"caballo", "horse"},
            {"hacha", "axe"},
            {"manzana", "apple"},
            {"ventana", "window"},
            {"tortuga", "turtle"},
            {"raton", "mouse"},
            {"mesa", "table"},};

        System.out.println("Introduce la palabra en espa;ol");
        String palabra = new Scanner(System.in).nextLine();
        
        for(int i = 0; i<tabla.length; i++){
            for(int j = 0 ; j < tabla[i].length;j++){
                if(palabra.equals(tabla[i][0])){
                    System.out.println(tabla[0][j]);
                }
            }
        }
         */
        // Ap[artado C
        Map<String, String> dicc = new HashMap<>();

        dicc.put("hola", "hello");
        dicc.put("casa", "house");
        dicc.put("caballo", "horse");
        dicc.put("hacha", "axe");
        dicc.put("manzana", "apple");
        dicc.put("ventana", "window");
        dicc.put("tortuga", "tortoise");
        dicc.put("raton", "mouse");
        dicc.put("mesa", "table");
        
        System.out.println("Introduce la palabra en espa;ol");
        String palabra = new Scanner(System.in).nextLine();
        
        if(dicc.containsKey(palabra)){
            System.out.println(dicc.get(palabra));
        }else{
            System.out.println("No existe en el dicc");
        }
    }
}
