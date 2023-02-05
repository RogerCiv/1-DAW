package CLASE.Feb2;

public class Programa {
    public static void main(String[] args) {
        //Paciente p = new Paciente(123456, "Paco");
        // El metodo toString convierte el objeto en un string.
       // String s = p.toString();
        //toString -> Es un metodo heredado de object cuya mmision esconvertir
        // el objeto en un string.
        // Por defecto, no sirve para nada, porque la conversion es :
        // paquete.nombreClase@hashcode
        // Para hacer una clase de calidad, debemos sobreescribirlo para dar info
        // util del objeto.
       // System.out.println(s);


        /*
          Para sabir si dos objetos SON LO MISMO usaremos ==, que compara sus posiciones
          en la memoria.
          Para saber si dos objetos SON HERMANOS GEMELOS (igual apariencia), usaremos
          el metodo equals, hereadado de la clase Object.

          Por defecto, el metodo equals heredado de la clase Object usa == para
          comparar objetos, y por tanto, todos los objetos son distintos.

          Para que tu clase sea de calidad, debes sobreescribir e lmetodo 
          equals para que devuelva true cuando los objetos  sean hearmnos gemelos
          (Coinciden en sus propiedades)
         Hospital h = new Hospital();
        Paciente a = new Paciente(123456, "Paco");
        
        System.out.println(h.pacienteIngresado(a));


         */
   

        /*
         hashCode -> metodo convierte un objeto en un numero entero.
         objetos que SEAN IGUALES deben tener el mismo hashcode.
         */
        Paciente a = new Paciente(123456, "Paco");
        Paciente b = new Paciente(123456, "Manuel");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
       
    }
}
