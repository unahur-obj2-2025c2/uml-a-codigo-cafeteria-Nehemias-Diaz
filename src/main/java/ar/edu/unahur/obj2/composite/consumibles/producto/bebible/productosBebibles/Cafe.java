package ar.edu.unahur.obj2.composite.consumibles.producto.bebible.productosBebibles;

import ar.edu.unahur.obj2.composite.consumibles.producto.bebible.Bebible;

public class Cafe extends Bebible {
    private Boolean conLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidadMl, Boolean conLeche) {
        super(nombre, precioBase, capacidadMl);
        this.conLeche = conLeche;
    }

    @Override
    public Double doCosto() {
        Double costoFinal = this.precioBase;
        if (conLeche) {
            costoFinal *= 1.2;
        }
        return costoFinal;
    }
}
