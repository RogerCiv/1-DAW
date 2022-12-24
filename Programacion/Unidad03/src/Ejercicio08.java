
/**
 * Usa la Consola DAW para hacer un programa que pregunte al usuario por la ruta de
 * una imagen y la ponga como imagen de fondo. El programa entonces preguntará "¿Desea
 * poner otra imagen?". Si el usuario pulsa la tecla S, se repetirá el proceso, y si pulsa cualquier
 * otra tecla, finalizará.
 */
import bpc.daw.consola.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ejercicio08 {

    public static void main(String[] args) {
        Consola c = new Consola();

        FondoColorSolido fondo = new FondoColorSolido(Color.blue);
        c.getCapaFondo().setFondo(fondo);
        CapaTexto cTexto = c.getCapaTexto();
        cTexto.setColorTexto(Color.RED);

        Teclado tec = c.getTeclado();
       
        boolean repetir = true;
        while (repetir) {
            c.getCapaTexto().println("introduce la ruta de la imagen: ");
            String ruta = tec.leerCadenaCaracteres();
            File archivo = new File(ruta);

            try {
                BufferedImage image = ImageIO.read(archivo);
                FondoImagen imagen = new FondoImagen(image);

                c.getCapaFondo().setFondo(imagen);

                imagen.setEscalado(true);

            } catch (IOException error) {
                c.getCapaTexto().println("error");
            }
            
            c.getCapaTexto().println("Desea poner otra imagen? pulse S si quieres poner otra: ");
            String opcion = tec.leerCadenaCaracteres();

            switch (opcion.toLowerCase()) {
                case "s" -> {
                    
                }
                default ->{
                    c.getCapaTexto().println("No quieres");
                    
                    repetir = false;
                     c.getTeclado().leerCaracter();
                }
            }
           
        }
    }
}
