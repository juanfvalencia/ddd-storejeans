package co.com.sofka.jeanstore.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.jeanstore.cliente.events.ClienteActualizado;
import co.com.sofka.jeanstore.cliente.events.ClienteAgregado;
import co.com.sofka.jeanstore.cliente.values.ClienteId;
import co.com.sofka.jeanstore.cliente.values.Cuenta;

import java.util.Objects;

public class Cliente extends AggregateEvent<ClienteId> {

    protected ClienteDetal clienteDetal;
    protected Mayorista mayorista;
    protected Cuenta cuenta;

    public Cliente (ClienteId entityId, Cuenta cuenta){
        super(entityId);
    }

    public void agregarCliente(ClienteId entityId, Cuenta cuenta){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(cuenta);
        appendChange(new ClienteAgregado(entityId, cuenta)).apply();
    }

    public void actualizarCliente(ClienteId entityId, Cuenta cuenta){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(cuenta);
        appendChange(new ClienteActualizado(entityId, cuenta)).apply();
    }

    public ClienteDetal clienteDetal(){
        return clienteDetal;
    }

    public Mayorista mayorista(){
        return mayorista;
    }

    public Cuenta cuenta(){
        return cuenta;
    }

}
