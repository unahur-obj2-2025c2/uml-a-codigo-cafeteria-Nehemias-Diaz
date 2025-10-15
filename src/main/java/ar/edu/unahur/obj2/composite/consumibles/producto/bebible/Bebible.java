package ar.edu.unahur.obj2.composite.consumibles.producto.bebible;

import ar.edu.unahur.obj2.composite.consumibles.producto.Producto;

public abstract class Bebible extends Producto {
    protected Integer capacidadMl;

    public Bebible(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase);
        this.capacidadMl = capacidadMl;
    }

    public Double costo(){
        return doCosto();
    }

    public abstract Double doCosto();
}
