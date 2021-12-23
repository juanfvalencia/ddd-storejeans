package co.com.sofka.jeanstore.venta.events;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.jeanstore.venta.Venta;

public class VentaChange extends EventChange {
    public VentaChange(Venta venta){

        apply((VentaCreada event) -> {
            venta.factura = event.getFactura();
        });

        apply((ProductoAgregado event) ->{
            venta.productoId = event.getProductoId();
        });

        apply((ProductoCambiado event) ->{
            venta.productoId = event.getProductoId();
        });

        apply((FacturaAgregada event) ->{
            venta.factura = event.getFactura();
        });

        apply((EmpleadoAsociado event) -> {
            venta.empleadoId = event.getEmpleadoId();
        });

        apply((ClienteAsociado event) -> {
            venta.clienteId = event.getClienteId();
        });
    }
}
