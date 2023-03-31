package model;

public class Carro extends Veiculo implements Automovel{

    private int capacidadePortaMalas;

    public Carro() {
        super();
    }

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
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
        return "Carro: " +
                "Capacidade do Porta Malas=" + capacidadePortaMalas +
                ", " + super.toString();
    }
}
