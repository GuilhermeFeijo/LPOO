package controller;

import model.Conta;

import java.util.*;

public class ContaController {

    public static void main(String[] args){

        //Construtor padrão
        Conta c1 = new Conta(350.00);
        System.out.println(c1.getSaldo());

        //Parametrizado
        Conta c2 = new Conta(5500.00);
        System.out.println(c2.getSaldo());


        //List
        Conta c3 = new Conta(6500.00);
        Conta c4 = new Conta(0.0);
        Conta c5 = new Conta(2500.00);

        //Atribuição dos objetos no Array contas
        List<Conta> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);
        contas.add(c5);

        //Impressão da Lista na ordem de cadastro
        System.out.println("Lista");
        System.out.println(contas);
        System.out.println();

        //Lista Organizada em ordem alfabética
        System.out.println("Lista em ordem Alfabética");
        contas.sort(Comparator.comparing(Conta::getId));
        System.out.println(contas);
        System.out.println();

        //Lista em ordem Alfabética Invertida
        System.out.println("Lista em Ordem Alfabética invertido");
        contas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contas);
        System.out.println();

        System.out.println("MAP");
        Map<Long, Conta> ContaMap = new HashMap<>();
        ContaMap.put(c1.getId(),c1);
        ContaMap.put(c2.getId(),c2);
        ContaMap.put(c3.getId(),c3);
        ContaMap.put(c4.getId(),c4);
        ContaMap.put(c5.getId(),c5);
        System.out.println(ContaMap);

    }

}
