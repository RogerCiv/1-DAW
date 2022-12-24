
import bpc.daw.consola.Consola;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Roger
 */
public class Ejercicio09c {

    public static void main(String[] args) {
        Consola c = new Consola();
        Graphics gra = c.getCapaCanvas().getGraphics();

        c.getCapaTexto().println("Cuantos ciruclos quieres");
        int circulos = c.getTeclado().leerNumeroEntero();
        Random random = new Random();
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension medidas = tool.getScreenSize();

        if (circulos > 0) {
            for(int i = 0 ; i<circulos;i++){
            int medidaX = medidas.width;
            int medidaY = medidas.height;

            int x = random.nextInt(0, medidaX);
            int y = random.nextInt(0, medidaY);
            int r = random.nextInt(0, 255);
            int g = random.nextInt(0, 255);
            int b = random.nextInt(0, 255);
            
            Color color = new Color(r,g,b);
            gra.setColor(color);
            gra.fillOval(x, y, 80, 80);

                
            }
                        

        }else{
            c.getCapaTexto().println("Numero negativo");
        }
        
        c.getTeclado().leerCaracter();
    }
}
