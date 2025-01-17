package entidades;

import jakarta.persistence.Entity;

@Entity
public class Jaleco extends Produto{
    private String tecido;

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
}
