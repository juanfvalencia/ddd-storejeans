package co.com.sofka.jeanstore.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.empleado.values.EmpleadoId;
import co.com.sofka.jeanstore.empleado.values.Nombre;

public class EmpleadoAsociado extends DomainEvent {

    private final EmpleadoId empleadoId;
    private final Nombre nombre;

    public EmpleadoAsociado(EmpleadoId empleadoId, Nombre nombre){
        super("jeanstore.venta.empleadoasociado");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
