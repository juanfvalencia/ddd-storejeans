package co.com.sofka.jeanstore.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.jeanstore.cliente.values.ClienteId;
import co.com.sofka.jeanstore.cliente.values.Cuenta;

public class ClienteActualizado extends DomainEvent {

    private final ClienteId clienteId;
    private final Cuenta cuenta;

    public ClienteActualizado(ClienteId clienteId, Cuenta cuenta){
        super("jeanstore.cliente.clienteactualizado");
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
