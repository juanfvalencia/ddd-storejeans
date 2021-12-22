package co.com.sofka.jeanstore.producto.values;

import co.com.sofka.domain.generic.Identity;

public class JeansHombreId extends Identity {

    public JeansHombreId(){

    }

    private JeansHombreId(String id){
        super(id);
    }

    public static JeansHombreId of(String id){
        return new JeansHombreId(id);
    }
}
