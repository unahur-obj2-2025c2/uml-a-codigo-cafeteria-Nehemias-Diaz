package ar.edu.unahur.obj2.composite.consumibles.producto.comestible.tostado;

import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.Comestible;

public class Tostado extends Comestible {
    private TipoTostado tipo;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, TipoTostado unTipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = unTipo;
    }

    @Override
    public Double doCosto() {
        switch (tipo) {
            case JAMON_Y_QUESO:
                return this.precioBase * 1.1; 

            case SALAME_Y_QUESO:
                return this.precioBase * 1.15; 

            default:
                return this.precioBase;
        }
    }
}
