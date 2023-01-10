package ejercicios.Ejercicio39;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestDeposito {

    public TestDeposito() {
    }

    
    @Test
    public void testAñadirLitro(){
        DepositoAguaInmutable depo = new DepositoAguaInmutable(0, 10);
       
        for(int i = 0; i <10; i++){
          depo =  depo.añadirLitro();
        }

        assertEquals(10, depo.capacidadMaxima());
        assertEquals(100, depo.getPorcentaje());
    }
    

}