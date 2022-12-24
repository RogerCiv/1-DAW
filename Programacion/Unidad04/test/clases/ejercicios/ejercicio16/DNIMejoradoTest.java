/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clases.ejercicios.ejercicio16;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Roger
 */
public class DNIMejoradoTest {

    public DNIMejoradoTest() {
        
        DNIMejorado d = new DNIMejorado(75139462);

        assertEquals('A', d.getLetra());
    }

    @Test
    public void testSomeMethod() {

    }

}
