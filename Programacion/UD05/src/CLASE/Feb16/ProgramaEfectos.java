package CLASE.Feb16;
//Clase anonima
/*
 Su objetivo es poder crear un objeto que tenga los metodos de una interfaz
 (o clase abstracta) sin tener que crear su clase.
 */
public class ProgramaEfectos {
    public static void main(String[] args) {
        
        EfectoEspecial efectoMayusculas = new EfectoEspecial() {

            @Override
            public String getNombre() {
                // TODO Auto-generated method stub
                return "Efecto Mayusculas";
            }

            @Override
            public String aplicarEfecto(String s) {
                // TODO Auto-generated method stub
                return s.toUpperCase();
            }
        };

        System.out.println(efectoMayusculas.aplicarEfecto("hola"));
    }
}
