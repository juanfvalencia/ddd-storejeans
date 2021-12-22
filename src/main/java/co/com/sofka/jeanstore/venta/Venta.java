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
import co.com.sofka.jeanstore.venta.events.*;
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

    public void agregarProducto(ProductoId entityId){
        Objects.requireNonNull(entityId);
        appendChange(new ProductoAgregado(entityId)).apply();
    }

    public void cambiarProducto(ProductoId entityId){
        appendChange(new ProductoCambiado(entityId)).apply();
    }

    public void generarFactura(Factura factura){
        appendChange(new FacturaAgregada(factura)).apply();
    }

    public void asociarCliente(ClienteId entityId, Cuenta cuenta){
        appendChange(new ClienteAsociado(entityId, cuenta)).apply();
    }

    public void asociarEmpleado(EmpleadoId entityId, Nombre nombre){
        appendChange(new EmpleadoAsociado(entityId, nombre)).apply();
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
