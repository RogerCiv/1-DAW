
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.nio.file.Files.readAllLines;
import java.nio.file.Paths;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger
 */
public class Ejercicio52 {
    public static void main(String[] args) {
        
       
        
        boolean repetir = true;
        
        try{
            List<String> lista = readAllLines(Paths.get("D:/palabras.txt"));
            for(String pal : lista){
                System.out.println(pal);
            }
        }catch(IOException error){
            System.out.println("error");
        }
    }
}
