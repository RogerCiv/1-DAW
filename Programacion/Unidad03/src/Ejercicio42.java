
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger
 */
public class Ejercicio42 {
    public static void main(String[] args) {
        
        String[] diasSemana={"lunes","martes","miercoles","jueves","viernes"};
        String[] horasDia={"8:15-9:15","9:15-10:15","10:15-11:15","11:15-11:45","11:45-12:45","12:45-13:45","13:45:14:45"};
        String[][]asignaturas={
            {"Bases de datos","Sistemas informáticos","Formación y orientación laboral","Entornos de desarrollo","Bases de datos"},
            {"Bases de datos","Sistemas informáticos","Formación y orientación laboral","ED","Bases de datos"},
            {"Programación","Formación y orientación laboral","Programación","Programación","Lenguaje de marcas"},
            {"RECREO","RECREO","RECREO","RECREO","RECREO"},
            {"Programación","Entornos de desarrollo","Programación","Programación","Lenguaje de marcas"},
            {"Sistemas informáticos","Programación","Bases de datos","Lenguaje de marcas","Sistemas informáticos"},
            {"Sistemas informáticos","Programación","Bases de datos","Lenguaje de marcas","Sistemas informáticos"},
        };
        System.out.println("Introduce nombre de un dia:");
        String diaUsuario = new Scanner(System.in).nextLine();
        int diasSemanaFin = diasSemana.length;
        for(int i = 0; i<diasSemanaFin; i++){
            String posi = diasSemana[i];
            for(int j = 0; j<7; j++){
                boolean seleccion = diaUsuario.equals(posi);
                if(seleccion==true){
                    System.out.println(horasDia[j]+ " ===== "+asignaturas[i][j]);
                }
            }
        }
    }
}
