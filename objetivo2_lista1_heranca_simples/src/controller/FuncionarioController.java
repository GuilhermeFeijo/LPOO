package controller;

import model.*;

import java.sql.SQLOutput;

public class FuncionarioController {

    public static void main(String[] args){
        //Abreviação da classe Util
        Util u = new Util();

        //1.
        //Desenvolvedor
        Desenvolvedor d1 = new DesenvolvedorJunior();
        Desenvolvedor d2 = new DesenvolvedorJunior("Carlos", 1950.00);

        //Gerente
        Gerente g1 = new GerenteDesenvolvimento();
        Gerente g2 = new GerenteGeral("Walter", 8930.00);

        System.out.println("\nExercício 1:");
        System.out.println("Primeiro print com construtores padrões:");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        u.separador();

        d1.setNome("Gabriel");
        d1.setSalario(1950.00);
        g1.setNome("Aline");
        g1.setSalario(5700.00);

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
    }
}
