
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
       int numSala = 0;
       while(scan.hasNextLine()){
           numSala++;
           String linea = scan.nextLine();
           String[] peli = linea.split(";");
           int capacidad = Integer.parseInt(peli[0]);
           String titulo = peli[1];
           //String rutaFoto = titulo + ".jpg";
           
           Sala a = new Sala(numSala, capacidad, new Pelicula(titulo));
           listaSalas.add(a);
       }
       scan.close();
           
       return listaSalas;
   }
}
