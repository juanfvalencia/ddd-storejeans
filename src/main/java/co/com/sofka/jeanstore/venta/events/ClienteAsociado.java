package co.com.sofka.jeanstore.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.cliente.values.ClienteId;
import co.com.sofka.jeanstore.cliente.values.Cuenta;

public class ClienteAsociado extends DomainEvent {

    private final ClienteId clienteId;
    private final Cuenta cuenta;

    public ClienteAsociado(ClienteId clienteId, Cuenta cuenta){
        super("jeanstore.venta.clienteagregado");
        this.clienteId = clienteId;
        this.cuenta = cuenta;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
