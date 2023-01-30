package CLASE;

import java.io.IOException;

public class Ordenador {
    private boolean encendido;
    private int capacidadRam;
    private String sistemaOperativo;
    private String marca;


    //por defecto se crea apagado
    public Ordenador(int cr, String so, String m){
        this.encendido = false;
        this.capacidadRam = cr;
        this.sistemaOperativo = so;
        this.marca = m;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public int getCapacidadRam() {
        return this.capacidadRam;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public String getMarca() {
        return this.marca;
    }
    public void encender(){
        this.encendido = true;
        System.out.println("Comprobando memoria RAM");
        System.out.println("Comprobando cpu");
        System.out.println("Cargando el sistema operativo "+sistemaOperativo);
    }
    
    public void abrirNavegador(){
        if(!this.encendido){
            throw new YeraiException();
        }
        //Runtime r = Runtime.getRuntime();
        //metodo DEPRECADO = metodo antiguo no recomendable
        try {
            Runtime.getRuntime().exec("C:/Program Files/Mozilla Firefox/firefox.exe");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("no se puede abrir firefox");
        }
    }
}
