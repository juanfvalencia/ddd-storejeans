package co.com.sofka.jeanstore.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.jeanstore.venta.values.ClienteId;
import co.com.sofka.jeanstore.venta.values.VentaId;

public class asociarCliente extends Command {

    private final VentaId ventaId;
    private final ClienteId clienteId;

    public asociarCliente(VentaId ventaId, ClienteId clienteId) {
        this.ventaId = ventaId;
        this.clienteId = clienteId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
