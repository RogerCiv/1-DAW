/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clases.ejercicios.ejercicio03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roger
 */
public class MarcadorBaloncestoTest {
    
    public MarcadorBaloncestoTest() {
    }

    @Test
    public void testSomeMethod() {
        MarcadorBaloncesto m = new MarcadorBaloncesto("CB Granada", "FC Barcelona");
        m.añadirCanasta('L', 3);
        m.añadirCanasta('V', 2);
        
        assertEquals(3,m.getPuntosLocal());
        assertEquals(2,m.getPuntosVisitante());
        assertEquals(true,m.ganaLocal());
        assertEquals(false, m.ganaVisitante());
    }
    
}
