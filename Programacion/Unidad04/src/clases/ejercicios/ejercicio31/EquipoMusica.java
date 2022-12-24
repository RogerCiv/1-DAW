package clases.ejercicios.ejercicio31;

import clases.ejercicios.ejercicio30.Altavoz;

public class EquipoMusica {
    //La propiedad “altavoces” es un array en el que se guardarán los altavoces del equipo
    private Altavoz[] altavoces;

    //El constructor inicializa la propiedad “altavoces”, creando un array con la cantidad de
    //altavoces pasada como parámetro, y rellenándola con objetos altavoz

    public EquipoMusica (int numeroAltavoces){
        altavoces = new Altavoz[numeroAltavoces];
        for(int i = 0; i< numeroAltavoces; i++){
            altavoces[i] = new Altavoz();
        }
    }

    //getAltavoz: devuelve el altavoz que se encuentra en la posición indicada, dentro del
    //array de altavoces

    public Altavoz getAltavoz(int posicion){
        return altavoces[posicion];
    }

    //setVolumen: cambia el volumen del altavoz cuya posición se pasa como parámetro
    public void setVolumen(int numeroAltavoz, int volumen){
        altavoces[numeroAltavoz].setVolumen(volumen);
    }
}
