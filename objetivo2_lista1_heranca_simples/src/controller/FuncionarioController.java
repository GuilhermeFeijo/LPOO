package controller;

import model.*;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    private static double total_salario_base = 0;
    private static double total_salario = 0;

    public static void main(String[] args){
        //Abreviação da classe Util
        Util u = new Util();

        //1.
        //Desenvolvedor
        Desenvolvedor d1 = new DesenvolvedorJunior();
        Desenvolvedor d2 = new DesenvolvedorJunior("Carlos", 1800.00);

        //Gerente
        Gerente g1 = new GerenteDesenvolvimento();
        Gerente g2 = new GerenteGeral("Walter", 6500.00);

        System.out.println("\nExercício 1:");
        System.out.println("Primeiro print com construtores padrões:");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        u.separador();

        d1.setNome("Gabriel");
        d1.setSalario(1800.00);
        g1.setNome("Aline");
        g1.setSalario(4500.00);

        System.out.println("Após alteração dos objetos sem parâmetros:");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        u.separador();

        //1.1
        //Não foi possível, a classe funcionário é uma classe abstrata, sendo assim só é possível instanciar suas sub-classes.

        //1.2
        //Nas classes Gerente e Desenvolvedor, sempre as definições ficam nas classes de Modelo.

        //2.
        //Desenvolvedores Senior
        Desenvolvedor d3 = new DesenvolvedorSenior("Jorge", 3500.00);
        Desenvolvedor d4 = new DesenvolvedorSenior("Henrique", 3500.00);
        Desenvolvedor d5 = new DesenvolvedorSenior("Ana Luisa", 3500.00);
        Desenvolvedor d6 = new DesenvolvedorSenior("Cleberson", 3500.00);
        Desenvolvedor d7 = new DesenvolvedorSenior("Alice", 3500.00);
        Desenvolvedor d8 = new DesenvolvedorSenior("Carolina", 3500.00);
        //Desenvolvedores Pleno
        Desenvolvedor d9 = new DesenvolvedorPleno("Pedro", 2500.00);
        Desenvolvedor d10 = new DesenvolvedorPleno("João", 2500.00);
        Desenvolvedor d11 = new DesenvolvedorPleno("Augusto", 2500.00);
        Desenvolvedor d12 = new DesenvolvedorPleno("Vilson", 2500.00);
        Desenvolvedor d13 = new DesenvolvedorPleno("Amanda", 2500.00);
        Desenvolvedor d14 = new DesenvolvedorPleno("Guilherme", 2500.00);
        //Desenvolvedores Junior
        Desenvolvedor d15 = new DesenvolvedorJunior("Rafael", 1800.00);
        Desenvolvedor d16 = new DesenvolvedorJunior("Enzo", 1800.00);
        Desenvolvedor d17 = new DesenvolvedorJunior("Francis", 1800.00);
        Desenvolvedor d18 = new DesenvolvedorJunior("Andrey", 1800.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(d6);
        funcionarios.add(d7);
        funcionarios.add(d8);
        funcionarios.add(d9);
        funcionarios.add(d10);
        funcionarios.add(d11);
        funcionarios.add(d12);
        funcionarios.add(d13);
        funcionarios.add(d14);
        funcionarios.add(d15);
        funcionarios.add(d16);
        funcionarios.add(d17);
        funcionarios.add(d18);

        //Soma os salários com o bonus
        funcionarios.forEach(f -> {
            total_salario = total_salario + (f.getSalario() + f.getBonus());
        });

        //Soma os salários sem o bonus
        funcionarios.forEach(f -> {
            total_salario_base = total_salario_base + f.getSalario();
        });

        //Impressão das folhas salariais totaisg com e sem bonus
        System.out.println("Folha Salarial da Empresa com Bônus: "+
                NumberFormat.getCurrencyInstance().format(total_salario)+
                "\nFolha Salarial da Empresa sem Bônus: "+
                NumberFormat.getCurrencyInstance().format(total_salario_base));



    }
}
