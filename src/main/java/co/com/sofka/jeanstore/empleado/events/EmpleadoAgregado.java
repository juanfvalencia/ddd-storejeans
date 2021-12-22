package co.com.sofka.jeanstore.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.empleado.values.EmpleadoId;
import co.com.sofka.jeanstore.empleado.values.Nombre;

public class EmpleadoAgregado extends DomainEvent {

    private final EmpleadoId empleadoId;
    private final Nombre nombre;

    public EmpleadoAgregado(EmpleadoId empleadoId, Nombre nombre){
        super("jeanstore.empleado.empleadoagregado");
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
