package model;

public class Modelo {

    private int ID;
    private String descricao;

    public Modelo() {
    }

    public Modelo(int ID, String descricao) {
        this.ID = ID;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "ID=" + ID +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
