package ar.edu.unahur.obj2.composite.consumibles.combo;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.composite.consumibles.Consumible;

public class Combo implements Consumible {
    private String nombre;
    private Double precio;
    private List<Consumible> productos = new ArrayList<>();

    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Combo(String nombre, Double precio, List<Consumible> productosIniciales) {
        this(nombre, precio);
        if (productosIniciales != null) {
            this.productos.addAll(productosIniciales);
        }
    }

    @Override
    public Double costo() {
        Double sumaDePrecios = this.productos.stream().mapToDouble(Consumible::costo).sum();
        return sumaDePrecios;
    }

    public void agregarProducto(Consumible unProducto) {
        this.productos.add(unProducto);
    }

    public void eliminarProducto(Consumible unProducto) {
        if (this.productos.contains(unProducto)) {
            this.productos.remove(unProducto);
        } else {
            System.out.println("El producto no se encuentra en el combo");
        }
    }
}
