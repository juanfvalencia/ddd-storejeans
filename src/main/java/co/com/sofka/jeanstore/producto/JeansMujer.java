package co.com.sofka.jeanstore.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.jeanstore.producto.values.Color;
import co.com.sofka.jeanstore.producto.values.JeansMujerId;
import co.com.sofka.jeanstore.producto.values.TipoJean;

import java.util.Objects;

public class JeansMujer extends Entity<JeansMujerId> {

    private TipoJean tipoJean;
    private Color color;

    public JeansMujer(JeansMujerId entityId, TipoJean tipoJean, Color color){
        super(entityId);
        this.tipoJean = tipoJean;
        this.color = color;
    }

    public void actuaizarTipoDeJean(TipoJean tipoJean){
        this.tipoJean = Objects.requireNonNull(tipoJean);
    }

    public void actualizarColor(Color Color){
        this.color = Objects.requireNonNull(color);
    }

    public TipoJean tipoJean(){
        return tipoJean;
    }

    public Color color(){
        return color;
    }
}
