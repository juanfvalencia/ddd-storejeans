package co.com.sofka.jeanstore.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.jeanstore.venta.values.ProductoId;
import co.com.sofka.jeanstore.venta.values.VentaId;

public class cambiarProducto extends Command {

    private final VentaId ventaId;
    private final ProductoId productoId;

    public cambiarProducto(VentaId ventaId, ProductoId productoId) {
        this.ventaId = ventaId;
        this.productoId = productoId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
