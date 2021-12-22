package co.com.sofka.jeanstore.cliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.jeanstore.cliente.values.ClienteDetalId;
import co.com.sofka.jeanstore.cliente.values.Cuenta;

import java.util.Objects;

public class ClienteDetal extends Entity<ClienteDetalId> {

    private Cuenta cuenta;

    public ClienteDetal(ClienteDetalId entityId, Cuenta cuenta){
        super(entityId);
        this.cuenta = cuenta;
    }

    public void actualizarCuenta(Cuenta cuenta){
        this.cuenta = Objects.requireNonNull(cuenta);
    }
    public Cuenta cuenta(){
        return cuenta;
    }
}
