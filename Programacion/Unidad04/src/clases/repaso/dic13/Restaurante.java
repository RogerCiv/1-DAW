
package clases.repaso.dic13;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
  private String nombre;
  private String[] platos;
  private int[] precios;

  // constructor principal
  public Restaurante(String n, String[] pl, int[] pr) {
    nombre = n;
    platos = pl;
    precios = pr;
  }

  // constructor secundario. crea un restaurante con estos platos:
  // bocadillo(5€), sopa(8€), filete(10€);

  public Restaurante(String n) {
    this(n, new String[] { "bocadillo", "sopa", "filete" }, new int[] { 5, 8, 15 });

  }

  // String getNombre() // devuelve el nombre del restaurante.

  public String getNombre() {
    return this.nombre;

  }

  // devuelv el precio del plato que pasamos como parametro
  // int getPrecio(String plato). Si el plato no lo ofrece el restaurante, el
  // precio sera 0
  // añadido Usa return una sola vez al final del metodo
  public int getPrecio(String plato) {
    int dato = 0;
    for (int i = 0; i < platos.length; i++) {
      if (platos[i].equals(plato)) {
        dato = precios[i];
      }
    }
    return dato;

  }

  // Devuelve true si el plato pasado como parametro se ofrece en el restaurante
  // +boolean estaDisponible(String dato)
  public boolean estaDisponible(String plato) {
    boolean respuesta = false;
    /*
     * 
     * for (String pl : platos) {
     * if (pl.equals(plato)) {
     * respuesta = true;
     * }
     * 
     * }
     * 
     * 
     */
    for (int i = 0; i < platos.length && !respuesta; i++) {
      String pl = platos[i];
      if (pl.equals(plato)) {
        respuesta = true;
      }
    }

    return respuesta;
  }

  // Devuelve una lista con los platos que cuestan mas de 12 €
  // +List<String> getPlatosCaros()

  public List<String> getPlatosCaros() {
    List<String> platosCaros = new ArrayList<>();

    for (int i = 0; i < precios.length; i++) {
      if (precios[i] > 12) {
        platosCaros.add(platos[i]);
      }
    }
    return platosCaros;
  }

  // Devuelve el precio de todos los platos que se pasan como parametro.
  // SI alguno de los paltos no esta en el restaurante, no se tendra en cuenta.
  // +int getCuenta(String[] platos)
  // COSAS QUE HAY QUE TENER EN LA CABEZA CUANDO PROGRAMAS UN METODO
  // 1ª) Tenemos que usar las propiedades(atributos/variables instancia)
  // 2ª) Podemos usar metodos de nuestra propia clase
  //en este metodo usamos uno anterior, ahorrando pasos.
  public int getCuenta(String[] platos) {
    int cuenta = 0;
    for (int i = 0; i < platos.length; i++) {
      cuenta += this.getPrecio(platos[i]);
    }
    return cuenta;

  }

  //

  
}
