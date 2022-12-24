/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clases.repaso.dic13;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class RestauranteTest {
    
    public RestauranteTest() {
    }

    @Test
    public void testSomeMethod() {
        // test:
  // crea un restaunrate llamado HLANZ y comprueba que el metodo getNombre
  // funciona bien.
  // Crea un restaurante como el anterior y comprueba que el bcoadillo vale 5 €
  // Crea un restaurante con los platos por defecto y comprueba qeu se ofrece sopa
        Restaurante r = new Restaurante("HLANZ");
        /*
        assertEquals("HLANZ", r.getNombre());
        Restaurante r2 = new Restaurante("HLANZ");
        assertEquals(r2.getPrecio("bocadillo"),5);*/
        //assertEquals(true, r.estaDisponible("sopa"));
        assertTrue( r.estaDisponible("sopa"));
       
       
    }
    
}
