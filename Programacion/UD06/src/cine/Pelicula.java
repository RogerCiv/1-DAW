
package cine;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public record Pelicula(String titulo, String rutaFoto) {
    
   public Pelicula(String titulo){
       this(titulo,titulo+".jpg");
   }
   public Image getFoto(){
       BufferedImage img = null;
       try{
            img = ImageIO.read(new File(rutaFoto));
          
           
       }catch(IOException error){
           System.out.println(error.getMessage());
       }
       return img;
    
   }
}
