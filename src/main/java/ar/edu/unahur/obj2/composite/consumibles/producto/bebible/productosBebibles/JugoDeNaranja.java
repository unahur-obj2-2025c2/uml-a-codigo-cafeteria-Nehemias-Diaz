package ar.edu.unahur.obj2.composite.consumibles.producto.bebible.productosBebibles;

import ar.edu.unahur.obj2.composite.consumibles.producto.bebible.Bebible;

public class JugoDeNaranja extends Bebible {

    public JugoDeNaranja(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase, capacidadMl);
    }

    @Override
    public Double doCosto() {
        Double precioPorMl = this.precioBase / 100.0;
        return precioPorMl * this.capacidadMl;
    }
}
