package clases.ejercicios.ejercicio02;

public class Caja {
    
    //ejercicio 13, ponemos las propiedades en privadas
    private boolean abierto;
    private String mensaje;


    public Caja(String m) {
        
       this(false, m);


    }
    public Caja(boolean a, String b) { 
        abierto = a;
        mensaje =b;
    }

    public Caja (){

        this(false, "Viva el tema 7");
      
    }
    
    //Ejercicio 08
    //setMensaje: Si la caja está abierta, cambia el mensaje de la caja. Si la caja está cerrada,
    //no hace nada.
    public void setMensaje(String m){
        
        if(abierto ==true){
            mensaje=m;
        }
    }
    
    //pasarMayusculas: Reemplaza el mensaje de la caja por su versión en letras
    //mayúsculas.

    //***añadido: Esete metodo pasa a mayusculas el mensaje, solo si la caja esta abioerta
        
    public void pasarMayusculas(){
        /******
         * mensaje= mensaje.toUpperCase();
         */
        this.setMensaje(mensaje.toUpperCase());
    }

    // Ejercicio 13

    //metodo Abrir, abre la caja. void abrir()

    public void abrir(){
        abierto= true;
    }
    
    //metodo Cerrar: Cierra la caja. void cerrar()

    public void cerrar(){
        abierto=false;
    }
    //getMensaje: Si la caja está cerrada, devuelve null, y si la caja está abierta devuelve el
    //  mensaje que hay dentro de la caja

    public String getMensaje(){
       /* String dato = "";
        if(abierto==false){
            dato=null;
        }else{
           dato= this.mensaje;
           
        }
        return mensaje;*/
        return abierto? mensaje: null;
    }


}
