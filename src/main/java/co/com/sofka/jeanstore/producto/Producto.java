package co.com.sofka.jeanstore.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.jeanstore.producto.events.ProductoCreado;
import co.com.sofka.jeanstore.producto.values.*;

import java.util.Objects;
import java.util.Set;

public class Producto extends AggregateEvent<ProductoId> {

    protected Color color;
    protected TipoJean tipoJean;
    protected Referencia referencia;
    protected DescuentoPromocion descuentoPromocion;
    protected Set<JeansHombre> jeansHombres;
    protected Set<JeansMujer> jeansMujeres;

    public Producto(ProductoId entityId, Color color, DescuentoPromocion descuentoPromocion, TipoJean tipoJean, Referencia referencia){
        super(entityId);
        appendChange(new ProductoCreado(referencia)).apply();
    }

    public void agregarProductoDeHombrePorTipo(JeansHombreId entityId, TipoJean tipoJean, Color color){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tipoJean);
        Objects.requireNonNull(color);
        appendChange(new productoDeHombreAgregadoPorTipo(entityId, tipoJean, color)).apply();
    }

    public void agregarProductoDeMujerPorTipo(JeansHombreId entityId, TipoJean tipoJean, Color color){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tipoJean);
        Objects.requireNonNull(color);
        appendChange(new productoDeMujerAgregadoPorTipo(entityId, tipoJean, color)).apply();
    }

    public void cambiarProductoPorTipo(JeansHombreId entityId, TipoJean tipoJean){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tipoJean);
        appendChange(new productoCambieadoPorTipo(entityId,tipoJean)).apply();
    }
}
