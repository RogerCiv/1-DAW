package ejercicios.Ejercicio39;

//no se puede crear un deposito que sea la capacidad actual mayor la maxima
//El constructor principal declara las propiedades y les asigna el valor solamente si son 
//positiva
public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima) {
    //extension del constructor prinicpal. Sirve para poner protecciones.
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
       // DepositoAguaInmutable nuevo = new DepositoAguaInmutable(this.capacidadActual+1, capacidadMaxima);
        return new DepositoAguaInmutable(this.capacidadActual+1, capacidadMaxima);
    }
    //retirarLitro devuelve un depósito de agua que tiene las mismas características del que 
    //estamos programando, pero con un litro más de agua 
    public DepositoAguaInmutable retirarLitro(){
       // DepositoAguaInmutable nuevo = new DepositoAguaInmutable(this.capacidadActual+1, capacidadMaxima);
        return new DepositoAguaInmutable(this.capacidadActual-1, capacidadMaxima);
    }
    //getPorcentaje devuelve el porcentaje del depósito que está lleno
    public int getPorcentaje(){
        
      
         int  porcentaje =  this.capacidadActual * 100 / this.capacidadMaxima;
        
        return porcentaje;
    }

}
