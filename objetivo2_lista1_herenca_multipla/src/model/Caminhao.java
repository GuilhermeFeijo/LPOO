package model;

public class Caminhao extends Veiculo implements Automovel{
    private int capacidadeDeCarga;

    public Caminhao() {
        super();
    }

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public String getRenavan() {
        return null;
    }

    @Override
    public void setRenavan(String renavan) {

    }

    @Override
    public String getChassi() {
        return null;
    }

    @Override
    public void setChassi(String chassi) {

    }

    @Override
    public String getPlaca() {
        return null;
    }

    @Override
    public void setPlaca(String placa) {

    }

    @Override
    public String toString() {
        return "Caminhao:" +
                "Capacidade de Carga=" + capacidadeDeCarga +
                ", " + super.toString();
    }
}
