package CLASE.tiendaAnimales;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
// Añadir al programa lo siguiente:
/*
    Modififca lo que creas conveniente (programa,clases, etc) de forma que se haga un
    5% de descuento al precio total si sel cliente compra al menos un perro abandonado 
    con enfermedades. 

    Ademas, se debera informar a lcliente si consigue dicha bonificacion.

 */
public class Programa {
    public static void main(String[] args) {
        List<Perro> catalogo = new ArrayList<>();

        for(int i = 0; i<8 ; i++){
            Perro a = PerroFactory.generarPerroAleatorio();
            catalogo.add(a);
        }

        // Creamos el Carrito de la compra
        Carrito carrito = new Carrito();

        // bucle para elegir perro

        boolean repetir = true;

        while(repetir){
            System.out.println("""
                               Tienda de perros HLANZ
                               ----------------------
                               Elige el numero de perro para añadirlo
                               al carrito y pulsa 0 para finalizar la 
                               compra.
                               """);

            // Mostramos una lista numerada con los perros
            for(int i = 0; i<catalogo.size();i++){
                Perro p = catalogo.get(i);

                //¿Es abandonado?
                // instaceof --> devuelve true si una variable de tipo Perro en realidad contiene
                // un PerroAbandonado
             
                       //PATTER MATCHING  para instanceof --> la a
                if(p instanceof PerroAbandonado a){             
                  Set<String> enfermedades = a.getEnfermedades();
                  System.out.println((i+1)+" - "+p.getNombre()
                    +" ... "
                    +p.getRaza()
                    +" .... "
                    +p.getPrecio()
                    +" .... "
                    +" ABANDONADO: "
                    +enfermedades);
                }else{
                    System.out.println((i+1)+" - "+p.getNombre()
                    +" ... "
                    +p.getRaza()
                    +" .... "
                    +p.getPrecio());
                }
             
            }

            int opcion = new Scanner(System.in).nextInt();

                if(opcion == 0){
                    repetir = false;
                    ResultadoCompra r = carrito.getPrecio();

                    if(r.hayDescuento()){
                        System.out.println("Tienes un 5% descuento");
                    }
                    System.out.println("El precio es: "+r.precio());
                }else{
                    Perro p = catalogo.get(opcion-1);
                    carrito.comprar(p);
                    catalogo.remove(p);
                   
                }
                }


    }
}
