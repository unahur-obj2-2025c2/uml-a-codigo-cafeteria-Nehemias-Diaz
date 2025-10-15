package ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna;

import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.Comestible;

public class Medialuna extends Comestible {
    private TipoMedialuna tipo;

    public Medialuna(String nombre, Double precioBase, Integer pesoGr, TipoMedialuna unTipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = unTipo;
    }

    @Override
public Double doCosto() {
    switch (tipo) {
        case DE_MANTECA:
            return this.precioBase * 1.2;
            
        case DE_GRASA:
            return this.precioBase;
            
        case CON_DULCE_DE_LECHE:
            return this.precioBase * 1.3;
            
        default:
            return this.precioBase;
    }
}
}
