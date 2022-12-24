package clases.repaso.DAM;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        System.out.println("Introducee un nombre de curso");
        String curso = new Scanner(System.in).nextLine();

        int respuesta = 0;

        if (curso.equals("primaria")) {
            respuesta = 8;
        } else if (curso.equals("post obligatoria")) {
            respuesta = 16;
        } else if (curso.endsWith("o eso")) {
            int cursoNum = Integer.parseUnsignedInt(curso.split("o")[0]);
            if (cursoNum >= 1 && cursoNum <= 4) {
                respuesta = 12 + cursoNum - 1;
            }
        } else {
            System.out.println("error");
        }

        System.out.println(respuesta);

    }
}
