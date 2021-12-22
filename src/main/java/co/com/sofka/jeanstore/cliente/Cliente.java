package co.com.sofka.jeanstore.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.jeanstore.cliente.values.ClienteId;
import co.com.sofka.jeanstore.cliente.values.Cuenta;

public class Cliente extends AggregateEvent<ClienteId> {
    protected Cuenta cuenta;
    protected ClienteDetal clienteDetal;
    protected Mayorista mayorista;

    public Cliente (ClienteId entityId, Cuenta cuenta){

        super(entityId);
    }

}
