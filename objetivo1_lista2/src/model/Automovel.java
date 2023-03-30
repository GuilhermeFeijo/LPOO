package model;

public class Automovel {

    private int ID;
    private String renavan;
    private String placa;
    private String cor;
    private int rodas;
    private String combustivel;
    private int quilometragem;
    private String chassi;
    private double valor_locacao;

    public Automovel() {
    }

    public Automovel(int ID, String renavan, String placa, String cor, int rodas, String combustivel, int quilometragem, String chassi, double valor_locacao) {
        this.ID = ID;
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.rodas = rodas;
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

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "\nID='" + ID + '\''+
                "\nrenavan='" + renavan + '\'' +
                "\nplaca='" + placa + '\'' +
                "\ncor='" + cor + '\'' +
                "\nrodas=" + rodas +
                "\ncombustivel='" + combustivel + '\'' +
                "\nquilometragem=" + quilometragem +
                "\nchassi='" + chassi + '\'' +
                "\nvalor_locacao=" + valor_locacao +
                '}';
    }
}
