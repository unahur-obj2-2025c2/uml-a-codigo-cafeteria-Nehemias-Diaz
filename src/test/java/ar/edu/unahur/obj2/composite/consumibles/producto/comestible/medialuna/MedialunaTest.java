package ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedialunaTest {

    @Test
    void costoMedialunaDeGrasaEs80() {
        Medialuna medialuna = new Medialuna("De Grasa", 80.0, 90, TipoMedialuna.DE_GRASA);
        assertEquals(80.0, medialuna.costo());
    }

    @Test
    void costoMedialunaDeMantecaEs96() {
        Medialuna medialuna = new Medialuna("De Manteca", 80.0, 90, TipoMedialuna.DE_MANTECA);
        // 80.0 * 1.2 = 96.0
        assertEquals(96.0, medialuna.costo());
    }

    @Test
    void costoMedialunaConDulceDeLecheEs104() {
        Medialuna medialuna = new Medialuna("Rellena", 80.0, 110, TipoMedialuna.CON_DULCE_DE_LECHE);
        // 80.0 * 1.3 = 104.0
        assertEquals(104.0, medialuna.costo());
    }
}