
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
public class Ejercicio16c {
    public static void main(String[] args) {
        Consola c = new Consola();
        Graphics gra = c.getCapaCanvas().getGraphics();
        Random random = new Random();
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dimensiones = tool.getScreenSize();
        int medidaX = (int) dimensiones.getWidth();
        int medidaY = (int) dimensiones.getHeight();
        
        c.getCapaTexto().println("Introduce numero de rect");
        int rect = c.getTeclado().leerNumeroEntero();
        
        
        for(int i = 0; i<rect; i++){
            
            int r = random.nextInt(0, 255);
            int g = random.nextInt(0, 255);
            int b = random.nextInt(0,255);
            int x = random.nextInt(0,medidaX);
            int y = random.nextInt(0,medidaY);
            int w = random.nextInt(100, 600);
            int h = random.nextInt(200,500);
             Color color = new Color(r,g,b);
             
            gra.setColor(color);
            gra.fillRect(x, y, w, h);
            
        }
        
        
        c.getTeclado().leerCaracter();
    }
}
