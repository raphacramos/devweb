package entidades;

import jakarta.persistence.Entity;

@Entity
public class Scrub extends Produto{
    private String estilo;

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
