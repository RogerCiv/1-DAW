
import bpc.daw.consola.Consola;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Roger
 */
public class Ejercicio50 {

    public static void main(String[] args) {

        Consola c = new Consola();

        Graphics g = c.getCapaCanvas().getGraphics();
        try {
            File fileCampana = new File("D:/campana.png");
            File fileSiete = new File("D:/siete.png");
            File fileBar = new File("D:/bar.jpg");
            BufferedImage camp = ImageIO.read(fileCampana);
            g.drawImage(camp, 800, 600,80,80, null);
            BufferedImage siete = ImageIO.read(fileSiete);
            g.drawImage(siete, 890, 600,80,80, null);
            BufferedImage bar = ImageIO.read(fileBar);
            g.drawImage(bar, 980, 600,80,80, null);
        } catch (IOException error) {
            System.out.println("Error");
        }

        c.getTeclado().leerCaracter();
    }
}
