package co.com.sofka.jeanstore.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.jeanstore.producto.values.Color;
import co.com.sofka.jeanstore.producto.values.DescuentoPromocion;
import co.com.sofka.jeanstore.producto.values.ProductoId;
import co.com.sofka.jeanstore.producto.values.TipoJean;

import java.util.Set;


public class Producto extends AggregateEvent<ProductoId> {

    protected Color color;
    protected TipoJean tipoJean;
    protected DescuentoPromocion descuentoPromocion;
    protected Set<JeansHombre> jeansHombres;
    protected Set<JeansMujer> jeansMujers;

    public Producto(ProductoId entityId, Color color, DescuentoPromocion descuentoPromocion, TipoJean tipoJean){
        super(entityId);
    }
}
