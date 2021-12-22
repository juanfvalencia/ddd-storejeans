package co.com.sofka.jeanstore.empleado;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.jeanstore.empleado.values.Nombre;
import co.com.sofka.jeanstore.venta.values.EmpleadoId;

public class Empleado extends AggregateEvent<EmpleadoId> {

    protected Nombre nombre;
    protected Administrador administrador;
    protected Vendedor vendedor;

    public Empleado(EmpleadoId entityId, Nombre nombre){
        super(entityId);
    }
}
