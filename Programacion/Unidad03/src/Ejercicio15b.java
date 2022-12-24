
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;



/**
 sa las clases LocalDate y DateTimeFormatter para hacer un programa que
pregunte al usuario un número de mes (entre 1 y 12) y un año. El programa mostrará por
pantalla todos los días de ese mes, con el siguiente formato: “día/mes/año y día de la semana”
 */
public class Ejercicio15b {
    public static void main(String[] args) {
        
        System.out.println("Introduce un dia del mes (1 a 12)");
        int mes = new Scanner(System.in).nextInt();
        System.out.println("Introduce un year");
        int year = new Scanner(System.in).nextInt();
        
        int dia = 1;
        LocalDate fecha = LocalDate.of(year,mes,dia);
    
        while(dia <fecha.lengthOfMonth()+1){
            LocalDate fecha2 = LocalDate.of(year, mes, dia);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy/eeee");
            System.out.println(fecha2.format(formato));
            dia++;
            
        }
        
    }
}
