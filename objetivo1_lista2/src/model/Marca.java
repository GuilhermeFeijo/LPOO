package model;

public class Marca {

    private int ID;
    private String descricao;

    public Marca(int ID, String descricao) {
        this.ID = ID;
        this.descricao = descricao;
    }

    public Marca() {
    }

    public String getDescricao() {
        return descricao;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "ID=" + ID +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
