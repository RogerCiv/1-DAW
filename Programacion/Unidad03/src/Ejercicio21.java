import bpc.daw.consola.*;
import java.awt.*;

/*
: Usa la Consola DAW para hacer un programa que pregunte al usuario un número
de segundos. El programa finalizará cuando pase la cantidad de segundos introducida y
durante ese tiempo se dibujará y actualizar en la pantalla una barra de progreso como esta: 
 */
public class Ejercicio21 {
    public static void main(String[] args){
        Consola cons = new Consola();
        
        Fondo fon = new FondoColorSolido(Color.white);
        cons.getCapaFondo().setFondo(fon);
        
        cons.getCapaTexto().setColorTexto(Color.BLACK);
        
        cons.getCapaTexto().print("Introduzca el número de segundos: ");
        int seg = cons.getTeclado().leerNumeroEntero();
        
        boolean repetir= true;
        
        int ancho = 800;
        
        int rellenador = 0;
        
        int num = 100/seg;
        int porcentaje = 100/seg;
        
        int i = 0;
        
        

        
        while(repetir){
            
            int fragmento = ancho/seg;
            
            i++;
            
            rellenador+=fragmento;        

            try{
            Thread.sleep((seg/seg)*1000);
            
            Graphics llena = cons.getCapaCanvas().getGraphics();
            llena.setColor(Color.blue);
            llena.fillRect(50, 540,rellenador , 50);
            
            Graphics barra = cons.getCapaCanvas().getGraphics();
            barra.drawRect(50, 540, ancho, 50);
            barra.setColor(Color.black);
                        
            Graphics progreso = cons.getCapaCanvas().getGraphics();
            progreso.drawString(num+" %", 860, 590);
                     
            Graphics esperando = cons.getCapaCanvas().getGraphics();
            esperando.drawString("Esperando finalización... ("+i+" seg de "+seg+")", 50, 640);
            
            num+=porcentaje;
            
            }catch(InterruptedException error){
                System.out.println("Error");
            }
                        
            if(rellenador>ancho){
                repetir= false;
            }
                
        }
        
    }
           
}