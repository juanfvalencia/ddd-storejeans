package co.com.sofka.jeanstore.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.producto.values.ProductoId;


public class ProductoCambiado extends DomainEvent {

    private final ProductoId productoId;

    public ProductoCambiado(ProductoId productoId){
        super("jeanstore.venta.productocambiado");
        this.productoId = productoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

}
