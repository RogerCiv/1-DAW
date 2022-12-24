
import bpc.daw.consola.Consola;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        
        Consola c = new Consola();
        
        c.getCapaTexto().println("Introduce una cantidad en segundos");
        int segundos = c.getTeclado().leerNumeroEntero();
        
        
        
        try{
           Thread.sleep(segundos*1000);
           
           c.getCapaTexto().setTamTexto(22);
           c.getCapaTexto().print(20, 30, "HOLA");
        }catch(InterruptedException error){
            System.out.println("error");
        }
         
        
        
        c.getTeclado().leerCaracter();
    }
}
