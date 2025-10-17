package ar.edu.unahur.obj2.composite.consumibles.producto.bebible.productosBebibles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void costoCafeSinLecheEs100() {
        // Un precio base simple para que el cálculo sea obvio
        Cafe cafeSolo = new Cafe("Expresso", 100.0, 50, false);
        assertEquals(100.0, cafeSolo.costo());
    }

    @Test
    void costoCafeConLecheEs120() {
        Cafe cafeConLeche = new Cafe("Latte", 100.0, 150, true);
        // 100.0 * 1.20 = 120.0
        assertEquals(120.0, cafeConLeche.costo());
    }
}
