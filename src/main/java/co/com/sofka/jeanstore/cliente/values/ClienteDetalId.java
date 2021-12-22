package co.com.sofka.jeanstore.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteDetalId extends Identity {

    public ClienteDetalId(){

    }

    private ClienteDetalId(String id){
        super(id);
    }

    public static ClienteDetalId of(String id){
        return new ClienteDetalId(id);
    }
}
