package co.com.sofka.jeanstore.empleado.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.jeanstore.producto.values.JeansHombreId;

public class VendedorId extends Identity {

    public VendedorId(){

    }

    private VendedorId(String id){
        super(id);
    }

    public static VendedorId of(String id){
        return new VendedorId(id);
    }
}
