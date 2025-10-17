package ar.edu.unahur.obj2.composite.consumibles.combo;

import ar.edu.unahur.obj2.composite.consumibles.Consumible;
import ar.edu.unahur.obj2.composite.consumibles.producto.bebible.productosBebibles.Cafe;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.medialuna.TipoMedialuna;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.tostado.TipoTostado;
import ar.edu.unahur.obj2.composite.consumibles.producto.comestible.tostado.Tostado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ComboTest {

    private Combo combo;
    private Consumible cafeConLeche;
    private Consumible medialunaManteca;

    @BeforeEach
    void setUp() {
        // Usamos el primer constructor
        combo = new Combo("Desayuno", 0.0);
        cafeConLeche = new Cafe("Latte", 100.0, 150, true); // costo = 120.0
        medialunaManteca = new Medialuna("De Manteca", 80.0, 90, TipoMedialuna.DE_MANTECA); // costo = 96.0
    }

    @Test
    void costoComboVacio() {
        assertEquals(0.0, combo.costo());
    }

    @Test
    void costoComboConProductos() {
        combo.agregarProducto(cafeConLeche);
        combo.agregarProducto(medialunaManteca);
        // 120.0 + 96.0 = 216.0
        assertEquals(216.0, combo.costo());
    }

    @Test
    void eliminarProducto() {
        combo.agregarProducto(cafeConLeche);
        combo.agregarProducto(medialunaManteca);
        assertEquals(216.0, combo.costo());

        combo.eliminarProducto(cafeConLeche);
        assertEquals(96.0, combo.costo());
    }

    @Test
    void eliminarProductoInexistente() {
        combo.agregarProducto(medialunaManteca);
        assertEquals(96.0, combo.costo());
        
        // El cafeConLeche no está en el combo
        combo.eliminarProducto(cafeConLeche);
        assertEquals(96.0, combo.costo());
    }

    @Test
    void segundoConstructor() {
        List<Consumible> productosIniciales = List.of(cafeConLeche, medialunaManteca);
        Combo comboConLista = new Combo("Desayuno Completo", 0.0, productosIniciales);
        assertEquals(216.0, comboConLista.costo());
    }

    @Test
    void costoComboAnidado() {
        // Combo simple (costo 216.0)
        Combo comboDesayuno = new Combo("Desayuno", 0.0, List.of(cafeConLeche, medialunaManteca));
        
        // Combo principal que contiene un producto y el otro combo
        Combo comboMega = new Combo("Mega Desayuno", 0.0);
        Tostado tostado = new Tostado("Clásico", 200.0, 250, TipoTostado.JAMON_Y_QUESO); // costo = 220.0
        
        comboMega.agregarProducto(tostado);
        comboMega.agregarProducto(comboDesayuno);
        
        // 220.0 (tostado) + 216.0 (combo desayuno) = 436.0
        assertEquals(436.0, comboMega.costo());
    }
}