package co.com.sofka.jeanstore.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.jeanstore.venta.values.Factura;
import co.com.sofka.jeanstore.venta.values.VentaId;

public class agregarFactura extends Command {

    private final VentaId ventaId;
    private final Factura factura;

    public agregarFactura(VentaId ventaId, Factura factura) {
        this.ventaId = ventaId;
        this.factura = factura;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Factura getFactura() {
        return factura;
    }
}
