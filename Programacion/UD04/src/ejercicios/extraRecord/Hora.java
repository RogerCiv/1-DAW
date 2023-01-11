package ejercicios.extraRecord;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//poner protecciones
public record Hora(int hora, int minuto, int segundo) {

    public Hora {
        // throw new UnsupportedOperationException("Metodo sin programar");
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora incorrecta");
        }
        if (minuto > 59 || minuto < 0) {
            throw new IllegalArgumentException("Minuto incorrecto");
        }
        if (segundo > 59 || segundo < 0) {
            throw new IllegalArgumentException("segundo incorrecto");
        }

    }

    // nos devuelve una nueva hora añadiendo los segundos que indicamos como
    // parametro
    public Hora añadirSegundos(int segundos) {
        // throw new UnsupportedOperationException("Metodo sin programar");
        /*
         * int total = (hora*3600) + (minuto * 60) + segundo + segundos;
         * int nuevaH = (total % 3600) / 60;
         * int nuevoM = (total % 60) % 60;
         * return new Hora(nuevaH, nuevoM, segundos);
         */
        /*
        LocalTime horaU = toLocalTime();
        horaU = horaU.plusSeconds(segundos); 
        return new Hora(horaU.getHour(), horaU.getMinute(), horaU.getSecond());
       */ 
       return new Hora(toLocalTime().getHour(), toLocalTime().getMinute(), toLocalTime().getSecond());

    }

    // devuelve true si la hora es entre las 20:00 y las 8:00 dia siguiente.
    public boolean esNoche() {
        // throw new UnsupportedOperationException("Metodo sin programar");
        LocalTime h = toLocalTime();
        return h.isAfter(LocalTime.of(20, 0, 0)) || h.isBefore(LocalTime.of(8, 0, 0));
    }

    // devuelve la hora en formato americano. hora:minuto:segundo AM/PM hora entre 1
    // y 12.
    public String toString() {
       // throw new UnsupportedOperationException("Metodo sin programar");
        return toLocalTime().format(DateTimeFormatter.ofPattern("h:m:s"));

    }
    // convierte la hora en un objeto LocalTime

    public LocalTime toLocalTime() {
        // throw new UnsupportedOperationException("Metodo sin programar");
        return LocalTime.of(hora, minuto, segundo);
    }

    // suma dos horas
    public static Hora suma(Hora h1, Hora h2) {
      // throw new UnsupportedOperationException("Metodo sin programar");
        LocalTime horaFinal = h1.toLocalTime().plusHours(h2.hora()).plusMinutes(h2.minuto()).plusSeconds(h2.segundo());
      //  Hora resultado = new Hora(horaFinal.getHour(),horaFinal.getMinute(),horaFinal.getSecond());
        return new Hora(horaFinal.getHour(),horaFinal.getMinute(),horaFinal.getSecond());
    }

}
