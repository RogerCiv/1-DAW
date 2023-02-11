package CLASE;

//La clase padre de las checked exception es la clase Exception
//Checked exception porque hereda de Exception
public class IsmaelException extends Exception{
    public IsmaelException(String mensaje){
        super(mensaje);
    }
}
