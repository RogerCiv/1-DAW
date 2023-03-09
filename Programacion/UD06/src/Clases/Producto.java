
package Clases;

public record Producto(String nombre, String marca, int precio) {
    
    public Producto {
        if(precio <=0){
            throw new IllegalArgumentException("Precio negativo");
        }
    }
    @Override
    public String toString(){
        return nombre+" "+marca+"..."+precio+" €";
    }
}
