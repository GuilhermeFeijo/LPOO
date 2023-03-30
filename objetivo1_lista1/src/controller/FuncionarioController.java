package controller;

import model.Funcionario;
import java.util.*;

public class FuncionarioController {

    public static void main(String[] args){

        //Construtor padrão
        Funcionario funcionario1 = new Funcionario("Pedro", 890.00);
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());

        //Parametrizado
        Funcionario funcionario2 = new Funcionario("Joãozinho", 1350.00);
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getSalario());

        //List
        Funcionario funcionario3 = new Funcionario("Gabriel", 1290.00);
        Funcionario funcionario4 = new Funcionario("Henrique", 1500.00);
        Funcionario funcionario5 = new Funcionario("Cleber", 3250.00);

        //Atribuição dos objetos no Array funcionarios
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);

        //Impressão da Lista na ordem de cadastro
        System.out.println("Lista");
        System.out.println(funcionarios);
        System.out.println();

        //Lista Organizada em ordem alfabética
        System.out.println("Lista em ordem Alfabética");
        funcionarios.sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(funcionarios);
        System.out.println();

        //Lista em ordem Alfabética Invertida
        System.out.println("Lista em Ordem Alfabética invertido");
        funcionarios.sort(Comparator.comparing(Funcionario::getNome).reversed());
        System.out.println(funcionarios);
        System.out.println();

        System.out.println("MAP");
        Map<String, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(funcionario1.getNome(), funcionario1);
        funcionarioMap.put(funcionario2.getNome(),funcionario2);
        funcionarioMap.put(funcionario3.getNome(),funcionario3);
        funcionarioMap.put(funcionario4.getNome(),funcionario4);
        funcionarioMap.put(funcionario5.getNome(),funcionario5);
        System.out.println(funcionarioMap);

    }

}
