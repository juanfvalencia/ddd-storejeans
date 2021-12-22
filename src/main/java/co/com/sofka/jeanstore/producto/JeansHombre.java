package co.com.sofka.jeanstore.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.jeanstore.producto.values.Color;
import co.com.sofka.jeanstore.producto.values.JeansHombreId;
import co.com.sofka.jeanstore.producto.values.TipoJean;

import java.util.Objects;

public class JeansHombre extends Entity<JeansHombreId> {

    private TipoJean tipoJean;
    private Color color;

    public JeansHombre(JeansHombreId entityId, TipoJean tipoJean, Color color){
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
