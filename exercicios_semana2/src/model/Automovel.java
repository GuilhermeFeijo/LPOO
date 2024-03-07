package model;

public class Automovel {
    private String renavan;
    private String placa;
    private String cor;
    private int num_odas;
    private String combustivel;
    private int quilometragem;
    private String chassi;
    private double valor_locacao;

    public Automovel() {
    }

    public Automovel(String renavan, String placa, String cor, int num_odas, String combustivel, int quilometragem, String chassi, double valor_locacao) {
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.num_odas = num_odas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNum_odas() {
        return num_odas;
    }

    public void setNum_odas(int num_odas) {
        this.num_odas = num_odas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", num_odas=" + num_odas +
                ", combustivel='" + combustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valor_locacao=" + valor_locacao +
                '}';
    }
}
