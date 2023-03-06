/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author roger
 */
public record Alumno(String nombre, String apellidos,String curso, int edad) {
    
    
    @Override
        public String toString(){
            return apellidos+", "+nombre;
        }
}
