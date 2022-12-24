
public class Ejercicio45 {
    public static void main(String[] args) {
        
        int[] lista = {50, 26, 7, 9, 15,27};
        
        int pos = 0;
        
        for(int i = lista.length; i<lista.length;i--){
            for(int j = 0; j<lista.length;j--){
                if(lista[i]>lista[j]){
                    pos=lista[i];
                    lista[i]=lista[j];
                    lista[j]=pos;
                }
            }
        }
        for(int i =0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
}
