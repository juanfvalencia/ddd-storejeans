package co.com.sofka.jeanstore.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Factura implements ValueObject<String> {

    private final String value;

    public Factura(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La factura no puede estar vacia");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(value, factura.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
