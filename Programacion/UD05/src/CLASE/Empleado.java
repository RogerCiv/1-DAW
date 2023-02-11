package CLASE;

public class Empleado extends Persona {
    //con el extens ya recibe nombre,altura,peso, getAltura, etc de PERSONA excepto constructor.
    //nombre
    //edad (inaccesible) --- Porque es private en Persona
    //altura (Visible porque es public)
    //peso
    private double sueldo;

    public Empleado(String n, int e, double t, double p, double s) {
        //super llama al constructor de la clase padre (Persona)
        super(n, e, t, p);
        if(s>0){
            this.sueldo = s;
        }
        
        //TODO Auto-generated constructor stub
    }

    //este constructor crea u nempleado que gana 1000€, tiene 18 años
    // y el resto de caracteristicas se pasan como parametros
    public Empleado(String n, double a, double p){
        this(n,18,a,p,1000);
        //Esta forma se podria hacer, pero es menos eficiente.
       /*super(n,18, a, p);
       this.sueldo = 1000;
       */
    }
    public double getSueldo() {
        return sueldo;
    }

    
}
