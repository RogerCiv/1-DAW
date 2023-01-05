package daw.persona;

import java.util.Random;

public class CuentaCorriente {
    public int numero;
    public double saldo;

    // El primer constructor crea una cuenta con número aleatorio entre 0 y 1000, y
    // saldo 0.
    public CuentaCorriente() {
        this(new Random().nextInt(0, 1000), 0);
    }

    // El segundo constructor crea una cuenta corriente cuyo número de cuenta se
    // pasa
    // como parámetro y tiene saldo 0 euros.
    public CuentaCorriente(int numero) {
        this(numero, 0);
    }

    // El tercer constructor crea una cuenta corriente cuyo número de cuenta se pasa
    // como
    // parámetro y tiene el saldo indicado como parámetro.
    public CuentaCorriente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // Los métodos de añadir y retirar cantidad, añaden o retiran del saldo la
    // cantidad indicada
    public void añadirDinero(int cantidad) {
        this.saldo += cantidad;
    }

    // Ejercicio 18.
    // Modifica el método retirarDinero de la clase CuentaCorriente para que lance
    // una
    // Exception en caso de que se intente retirar una cantidad de dinero mayor que
    // el saldo de la cuenta.
    public void retirarDinero(int cantidad) throws Exception {
        // this.saldo -= cantidad;
        if (cantidad > saldo) {
            throw new Exception("No puedes retirar mas cantidad de la que dispones de saldo");
        } else {
            this.saldo -= cantidad;
        }
    }
}
