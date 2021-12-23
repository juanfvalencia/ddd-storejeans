package co.com.sofka.jeanstore.venta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.cliente.values.ClienteId;
import co.com.sofka.jeanstore.cliente.values.Cuenta;
import co.com.sofka.jeanstore.empleado.values.EmpleadoId;
import co.com.sofka.jeanstore.empleado.values.Nombre;
import co.com.sofka.jeanstore.producto.values.ProductoId;
import co.com.sofka.jeanstore.venta.events.*;
import co.com.sofka.jeanstore.venta.values.Factura;
import co.com.sofka.jeanstore.venta.values.VentaId;

import java.util.List;
import java.util.Objects;


public class Venta extends AggregateEvent<VentaId> {

    public Factura factura;
    //protected Factura factura;
    public ClienteId clienteId;
    //protected ClienteId clienteId;
    public EmpleadoId empleadoId;
    //protected EmpleadoId empleadoId;
    public ProductoId productoId;
    //protected ProductoId productoId;

    public Venta (VentaId entityId, Factura factura){
        super(entityId);
        appendChange(new VentaCreada(factura)).apply();
    }

    private Venta(VentaId entityId){
        super(entityId);
        subscribe(new VentaChange(this));
    }

    public static Venta from(VentaId ventaId, List<DomainEvent> events){
        var venta = new Venta(ventaId);
        events.forEach(venta::applyEvent);
        return venta;
    }

    public void agregarProducto(ProductoId entityId){
        Objects.requireNonNull(entityId);
        appendChange(new ProductoAgregado(entityId)).apply();
    }

    public void cambiarProducto(ProductoId entityId){
        appendChange(new ProductoCambiado(entityId)).apply();
    }

    public void agregarFactura(Factura factura){
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
