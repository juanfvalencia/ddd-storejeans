package co.com.sofka.jeanstore.venta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.jeanstore.cliente.values.ClienteId;
import co.com.sofka.jeanstore.cliente.values.Cuenta;
import co.com.sofka.jeanstore.empleado.values.EmpleadoId;
import co.com.sofka.jeanstore.empleado.values.Nombre;
import co.com.sofka.jeanstore.producto.values.Color;
import co.com.sofka.jeanstore.producto.values.DescuentoPromocion;
import co.com.sofka.jeanstore.producto.values.ProductoId;
import co.com.sofka.jeanstore.producto.values.TipoJean;
import co.com.sofka.jeanstore.venta.events.VentaCreada;
import co.com.sofka.jeanstore.venta.values.Factura;
import co.com.sofka.jeanstore.venta.values.VentaId;

import java.util.Objects;


public class Venta extends AggregateEvent<VentaId> {

    protected Factura factura;
    protected ClienteId clienteId;
    protected EmpleadoId empleadoId;
    protected ProductoId productoId;

    public Venta (VentaId entityId, Factura factura){

        super(entityId);
        appendChange(new VentaCreada(factura)).apply();
    }

    public void agregarProducto(ProductoId entityId, Color color, DescuentoPromocion descuentoPromocion, TipoJean tipoJean){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(color);
        Objects.requireNonNull(descuentoPromocion);
        Objects.requireNonNull(tipoJean);
        appendChange(new productoAgregado(entityId, color, descuentoPromocion, tipoJean)).apply();
    }

    public void cambiarProducto(ProductoId entityId, Color color, DescuentoPromocion descuentoPromocion, TipoJean tipoJean){
        appendChange(new productoCambiado(entityId, color, descuentoPromocion, tipoJean)).apply();
    }

    public void generarFactura(Factura factura){
        appendChange(new facturaAgregada(factura)).apply();
    }

    public void asociarCliente(ClienteId entityId, Cuenta cuenta){
        appendChange(new clienteAsociado(entityId, cuenta)).apply();
    }

    public void asociarEmpleado(EmpleadoId entityId, Nombre nombre){
        appendChange(new empleadoAsociado(entityId, nombre)).apply();
    }

    public Factura factura(){
        return factura;
    }

    public ClienteId clienteId(){
        return clienteId;
    }

    public EmpleadoId empleadoId(){
        return empleadoId;
    }

    public ProductoId productoId(){
        return productoId;
    }
}
