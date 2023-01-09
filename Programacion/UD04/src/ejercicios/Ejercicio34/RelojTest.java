package ejercicios.Ejercicio34;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RelojTest {

    public RelojTest() {
    }

    @Test
    public void testSomeMethod() {
        Reloj r = new Reloj();
        r.añadir(0);

        assertEquals(false, r.esNoche());
    }

}