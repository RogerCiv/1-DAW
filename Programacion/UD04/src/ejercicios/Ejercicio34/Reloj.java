package ejercicios.Ejercicio34;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reloj {
    private LocalTime hora;

    // El constructor crea un reloj que guarda la hora del momento actual
    public Reloj() {
        this.hora = LocalTime.now();
    }

    // El método añadir sirve para añadir la cantidad de segundos indicada a la hora
    // del reloj.
    public void añadir(int segundos) {
        this.hora = hora.plusSeconds(segundos);
    }

    // El método esNoche devuelve true si la hora está entre las 20:00 y las 8:00
    public boolean esNoche() {
        /*
         * LocalTime tarde = LocalTime.of(20, 0, 0);
         * LocalTime noche = LocalTime.of(8, 0, 0);
         * boolean respuesta = false;
         * 
         * if (hora.isAfter(tarde) && hora.isBefore(noche)) {
         * respuesta = true;
         * }
         * return respuesta;
         */
        return this.hora.isAfter(LocalTime.of(20, 0, 0)) ||
                this.hora.isBefore(LocalTime.of(8, 0, 0));
    }

    /*
     * El método esperar hace una pausa de la cantidad de segundos pasada como
     * parámetro y después actualizará la propiedad “hora”
     */
    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        this.hora = LocalTime.now();
    }

    // toString: devuelve la hora escrita en el siguiente formato:
    // hora:minutos:segundos
    public String toString() {

        return hora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
