package co.com.sofka.jeanstore.empleado;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.jeanstore.empleado.events.EmpleadoAgregado;
import co.com.sofka.jeanstore.empleado.values.Nombre;
import co.com.sofka.jeanstore.empleado.values.EmpleadoId;

import java.util.Objects;

public class Empleado extends AggregateEvent<EmpleadoId> {

    protected Nombre nombre;
    protected Administrador administrador;
    protected Vendedor vendedor;

    public Empleado(EmpleadoId entityId, Nombre nombre){
        super(entityId);
    }

    public void agregarEmpleado (EmpleadoId empleadoId, Nombre nombre){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(nombre);
        appendChange(new EmpleadoAgregado(empleadoId, nombre));
    }

    public Nombre nombre(){
        return nombre;
    }

    public Administrador administrador(){
        return administrador;
    }

    public Vendedor vendedor(){
        return vendedor;
    }
}
