package nave.juego;

import java.util.HashMap;
import java.util.Map;

import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.File;
import java.io.IOException;
public class CacheImagenes {
    private static CacheImagenes instancia;
    private Map<String,Image> imagenes;

    private CacheImagenes(){
        this.imagenes = new HashMap<>();
    }

    public static CacheImagenes getInstancia(){
        if(instancia == null){
            instancia = new CacheImagenes();
        }
        return instancia;
    }

    public Image getImagen(String archivo){
        Image respuesta = null;
        if(imagenes.containsKey(archivo)){
            respuesta = imagenes.get(archivo);
        }else{  
            try {
                BufferedImage img = ImageIO.read(new File(archivo));
                imagenes.put(archivo, img);
                respuesta = img;
            } catch (IOException e) {
                System.out.println(e.getMessage());
        }
    }
        return respuesta;
}
}
