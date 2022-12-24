/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.persona;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Roger
 */
public class Persona {

    // Ejercicio 12. Poner en privado las propiedades
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    // Ejercicio 10
    /*
     * En todos los constructores deberá crearse una cuenta corriente para el
     * empleado.
     * Dicha cuenta tendrá saldo 0 y el número de cuenta será aleatorio.
     */
    public CuentaCorriente cuenta;

    // El primer constructor crea una persona a partir de su nombre, DNI, sueldo y
    // fecha de
    // nacimiento pasadas como parámetros.
    public Persona(String n, DNI d, double s, LocalDate fn, CuentaCorriente c) {
        nombre = n;
        dni = d;
        if (s > 0) {
            sueldo = s;
        } else {
            sueldo = 0;
        }

        fechaNacimiento = fn;
        cuenta =c;
    }

    // El segundo constructor crea una persona a partir de su nombre, número, letra
    // de DNI,
    // sueldo y fecha de nacimiento pasada como parámetro
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn) {
        this(n, new DNI(numDNI, letraDNI), s, fn,new CuentaCorriente());
    }

    // El tercer constructor crea una persona cuyo nombre y DNI se pasan como
    // parámetro,
    // gana 900 euros y ha nacido hace 20 años.
    public Persona(String n, DNI d) {
        this(n, d, 900, LocalDate.now().minusYears(20),new CuentaCorriente());
    }

    // El cuarto constructor crea una persona cuyo nombre, número y letra de DNI se
    // pasan
    // como parámetro, gana 900 euros y ha nacido hace 20 años
    public Persona(String n, int numDNI, char letraDNI) {
        this(n, numDNI, letraDNI, 900, LocalDate.now().minusYears(20));
    }

    // Ejercicio 10

    /*
     * El método aumentarSueldo aumenta el sueldo del empleado el porcentaje
     * indicado
     * como parámetro. Por ejemplo, si el sueldo es 1000 y se llama al método
     * pasando un
     * 50, el sueldo final del empleado será 1500
     */
    public void aumentarSueldo(int porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            sueldo += (sueldo * porcentaje / 100);
        }
        ;

    }

    // El método cobrarSueldo añadirá al empleado su sueldo en su cuenta corriente.
    public void cobrarSueldo() {
        cuenta.añadirDinero((int) sueldo);
    }

    // Ejercicio 12
    // Los getters devuelven el valor de la correspondiente propiedad.

    public String getNombre() {
        return nombre;
    }

    public DNI getDNI() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuenta;
    }

    // esMayorEdad: Devuelve true si la persona es mayor de 18 años

    public boolean esMayorEdad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        int edad = periodo.getYears();
        boolean respuesta = false;
        if (edad >= 18) {
            respuesta = true;
        }
        return respuesta;

    }

    // tieneDinero: Devuelve true si la cuenta corriente del empleado tiene saldo
    // positivo.
    public boolean tieneDinero() {
        boolean respuesta = false;
        if (cuenta.saldo > 0) {
            respuesta = true;
        }
        return respuesta;
    }

    // esMileurista: Devuelve true si la persona gana menos de 1200 euros
    public boolean esMileurista() {
        boolean respuesta = false;
        if (getSueldo() < 1200) {
            respuesta = true;
        }
        return respuesta;
    }
}
