
import bpc.daw.consola.Consola;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 Usa la Consola DAW para realizar un programa que muestre 20 veces por pantalla
la frase "En clase no se juega" de forma que las primeras 10 veces aparezcan pegadas a la
izquierda y las siguientes 10 veces aparezcan pegadas a la derecha
 */
public class Ejercicio18b {
    public static void main(String[] args) {
            Consola c = new Consola();
        for(int i = 1 ; i<21; i++){
            if(i<11){
                c.getCapaTexto().print(i, 0, i+") En clase no se juega");
            }else{
                c.getCapaTexto().print(i-10, 30, i+") En clase no se juega");
            }
        }
        
        c.getTeclado().leerCaracter();
    }
}
