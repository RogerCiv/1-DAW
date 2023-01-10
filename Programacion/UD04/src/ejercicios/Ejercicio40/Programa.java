package ejercicios.Ejercicio40;

import java.util.List;

public class Programa {
    public static void main(String[] args) {
        Empleado diego = new Empleado("Diego");
        Empleado juan = new Empleado("Juan",List.of(diego));
        Empleado ricardo = new Empleado("Ricardo");
        Empleado patricia = new Empleado("Patricia");
        Empleado alberto = new Empleado("Alberto",List.of(patricia));
        Empleado manuel = new Empleado("Manuel");
        Empleado valentin = new Empleado("Valentin");
        Empleado gema = new Empleado("Gema");
        Empleado maria = new Empleado("Maria",List.of(valentin,gema));
        Empleado rafa = new Empleado("Rafa",List.of(manuel,maria));
        Empleado paco = new Empleado("Paco",List.of(rafa,ricardo));
        Empleado antonio = new Empleado("Antonio",List.of(juan,paco,alberto));

        antonio.mostrarSubordinados();
    }
}
