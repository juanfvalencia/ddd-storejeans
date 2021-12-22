package co.com.sofka.jeanstore.cliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.jeanstore.cliente.values.Cuenta;
import co.com.sofka.jeanstore.cliente.values.MayoristaId;

import java.util.Objects;

public class Mayorista extends Entity<MayoristaId> {

    private Cuenta cuenta;

    public Mayorista(MayoristaId entityId, Cuenta cuenta){
        super(entityId);
        this.cuenta = cuenta;
    }

    public void actualziarCuenta(Cuenta cuenta){
        this.cuenta = Objects.requireNonNull(cuenta);
    }

    public Cuenta cuenta(){
        return cuenta;
    }
}
