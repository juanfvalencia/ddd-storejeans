package co.com.sofka.jeanstore.cliente.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.jeanstore.empleado.values.AdministradorId;

public class MayoristaId extends Identity {

    public MayoristaId(){

    }

    private MayoristaId(String id){
        super(id);
    }

    public static MayoristaId of(String id){
        return new MayoristaId(id);
    }
}
