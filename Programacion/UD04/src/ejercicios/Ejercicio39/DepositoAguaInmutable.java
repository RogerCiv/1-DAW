package ejercicios.Ejercicio39;

//no se puede crear un deposito que sea la capacidad actual mayor la maxima
//El constructor principal declara las propiedades y les asigna el valor solamente si son 
//positiva
public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima) {
    public DepositoAguaInmutable{
        if(capacidadActual < 0 && capacidadMaxima < 0 && capacidadActual> capacidadMaxima){
            throw new IllegalArgumentException("No puede tener valor negativo");
        }
    }
    //El segundo constructor crea un depósito vacío con la capacidad máxima pasada como 
    //parámetro.
    public DepositoAguaInmutable(int capacidadMaxima){
        this(0,capacidadMaxima);
    }

    //añadirLitro devuelve un depósito de agua que tiene las mismas características del que 
    //estamos programando, pero con un litro más de agua 
    public DepositoAguaInmutable añadirLitro(){
        DepositoAguaInmutable nuevo = new DepositoAguaInmutable(this.capacidadActual+1, capacidadMaxima);
        return nuevo;
    }
    //retirarLitro devuelve un depósito de agua que tiene las mismas características del que 
    //estamos programando, pero con un litro más de agua 
    public DepositoAguaInmutable retirarLitro(){
        DepositoAguaInmutable nuevo = new DepositoAguaInmutable(this.capacidadActual+1, capacidadMaxima);
        return nuevo;
    }
    //getPorcentaje devuelve el porcentaje del depósito que está lleno
    public int getPorcentaje(){
        int porcentaje = 0;
        if(capacidadActual == capacidadMaxima){
             porcentaje =  (capacidadActual / capacidadMaxima)*100;
        }
        return porcentaje;
    }

}
