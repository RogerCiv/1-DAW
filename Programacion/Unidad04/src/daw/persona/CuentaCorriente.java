/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.persona;

import java.util.Random;

public class CuentaCorriente {

    public int numero;
    public double saldo;

    // El primer constructor crea una cuenta con número aleatorio entre 0 y 1000, y
    // saldo 0.

    public CuentaCorriente() {
        /*
         * Random r = new Random();
         * numero = r.nextInt(0, 1000);
         * saldo = 0;
         */
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
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("dinero negativo");
        }

    }

    // ejercicio 18
    // Modifica el método retirarDinero de la clase CuentaCorriente para que lance
    // una Exception en caso de que se intente retirar una cantidad de dinero mayor
    // que
    // el saldo de la cuenta.
    public void retirarDinero(int cantidad) throws Exception {

        if (cantidad > saldo) {
            throw new Exception("Intentas retirar una cantidad mayor que la que dispones");
        } else {
            saldo -= cantidad;
        }
    }

}
