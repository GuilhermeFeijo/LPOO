package controller;

import model.Carro;

import java.util.*;

public class CarroController {

    public static void main(String[] args){

        //Construtor padrão
        Carro c1 = new Carro("Volkswagen", "Fusca", 1972);
        System.out.println(c1.getMarca());
        System.out.println(c1.getModelo());
        System.out.println(c1.getAnoFabricacao());

        //Parametrizado
        Carro c2 = new Carro("Honda", "Fit", 2008);
        System.out.println(c2.getMarca());
        System.out.println(c2.getModelo());
        System.out.println(c2.getAnoFabricacao());


        //List
        Carro c3 = new Carro("Mercedes Benz", "C63", 2010);
        Carro c4 = new Carro("BMW", "320I", 2008);
        Carro c5 = new Carro("Chevrolet", "Celta", 2009);

        //Atribuição dos objetos no Array carros
        List<Carro> carros = new ArrayList<>();
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);

        //Impressão da Lista na ordem de cadastro
        System.out.println("Lista");
        System.out.println(carros);
        System.out.println();

        //Lista Organizada em ordem alfabética
        System.out.println("Lista em ordem Alfabética");
        carros.sort(Comparator.comparing(Carro::getModelo));
        System.out.println(carros);
        System.out.println();

        //Lista em ordem Alfabética Invertida
        System.out.println("Lista em Ordem Alfabética invertido");
        carros.sort(Comparator.comparing(Carro::getModelo).reversed());
        System.out.println(carros);
        System.out.println();

        System.out.println("MAP");
        Map<String, Carro> carroMap = new HashMap<>();
        carroMap.put(c1.getModelo(), c1);
        carroMap.put(c2.getModelo(),c2);
        carroMap.put(c3.getModelo(),c3);
        carroMap.put(c4.getModelo(),c4);
        carroMap.put(c5.getModelo(),c5);
        System.out.println(carroMap);


    }

}
