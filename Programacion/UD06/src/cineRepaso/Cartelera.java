/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineRepaso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roger
 */
public class Cartelera {
    
    public static List<Sala> cargarCartelera(String ruta) throws IOException{
        List<Sala> listaSalas = new ArrayList<>();
        BufferedReader read = new BufferedReader(new FileReader(ruta));
        StringBuilder sb = new StringBuilder();
        String linea = "";
        while((linea=read.readLine()) != null){
            sb.append(linea).append("\n");
        }
        
        return listaSalas;
    }
}
