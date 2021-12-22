package co.com.sofka.jeanstore.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.producto.values.*;

public class DescuentoAplicado extends DomainEvent {

    private final DescuentoPromocion descuentoPromocion;
    private final ProductoId productoId;
    private final TipoJean tipoJean;
    private final Color color;
    private final Referencia referencia;

    public DescuentoAplicado(ProductoId productoId, DescuentoPromocion descuentoPromocion, TipoJean tipoJean, Color color, Referencia referencia){
        super("jeanstore.producto.descuentoaplicado");
        this.descuentoPromocion = descuentoPromocion;
        this.productoId = productoId;
        this.tipoJean = tipoJean;
        this.color = color;
        this.referencia = referencia;
    }

    public DescuentoPromocion getDescuentoPromocion(){
        return descuentoPromocion;
    }

    public ProductoId getProductoId(){
        return productoId;
    }

    public TipoJean getTipoJean(){
        return tipoJean;
    }

    public Color getColor(){
        return color;
    }

    public Referencia getReferencia(){
        return referencia;
    }
}
