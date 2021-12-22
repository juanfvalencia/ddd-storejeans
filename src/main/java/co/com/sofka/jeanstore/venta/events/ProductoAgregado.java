package co.com.sofka.jeanstore.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.producto.values.Color;
import co.com.sofka.jeanstore.producto.values.DescuentoPromocion;
import co.com.sofka.jeanstore.producto.values.ProductoId;
import co.com.sofka.jeanstore.producto.values.TipoJean;

public class ProductoAgregado extends DomainEvent {

    private final ProductoId productoId;

    public ProductoAgregado(ProductoId productoId){
        super("jeanstore.venta.productoagregado");
        this.productoId = productoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
