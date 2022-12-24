package clases.repaso.dci14;

import java.util.Map;
import java.util.Random;

public class Futbolista {
    private int dorsal;
    private String nombre;

    // Constructores
    // Crea un futbolista con un dorsal entre 1 y 11.
    //En caso contrario, le vamos a lanzar al susuario una 
    //IllegalArgumentException con el mensaj "dorsal invalido"
    public Futbolista(int d, String n) {
        if (d >= 1 && d <= 11) {
            dorsal = d;
        } else {
            throw new IllegalArgumentException("dorsal inválido");
        }
        nombre = n;
    }

    //Este constructor crea el futbolista cuyo nombre se pasa como parametro
    //El dorsal se obtiene así: portero -> 1, defensa-> nºaleatorio entre 2 y 4,
    //mediocentro -> nº aleatorio entre 5 y 8, delantero -> nº aleatorio entre 9 y 11.
    //En caso de qu el puesto sea incorrecto, se lanzara una  IllegalArgumentException con el mensaje "Puesto incorrecto"
    //+Ftubolista(String puesto, String nombre)

    public Futbolista(String puesto, String nombre){
        this(switch(puesto){
            case "portero"->1;
            case "defensa" -> new Random().nextInt(2,4);
            case "mediocentro"-> new Random().nextInt(5,8);
            case "delantero" -> new Random().nextInt(9,12);
            default -> throw new IllegalArgumentException("Puesto incorrecto");
        },nombre); 
        /*
        //forma que se usaria en JavaScript y Python
        Map<String,Integer> dorsales = Map.of(
            "portero",1,
            "defensa", new Random().nextInt(2,4),
            "mediocentro",new Random().nextInt(5,8),
            "delantero",new Random().nextInt(9,11)
        );
        if(dorsales.containsKey(puesto)){
            dorsal = dorsales.get(puesto);
        }else{
            throw new IllegalArgumentException("puesto incorrecto");
        }
        
        */
    }

    // getters(o Accesors)
    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    // devuelve, segun el dorsal:
    // 1- portero 2-4 defensas 5-8 mediocentro 9-11 delanteros

    public String getPosicion() {
        /*
         * String posicion= "";
         * if(dorsal==1){
         * posicion= "portero";
         * }else if(dorsal>=2 && dorsal <=4){
         * posicion="defensa";
         * }else if(dorsal >=5 && dorsal <=8){
         * posicion="mediocentro";
         * }else if(dorsal >=9 && dorsal<=11){
         * posicion="delantero";
         * }
         */
        // forma mas corta

        return dorsal == 1 ? "portero"
                : dorsal >= 2 && dorsal <= 4 ? "defensa"
                        : dorsal >= 5 && dorsal <= 8 ? "mediocentro"
                                : dorsal >= 9 && dorsal <= 11 ? "delantero" : "desconocido";

    }

    // si es portero, gana 1.000.000(1_000_000), defensas ganan 4.000.000,
    // mediocentro 5.000.000, delantero 10.000.000
    // long getSueldo()
    public long getSueldo() {
        /*
         * long sueldo = 0;
         * if(this.getPosicion().equals("portero")){
         * sueldo=1_000_000;
         * }else if(this.getPosicion().equals("defensa")){
         * sueldo = 4_000_000;
         * }else if(this.getPosicion().equals("mediocentro")){
         * sueldo= 5_000_000;
         * }else if(this.getPosicion().equals("delantero")){
         * sueldo= 10_000_000;
         * }
         * return sueldo;
         */
        return switch (this.getPosicion()) {
            case "portero" -> 1_000_000;
            case "defensa" -> 4_000_000;
            case "mediocentro" -> 5_000_000;
            case "delantero" -> 10_000_000;
            // podemos poner el default con los 10mill del delantero
            default -> 0;
        };

    }
}
