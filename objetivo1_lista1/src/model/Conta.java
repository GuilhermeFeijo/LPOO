package model;

public class Conta {
    private double saldo;

    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }

    private long id;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void saca(double valor) {
        this.saldo = this.saldo - valor;
    }
    public void atualiza(double taxa) {
        this.saldo = this.saldo * taxa;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", id=" + id +
                '}';
    }
}
