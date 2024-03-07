package model;

import java.sql.Time;
import java.util.Date;

public class Locacao {
    private Date dataLocacao;
    private Time horaLocacao;
    private Date dataDevolucao;
    private Time horaDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valorLocacao;
    private boolean devolvido;

    //Constructors
    public Locacao() {
    }

    public Locacao(Date dataLocacao, Time horaLocacao, Date dataDevolucao, Time horaDevolucao, int quilometragem, double valorCalcao, double valorLocacao, boolean devolvido) {
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
    }



    //Getter and Setters
    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Time getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(Time horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Time getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valor_locacao=" + valorLocacao +
                ", devolvido=" + devolvido +
                '}';
    }
}
