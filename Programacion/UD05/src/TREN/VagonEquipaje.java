package TREN;

import java.util.ArrayList;
import java.util.List;

public class VagonEquipaje extends VagonPesoLimitado{

  

    private List<Maleta> almacen;

    public VagonEquipaje(int pm) {
        super(pm);
        this.almacen = new ArrayList<>();
        //TODO Auto-generated constructor stub
    }

    public void añadir(Maleta m){
        if(super.comprobarPesoMaximoExcedido())
        this.almacen.add(m);
    }

    public void retirar(Maleta m){
        this.almacen.remove(m);
    }
    @Override
    public void enganchar(Vagon v){
        if(v instanceof VagonEquipaje ve){
            super.enganchar(ve);
        }
    }

    @Override
    public int getPeso() {
        // TODO Auto-generated method stub
        int peso = 0;
        for(Maleta i : almacen){
            peso+= i.peso();
        }

        return peso;
    }
    
}
