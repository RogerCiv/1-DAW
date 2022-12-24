
import bpc.daw.consola.Consola;



/**
Usa la Consola DAW para realizar un programa que muestre 20 veces por pantalla
la frase "En clase no se juega" cada una en renglón diferente. Las veces impares se alinearán a
la izquierda y las pares a la derecha.
 */
public class Ejercicio17b {
    public static void main(String[] args) {
        Consola c = new Consola();
        String frase = "EN clase no se juega";
        
        for(int i = 1; i<21; i++){
            if(i%2==1){
                c.getCapaTexto().print(i, 0,i+frase );
            }else{
                 c.getCapaTexto().print(i, 44,i+frase );
            }
        }
        
        c.getTeclado().leerCaracter();
    }
}
