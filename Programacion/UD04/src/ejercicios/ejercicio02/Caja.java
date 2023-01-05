package ejercicios.ejercicio02;

public class Caja {

    //Ejercicio 13. Poner privadas las propiedades
    private boolean abierto;
    private String mensaje;

    // El primer constructor crea una caja que tiene el mensaje indicado y está
    // cerrada
    public Caja(String m) {
        this(false, m);
    }

    // El segundo constructor crea una caja que está abierta según lo indique el
    // primer
    // parámetro y tiene el mensaje del segundo parámetro.
    public Caja(boolean a, String m) {
        abierto = a;
        mensaje = m;
    }

    // El tercer constructor crea una caja cerrada que guarda el mensaje “Viva el
    // tema 7”
    public Caja() {
        this("Viva el tema 7");
    }

    //Ejercicio 08
    //setMensaje: Si la caja está abierta, cambia el mensaje de la caja. Si la caja está cerrada,
    //no hace nada.
    public void setMensaje(String m){
        if(abierto){
            mensaje = m;
        }
    }
    //pasarMayusculas: Reemplaza el mensaje de la caja por su versión en letras mayúsculas

    public void pasarMayusculas(){
        //this.mensaje = this.mensaje.toUpperCase();
        this.setMensaje(mensaje.toUpperCase());
    }
    //abrir: Abre la caja.
    public void abrir(){
        abierto = true;
    }
    //cerrar: Cierra la caja
    public void cerrar(){
        abierto = false;
    }
    //getMensaje: Si la caja está cerrada, devuelve null, y si la caja está abierta devuelve el
    //mensaje que hay dentro de la caja.
    public String getMensaje(){
        return abierto ? mensaje : "null";
    }
}
