package co.com.sofka.jeanstore.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.venta.values.Factura;

public class VentaCreada extends DomainEvent {

    private final Factura factura;

    public VentaCreada(Factura factura){
        super("jeanstore.venta.ventacreada");
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }


}
