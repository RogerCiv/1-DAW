package ejercicios.Ejercicio30;


public class Altavoz {
    //as constantes VOL_MIN y VOL_MAX indican los valores mínimo y máximo que puede
    //tener cualquier altavoz. Estos valores se deberán inicializar a 0 y 255 respectivamente
    public static int VOL_MAX = 255;
    public static int VOL_MIN = 0;

    private int volumen;

    //El constructor crea un altavoz apagado (su volumen es 0)
    public Altavoz(){
        this.volumen = 0;
    }
    //El método ponerVolumenMaximo pone el altavoz al máximo de su volumen
    public void ponerVolumenMaximo(){
        this.volumen = VOL_MAX;
    }
    //El método setVolumen pone el altavoz al nivel pasado como parámetro
    public void setVolumen(int v){
        if(v >= 0 && v <= 255){
            this.volumen = v;
        }else{
            volumen = 0;
        }
    }
    //El método getVolumen devuelve el volumen del altavoz.
    public int getVolumen(){
        return volumen;
    }
    //El método toString devuelve un String con este formato: entre corchetes se ve el
    //volumen, y luego se ve una barra formada por un total de 10 asteriscos y guiones que
    //indican de forma gráfica el tanto por ciento del volumen del altavoz sobre su máximo.
    public String toString(){
        StringBuilder respuesta = new StringBuilder();
        respuesta.append("["+ volumen+ "]" );
        int asteriscos = (int) Math.round(((double) volumen/VOL_MAX) *10);
        for(int i = 0; i < asteriscos; i++){
            respuesta.append("*");
        }
        for(int i = 0; i < 10 - asteriscos; i++){
            respuesta.append("-");
        }
        return respuesta.toString();
    }

}
