package ar.edu.unahur.obj2.composite.consumibles.producto.bebible.productosBebibles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JugoDeNaranjaTest {

    @Test
    void costoJugoDeNaranjaEs750() {
        // Precio base de $150 por cada 100ml. Capacidad de 500ml.
        JugoDeNaranja jugo = new JugoDeNaranja("Jugo exprimido", 150.0, 500);
        // (150.0 / 100.0) * 500 = 1.5 * 500 = 750.0
        assertEquals(750.0, jugo.costo());
    }
}