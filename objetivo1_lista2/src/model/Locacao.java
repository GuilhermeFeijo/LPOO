package model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Locacao {

    private int ID;
    private LocalDate dataLocacao;
    private LocalTime horaLocacao;
    private LocalDate dataDevolucao;
    private LocalTime horaDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valorLocacao;
    private boolean devolvido;

    public Locacao() {
    }

    public Locacao(int ID, LocalDate dataLocacao, LocalTime horaLocacao, LocalDate dataDevolucao, LocalTime horaDevolucao, int quilometragem, double valorCalcao, double valorLocacao, boolean devolvido) {
        this.ID = ID;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalTime getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(LocalTime horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalTime horaDevolucao) {
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
                "\nID=" + ID +
                "\ndataLocacao=" + dataLocacao +
                "\nhoraLocacao=" + horaLocacao +
                "\ndataDevolucao=" + dataDevolucao +
                "\nhoraDevolucao=" + horaDevolucao +
                "\nquilometragem=" + quilometragem +
                "\nvalorCalcao=" + valorCalcao +
                "\nvalorLocacao=" + valorLocacao +
                "\ndevolvido=" + devolvido +
                '}';
    }
}
