package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Carro carro1 = new Carro();
        Carro carro2 = new Carro(2, "ford", "fiesta", 1999);


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(carro1);
        System.out.println(carro2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        carro1.setId(1);
        carro1.setMarca("Volkswagen");
        carro1.setModelo("Gol GTI 16v");
        carro1.setAnoFabricacao(1998);

        carro2.setId(2);
        carro2.setMarca("Chevrolet");
        carro2.setModelo("Vectra GSI 16v");
        carro2.setAnoFabricacao(1995);


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nCarro1:");
        System.out.println(carro1.getId());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());

        System.out.println("\nCarro2:");
        System.out.println(carro2.getId());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Carro carro3 = new Carro(3, "Honda", "Civic SI", 2009);
        Carro carro4 = new Carro(4, "ford", "fiesta", 1999);
        Carro carro5 = new Carro(4, "ford", "fiesta", 1999);
        List<Carro> carrosList = new ArrayList<>();
        carrosList.add(carro1);
        carrosList.add(carro2);
        carrosList.add(carro3);
        carrosList.add(carro4);
        carrosList.add(carro5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + carrosList);

        // e o objeto de id=3 de cada coleção
        for(Carro carro : carrosList){
            if(carro.getId() == 3){
                System.out.print("\n Carro de id 3 no List\n" + carro + "\n");
            }
        }

        carrosList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + carrosList);


        Map<Integer, Carro> carrosMap = new HashMap<>();
        carrosMap.put(carro1.getId(), carro1);
        carrosMap.put(carro3.getId(), carro3);
        carrosMap.put(carro3.getId(), carro3);
        carrosMap.put(carro4.getId(), carro4);
        carrosMap.put(carro5.getId(), carro5);
        System.out.println("\nMap\n" + carrosMap);

        System.out.print("\nCarro de ID 3 no MAP\n" + carrosMap.get(3));

        //Não consegui ordernar o Map, necessário tirar dúvida em aula posteriormente

    }
}
