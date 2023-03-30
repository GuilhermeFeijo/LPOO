package controller;

import model.*;

public class FuncionarioController {

    public static void main(String[] args){
        //1.
        //Desenvolvedor
        Desenvolvedor d1 = new DesenvolvedorJunior();
        Desenvolvedor d2 = new DesenvolvedorJunior("Carlos", 1950.00);

        //Gerente
        Gerente g1 = new GerenteDesenvolvimento();
        Gerente g2 = new GerenteGeral("Walter", 8930.00);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);
    }
}
