/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineRepaso;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Roger
 */
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
