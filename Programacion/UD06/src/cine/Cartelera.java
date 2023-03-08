
package cine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cartelera {
   public static List<Sala> cargarCartelera(String ruta) throws IOException{
       
       List<Sala> listaSalas = new ArrayList<>();       
       Scanner scan = new Scanner(new File(ruta));
       int i = 0;
       while(scan.hasNextLine()){
           i++;
           String linea = scan.nextLine();
           String[] peli = linea.split(";");
           int capa = Integer.parseInt(peli[0]);
           String pelicula = peli[1];
           
           Sala a = new Sala(i, capa, new Pelicula(pelicula));
       }
       
       
       
       return listaSalas;
   }
}
