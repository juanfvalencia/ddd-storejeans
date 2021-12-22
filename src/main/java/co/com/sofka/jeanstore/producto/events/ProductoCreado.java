package co.com.sofka.jeanstore.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.producto.values.Referencia;

public class ProductoCreado extends DomainEvent {

    private final Referencia referencia;

    public ProductoCreado(Referencia referencia){
        super("jeanstore.producto.productocreado");
        this.referencia = referencia;
    }

    public Referencia getReferencia() {
        return referencia;
    }
}
