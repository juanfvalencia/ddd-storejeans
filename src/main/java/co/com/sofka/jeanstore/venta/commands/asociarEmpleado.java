package co.com.sofka.jeanstore.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.jeanstore.venta.values.EmpleadoId;
import co.com.sofka.jeanstore.venta.values.VentaId;

public class asociarEmpleado extends Command {

    private final VentaId ventaId;
    private final EmpleadoId empleadoId;

    public asociarEmpleado(VentaId ventaId, EmpleadoId empleadoId) {
        this.ventaId = ventaId;
        this.empleadoId = empleadoId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
