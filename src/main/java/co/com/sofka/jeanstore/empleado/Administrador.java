package co.com.sofka.jeanstore.empleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.jeanstore.empleado.values.AdministradorId;
import co.com.sofka.jeanstore.empleado.values.Inventario;
import co.com.sofka.jeanstore.empleado.values.Nombre;

import java.util.Objects;

public class Administrador extends Entity<AdministradorId> {

    private Nombre nombre;
    private Inventario inventario;

    public Administrador(AdministradorId entityId, Nombre nombre, Inventario inventario){
        super(entityId);
        this.nombre = nombre;
        this.inventario = inventario;
    }

    public void actualizarInventario(Inventario inventario){
        this.inventario = Objects.requireNonNull(inventario);
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Inventario getInventario() {
        return inventario;
    }
}
