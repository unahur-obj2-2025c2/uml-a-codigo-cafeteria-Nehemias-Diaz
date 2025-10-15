package ar.edu.unahur.obj2.composite.consumibles.producto.comestible;

import ar.edu.unahur.obj2.composite.consumibles.producto.Producto;

public abstract class Comestible extends Producto {
    private Integer pesoGr;

    public Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }
    
    @Override
    public Double costo(){
        return doCosto();
    }

    public abstract Double doCosto();
}
