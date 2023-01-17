package ejercicios.PROGRAMAREPASO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CatalogoTitulosArchivos implements CatalogoTitulos {

    private String ruta;
    private List<Titulo> titulos;

    public CatalogoTitulosArchivos(String ruta ) throws IOException{
        this.ruta = ruta;
        this.titulos = new ArrayList<>();
        Reader r = new FileReader(new File(ruta));
        BufferedReader file = new BufferedReader(r);

        while(file.lines() != null){
            titulos.add(extraerTitulo(file.readLine()));
        
        }
        file.close();
        
    }

    private Titulo extraerTitulo(String linea) {
        String[] l = linea.split(";");

        return new TituloArchivo(l[0], l[1], l[2], Estado.values()[Integer.parseInt(l[3])]);
    }

    @Override
    public List<Titulo> getTitulos() {
        // TODO Auto-generated method stub

        return titulos;
    }

    @Override
    public boolean guardar() {
        boolean respuesta = false;
        try {
            PrintWriter writer = new PrintWriter(this.ruta);

            for (Titulo i : titulos) {
                writer.print(i.toString());

            }
            writer.close();
            respuesta = true;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return respuesta;
    }

    @Override
    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado) {
        // TODO Auto-generated method stub

        return titulos.add(new TituloArchivo(dni, nombre, estudio, estado));
    }

}
