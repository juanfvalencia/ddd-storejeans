package co.com.sofka.jeanstore.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.producto.values.Color;
import co.com.sofka.jeanstore.producto.values.JeansMujerId;
import co.com.sofka.jeanstore.producto.values.TipoJean;

public class ProductoDeMujerAgregadoPorTipo extends DomainEvent {

    private final JeansMujerId jeansMujerId;
    private final TipoJean tipoJean;
    private final Color color;

    public ProductoDeMujerAgregadoPorTipo(JeansMujerId jeansMujerId, TipoJean tipoJean, Color color){
        super("jeanstore.producto.productodemujeragregadoportipo");
        this.jeansMujerId = jeansMujerId;
        this.tipoJean = tipoJean;
        this.color = color;
    }

    public JeansMujerId getJeansMujerId(){
        return jeansMujerId;
    }

    public TipoJean getTipoJean(){
        return tipoJean;
    }

    public Color getColor(){
        return color;
    }
}
