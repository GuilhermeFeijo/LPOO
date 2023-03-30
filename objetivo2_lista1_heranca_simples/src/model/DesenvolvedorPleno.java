package model;

public class DesenvolvedorPleno extends Desenvolvedor{
    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    public DesenvolvedorPleno() {
    }

    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "DesenvolvedorPleno{} " + super.toString();
    }
}
