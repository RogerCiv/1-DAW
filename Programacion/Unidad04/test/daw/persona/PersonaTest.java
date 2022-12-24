
package daw.persona;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roger
 */
public class PersonaTest {
    
    public PersonaTest() {
        Persona p = new Persona("Perico", 7777777, 'A', 800, LocalDate.MIN);
        
        System.out.println(p.getDNI());
    }

    @Test
    public void testSomeMethod() {
   
    }
    
}
