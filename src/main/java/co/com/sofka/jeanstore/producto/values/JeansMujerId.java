package co.com.sofka.jeanstore.producto.values;


import co.com.sofka.domain.generic.Identity;

public class JeansMujerId extends Identity {

    public JeansMujerId(){

    }

    private JeansMujerId(String id){
        super(id);
    }

    public static JeansMujerId of(String id){
        return new JeansMujerId(id);
    }
}
