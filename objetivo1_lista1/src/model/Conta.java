package model;

public class Conta {

    private int id;
    private double saldo;

    public Conta() {
    }

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        if(valor >= 0){
            this.saldo = valor + this.saldo;
        }
    }

    public void saca(double valor) {
        if(this.saldo > valor){
            this.saldo = this.saldo - valor;
        }
    }

    public void atualiza(double taxa) {
        this.saldo = this.saldo - taxa;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
