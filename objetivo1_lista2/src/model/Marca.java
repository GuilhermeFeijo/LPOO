package model;

public class Marca {

    private Long id;
    private String Marca;

    public Marca() {
    }

    public Marca(Long id, String marca) {
        this.id = id;
        Marca = marca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", Marca='" + Marca + '\'' +
                '}';
    }
}
