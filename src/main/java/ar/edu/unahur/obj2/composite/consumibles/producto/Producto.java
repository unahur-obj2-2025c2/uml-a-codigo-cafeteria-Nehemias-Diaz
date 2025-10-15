package ar.edu.unahur.obj2.composite.consumibles.producto;

import ar.edu.unahur.obj2.composite.consumibles.Consumible;

public abstract class Producto implements Consumible {
    protected String nombre;
    protected Double precioBase;

    public Producto(String nombre, Double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract Double costo();
}
