package co.com.sofka.jeanstore.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Referencia implements ValueObject<String> {
    private final String value;

    public Referencia(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Referencia del Jeans no puede estar vacio");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Referencia that = (Referencia) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
