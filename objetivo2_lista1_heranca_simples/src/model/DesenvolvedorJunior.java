package model;

public class DesenvolvedorJunior extends Desenvolvedor{
    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    public DesenvolvedorJunior() {
    }

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "DesenvolvedorJunior{} " + super.toString();
    }
}
