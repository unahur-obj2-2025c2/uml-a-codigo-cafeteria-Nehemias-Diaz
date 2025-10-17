package ar.edu.unahur.obj2.composite.consumibles.producto.comestible.tostado;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TostadoTest {
    @Test
    void costoTostadoJamonYQueso() {
        Tostado tostado = new Tostado("Clásico", 200.0, 250, TipoTostado.JAMON_Y_QUESO);
        // 200.0 * 1.1 = 220.0
        assertEquals(220.0, tostado.costo(),  0.001);
    }

    @Test
    void costoTostadoSalameYQueso() {
        Tostado tostado = new Tostado("Especial", 200.0, 250, TipoTostado.SALAME_Y_QUESO);
        // 200.0 * 1.15 = 230.0
        assertEquals(230.0, tostado.costo(),  0.001);
    }
}