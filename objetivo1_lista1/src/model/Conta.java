package model;

public class Conta {

    private Long id;
    private double saldo;

    public Conta() {
    }

    public Conta(Long id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        if(valor >= 0){
            this.saldo += valor;
        }
    }

    public void saca(double valor) {
        if(this.saldo > valor){
            this.saldo -= valor;
        }
    }

    public void atualiza(double taxa) {

        this.saldo += this.saldo * (taxa/100);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
