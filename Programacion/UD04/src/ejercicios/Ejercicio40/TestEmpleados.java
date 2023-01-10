package ejercicios.Ejercicio40;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmpleados {
    
    public TestEmpleados(){

    }
    @Test
    public void TestMostrarSub(){
        Empleado antonio = new Empleado("Antonio");
        Empleado juan = new Empleado("Juan");
        Empleado paco = new Empleado("Juan");
        Empleado alberto = new Empleado("Juan");
        Empleado diego = new Empleado("Juan");
        Empleado rafa = new Empleado("Juan");
        Empleado ricardo = new Empleado("Juan");
        Empleado patricia = new Empleado("Juan");

        assertEquals(ricardo, patricia);
        
    }
}
