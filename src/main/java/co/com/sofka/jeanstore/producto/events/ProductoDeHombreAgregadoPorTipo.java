package co.com.sofka.jeanstore.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.producto.values.Color;
import co.com.sofka.jeanstore.producto.values.JeansHombreId;
import co.com.sofka.jeanstore.producto.values.TipoJean;

public class ProductoDeHombreAgregadoPorTipo extends DomainEvent {

    private final JeansHombreId jeansHombreId;
    private final TipoJean tipoJean;
    private final Color color;

    public ProductoDeHombreAgregadoPorTipo(JeansHombreId jeansHombreId, TipoJean tipoJean, Color color){
        super("jeanstore.producto.productodehombreagregadoportipo");
        this.jeansHombreId = jeansHombreId;
        this.tipoJean = tipoJean;
        this.color = color;
    }

    public JeansHombreId getJeansHombreId(){
        return jeansHombreId;
    }

    public TipoJean getTipoJean(){
        return tipoJean;
    }

    public Color getColor(){
        return color;
    }
}
