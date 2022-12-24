package clases.ejercicios.ejercicio05;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;


public class OficinaTest {
    
    public OficinaTest() {
       
    
      
    }

    @Test
    public void testSomeMethod() {
        Oficina c = new Oficina("HLanz",2);
        c.añadirEmpleado("Pepe", "75139462B", 1200, LocalDate.now());
        
        
       
        assertEquals(3,c.getTotalEmpleados());
        assertEquals(2, c.getTotalEmpleadosMileuristas());
        System.out.println();
       
    }
    
}
