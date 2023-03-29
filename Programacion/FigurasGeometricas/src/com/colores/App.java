package com.colores;


import java.util.List;
import java.util.*;
import java.awt.*;
/**
 * 
 * @author roger
 * @version 1.1
 */
public class App {
    public static void main(String... args) {
        List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

        boolean repetir = true;

        while (repetir) {

            System.out.println("""
                    1) Añadir un rectángulo
                    2) Añadir un cuadrado
                    3) Añadir un círculo
                    4) Añadir un triángulo
                    5) Dibujar todo
                    """);

            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out
                            .println("Elige las coordenadas X e Y dónde estará situada la esquina superior izquierda:");
                    int esiX = new Scanner(System.in).nextInt();
                    int esiY = new Scanner(System.in).nextInt();
                    System.out.println("Elige las coordenadas X e Y dónde estará situada la esquina inferiro derecha");
                    int eidX = new Scanner(System.in).nextInt();
                    int eidY = new Scanner(System.in).nextInt();
                    // System.out.println("Elige el color del rectángulo");
                    Rectangulo rect = new Rectangulo(new Point(esiX, esiY), new Point(eidX, eidY),
                            Color.green);
                    figuras.add(rect);

                }
                case 2 -> {
                    System.out
                            .println("Elige las coordenadas X e Y dónde estará situada la esquina superior izquierda:");
                    int esiX = new Scanner(System.in).nextInt();
                    int esiY = new Scanner(System.in).nextInt();
                    System.out.println("Elige la longitud del lado: ");
                    int lado = new Scanner(System.in).nextInt();
                    Cuadrado cuadr = new Cuadrado(new Point(esiX, esiY), lado, Color.RED);
                    figuras.add(cuadr);
                }

                case 3 -> {
                    System.out.println("Elige las coordenas X e Y dónde estará situado el centro del círculo");
                    int centX = new Scanner(System.in).nextInt();
                    int centY = new Scanner(System.in).nextInt();
                    System.out.println("Elige el radio del círculo");
                    int radio = new Scanner(System.in).nextInt();
                    Circulo cir = new Circulo(new Point(centX, centY), radio, Color.red);
                    figuras.add(cir);
                }
                case 4 -> {
                    System.out.println("Elige las coordenadas X e Y de los tres vértices del triángulo: ");
                    int v1X = new Scanner(System.in).nextInt();
                    int v1Y = new Scanner(System.in).nextInt();
                    int v2X = new Scanner(System.in).nextInt();
                    int v2Y = new Scanner(System.in).nextInt();
                    int v3X = new Scanner(System.in).nextInt();
                    int v3Y = new Scanner(System.in).nextInt();
                    Triangulo tr = new Triangulo(new Point(v1X, v1Y), new Point(v2X, v2Y), new Point(v3X, v3Y));
                    figuras.add(tr);
                }

                case 5 -> {
                    System.out.println("Deseas dibujarlo en la Consola DAW o en un PDF?");
                    String opcion2 = new Scanner(System.in).nextLine();
                    switch (opcion2) {
                        case "Consola DAW" -> {
//                            Consola c = new Consola();
  //                          Teclado t = c.getTeclado();
    //                        CapaCanvas canvas = c.getCapaCanvas();
   //                         Graphics2D g = canvas.getGraphics2D();

                            for (FiguraGeometrica i : figuras) {
       //                         i.dibujar(g);
                            }

     //                       t.leerCaracter();
                            repetir = false;
                        }

                        case "PDF" -> {
                            // dibuja en el PDF

                            repetir = false;
                        }
                    }
                }
            }
        }
    }
}
