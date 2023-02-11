package CLASE;

import java.io.IOException;

public class Mac extends Ordenador {

    private String cuentaApple;
    private int numeroPuertosThunderbolt;
    
    // marca es applñe y el S.O es MAC OS
    public Mac(int cr, String ca, int npt) {
        super(cr, "Mac OS", "Apple");
        this.cuentaApple = ca;
        this.numeroPuertosThunderbolt=npt;
    }

    public String getCuentaApple() {
        return cuentaApple;
    }

    public int getNumeroPuertosThunderbolt() {
        return numeroPuertosThunderbolt;
    }

    //Sobreescribir METODO
    //Es volver a programarlo, cambiarlo en la clase hija, Reprogramarlo, etc
    //Como se sobrescribe un metodo?
    //1) Se pone @Override
    //2) se pone el mismo metodo en la clase hija y se reprograma.
    @Override
    public void abrirNavegador(){
        /*
          try {
            Runtime.getRuntime().exec("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
                  
         */
        //Metodo bueno y actual.
        try {
          Process proceso =  new ProcessBuilder("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe").start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("No se pudo abrir");
        }
       
    }
    @Override
    public void encender(){
        //Esto llama al metodo encender de la clase padre (Ordenador)
        //super. sirve para llamar al metodo encender en la clase padre,
        // para que no se pierda lo que hace.
        super.encender();
        System.out.println("""
                         *\\
                      *  ;   *
                        * *
                """);
        
    }
}
