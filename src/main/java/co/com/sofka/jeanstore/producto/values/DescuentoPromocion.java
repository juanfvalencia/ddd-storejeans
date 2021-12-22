package co.com.sofka.jeanstore.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DescuentoPromocion implements ValueObject<String> {

    private final String value;

    public DescuentoPromocion(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El descuento por promocion no puede estar vacio");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DescuentoPromocion that = (DescuentoPromocion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
