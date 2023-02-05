package Ejercicio18a21;

public class Programa {
    public static void main(String[] args) {
        Paquete p = new Paquete(" Caracoles", "calle falsa 1", 1);
        Paquete p2 = new Paquete("Chinchillas", "Calle verdadera 2", 3);
        Paquete p3 = new Paquete("Salmo netes", "Calle salmon", 2);

        Transportista t = new Transportista(5);

        t.subirCamion(p);
        t.subirCamion(p2);
        t.subirCamion(p3);
        t.enviar();
        
    }
}
