package ejercicios.extraRecord;

public class programa {
    public static void main(String[] args) {
        Hora h = new Hora(19, 20, 10);
        Hora h2 = new Hora(16, 30, 0);
        Hora h3 = Hora.suma(h, h2);
        System.out.println(h.toString());
        System.out.println(h.esNoche());
        System.out.println(h.añadirSegundos(30));
        System.out.println(h3.toString());
        
    }
}
