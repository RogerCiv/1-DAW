
package clases.ejercicios.ejercicio02;

import org.junit.Test;
import static org.junit.Assert.*;


public class CajaTest {
    
    public CajaTest() {
        Caja c = new Caja(true, "Hola DAW");
        
        assertEquals("Hola DAW",c.getMensaje());
    }

    @Test
    public void testSomeMethod() {
      
    }
    
}
