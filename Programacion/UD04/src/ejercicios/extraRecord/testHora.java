package ejercicios.extraRecord;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalTime;

import org.junit.Test;

public class testHora {

    public testHora() {
    }

    @Test
    public void testSomeMethod() {

    }

    @Test
    public void testHora1() {
        //Crear una Hora (10:00) y comprobar que la hora es 10:00
        Hora h = new Hora(10, 0, 0);
        assertEquals(10, h.hora());
        assertEquals(0, h.minuto());
        assertEquals(0, h.segundo());
    }

    @Test
    public void testHora2() {
        // Añadir 30 segundos a una hora creada "12:25:15", nos tendria que devolver "12:25:45"
        Hora h = new Hora(12, 25, 15);
        Hora segundos = h.añadirSegundos(30);
        assertEquals(12, segundos.hora());
        assertEquals(25, segundos.minuto());
        assertEquals(45, segundos.segundo());
    }

    @Test
    public void testHora3() {
        //Comprobar si es de noche o no con distintas horas. (Es de noche entre las 20:00 y las 8:00 )
        Hora h = new Hora(19, 55,9);
        assertFalse(h.esNoche());
        Hora h2 = new Hora(21,30,45);
        assertTrue(h2.esNoche());
        Hora h3 = new Hora(8,0,1);
        assertFalse(h3.esNoche());
    }

    @Test
    public void testHora4() {
        //Devolver una hora (16:20:30) en modo Americano (4:20:30)
        Hora h = new Hora(16,20,30);
        assertEquals("4:20:30", h.toString());
    }

    @Test
    public void testHora5(){
        //pasar Hora a LocalTime
        Hora h = new Hora(12, 10, 30);
        LocalTime l = h.toLocalTime();
        assertEquals(12, l.getHour());
        assertEquals(10, l.getMinute());
        assertEquals(30, l.getSecond());
    }

    @Test
    public void testHora6(){
        //sumar dos horas 
        Hora h = new Hora(13, 20, 13);
        Hora h2 = new Hora(22, 40, 51);
        Hora h3 = Hora.suma(h, h2);
        assertEquals(12, h3.hora());
        assertEquals(1,h3.minuto());
        assertEquals(4, h3.segundo());
    }
}
