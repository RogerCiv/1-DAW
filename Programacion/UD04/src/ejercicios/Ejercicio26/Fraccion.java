package ejercicios.Ejercicio26;

public class Fraccion {
    private int numerador;
    private int denominador;

    //Los getters y el constructor actúan como se espera de ellos.

    public Fraccion (int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public int getNumerador(){
        return numerador;
    }
    public int getDenominador(){
        return denominador;
    }
    // El método getValorReal divide el numerador entre denominador y nos da un double
    //con el resultado (con decimales) de dicha división
    public double getValorReal(){
        return (double) numerador/denominador;
    }
    // El método getInversa devuelve una nueva fracción que se obtiene invirtiendo el
    //numerador y el denominador de la fracción que estamos programando.
    public Fraccion getInversa(){
        return new Fraccion(denominador, numerador);
    }
/* El método sumar suma dos fracciones, teniendo en cuenta que la suma se calcula así:
𝑎 𝑐
+
𝑏 𝑑
𝑎𝑑 + 𝑏𝑐
= 𝑏𝑑
*/
    public static Fraccion sumar(Fraccion a, Fraccion b){
        int numerador = (a.numerador *b.denominador) + (a.denominador * b.numerador);
        int denominador = (a.denominador* b.denominador);
        return new Fraccion(numerador, denominador);
    }
/* El método multiplicar realiza la multiplicación de dos fracciones, teniendo en cuenta
que la multiplicación se calcula así:
𝑎 𝑐
∙
𝑏 𝑑
𝑎𝑐
= 𝑏𝑑
*/
    public static Fraccion multiplicar(Fraccion a, Fraccion b){
        int numerador = a.numerador * b.numerador;
        int denominador = a.denominador * b.denominador;
        return new Fraccion(numerador, denominador);
    }
    // El método dividir realiza la división de dos fracciones, teniendo en cuenta que la
    //división se calcula multiplicando la primera por la inversa de la segunda

    public static Fraccion dividir(Fraccion a, Fraccion b){
        return  multiplicar(a , b.getInversa());
    }
}
