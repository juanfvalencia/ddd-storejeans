package co.com.sofka.jeanstore.empleado;


import co.com.sofka.domain.generic.Entity;
import co.com.sofka.jeanstore.empleado.values.Nombre;
import co.com.sofka.jeanstore.empleado.values.VendedorId;
import co.com.sofka.jeanstore.producto.values.ProductoId;

import java.util.Objects;

public class Vendedor extends Entity<VendedorId> {

    private Nombre nombre;
    private ProductoId productoId;

    public Vendedor(VendedorId entityId, ProductoId productoId, Nombre nombre){
        super(entityId);
        this.nombre = nombre;
    }

    public void venderProducto(ProductoId productoId){
        this.productoId = Objects.requireNonNull(productoId);
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
