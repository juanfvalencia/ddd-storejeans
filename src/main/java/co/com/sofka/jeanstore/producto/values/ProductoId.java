package co.com.sofka.jeanstore.producto.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.jeanstore.venta.values.VentaId;

public class ProductoId extends Identity {

    public ProductoId(){

    }

    private ProductoId(String id){
        super(id);
    }

    public static ProductoId of(String id){
        return new ProductoId(id);
    }
}
