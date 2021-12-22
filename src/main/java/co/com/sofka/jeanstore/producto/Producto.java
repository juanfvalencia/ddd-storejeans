package co.com.sofka.jeanstore.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.jeanstore.producto.events.*;
import co.com.sofka.jeanstore.producto.values.*;

import java.util.Objects;
import java.util.Optional;
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
        appendChange(new ProductoDeHombreAgregadoPorTipo(entityId, tipoJean, color)).apply();
    }

    public void agregarProductoDeMujerPorTipo(JeansMujerId entityId, TipoJean tipoJean, Color color){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tipoJean);
        Objects.requireNonNull(color);
        appendChange(new ProductoDeMujerAgregadoPorTipo(entityId, tipoJean, color)).apply();
    }

    public void cambiarProductoHombrePorTipo(JeansHombreId entityId, TipoJean tipoJean, Color color){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tipoJean);
        Objects.requireNonNull(color);
        appendChange(new ProductoDeHombreCambiadoPorTipo(entityId, tipoJean, color)).apply();
    }

    public void cambiarProductoMujerPorTipo(JeansMujerId entityId, TipoJean tipoJean, Color color){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tipoJean);
        Objects.requireNonNull(color);
        appendChange(new ProductoDeMujerCambiadoPorTipo(entityId, tipoJean, color)).apply();
    }

    public void aplicarDescuento(ProductoId entityId, DescuentoPromocion descuentoPromocion, TipoJean tipoJean, Color color, Referencia referencia){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tipoJean);
        Objects.requireNonNull(referencia);
        Objects.requireNonNull(color);
        Objects.requireNonNull(descuentoPromocion);
        appendChange(new DescuentoAplicado(entityId, descuentoPromocion, tipoJean, color, referencia)).apply();
    }

    public Optional<JeansHombre> getJeansHombrePorId(JeansHombreId entityId){
        return jeansHombres()
                .stream()
                .filter(jeansHombre -> jeansHombre.identity().equals(entityId))
                .findFirst();
    }

    public Optional<JeansMujer> getJeansMujerPorId(JeansMujerId entityId){
        return jeansMujeres()
                .stream()
                .filter(jeansMujer -> jeansMujer.identity().equals(entityId))
                .findFirst();
    }

    public Color color(){

        return color;
    }

    public TipoJean tipoJean(){
        return tipoJean;
    }

    public Referencia referencia(){
        return referencia;
    }

    public DescuentoPromocion descuentoPromocion(){
        return descuentoPromocion;
    }

    public Set<JeansHombre> jeansHombres(){
        return jeansHombres;
    }

    public Set<JeansMujer> jeansMujeres(){
        return jeansMujeres;
    }
}
