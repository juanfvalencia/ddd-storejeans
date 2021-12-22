package co.com.sofka.jeanstore.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.venta.values.Factura;

public class FacturaAgregada extends DomainEvent {

    private final Factura factura;
    public FacturaAgregada(Factura factura){
        super("jeanstore.venta.facturaagregada");
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }
}
