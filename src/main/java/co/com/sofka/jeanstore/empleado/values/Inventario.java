package co.com.sofka.jeanstore.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Inventario implements ValueObject<String> {

    private final String value;

    public Inventario(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El inventario de Jeans no puede estar vacio");
        }

        if(this.value.isEmpty()){
            throw new IllegalArgumentException("El jeans no se encuentra en stock");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventario that = (Inventario) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
