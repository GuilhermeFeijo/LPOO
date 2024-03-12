package controller;

import model.Automovel;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel(2L, "48391945993", "IOU0I24", "Branco", 4, "Flex", 135000, "48581GUJ49481K", 350.00);


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(automovel1);
        System.out.println(automovel2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        automovel1.setId(1L);
        automovel1.setRenavan("948184817474");
        automovel1.setPlaca("AEM8O39");
        automovel1.setCor("Verde");
        automovel1.setNum_rodas(4);
        automovel1.setCombustivel("Diesel");
        automovel1.setQuilometragem(50000);
        automovel1.setChassi("58FJ494105J5U");
        automovel1.setValor_locacao(930.00);

        automovel2.setId(2L);
        automovel2.setRenavan("959418581948 ");
        automovel2.setPlaca("OTL3J45");
        automovel2.setCor("Vermelho");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("Gasolina");
        automovel2.setQuilometragem(34000);
        automovel2.setChassi("95981JJF83714D");
        automovel2.setValor_locacao(1200);


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nAutomovel1:");
        System.out.println(automovel1.getId());
        System.out.println(automovel1.getRenavan());
        System.out.println(automovel1.getPlaca());
        System.out.println(automovel1.getCor());
        System.out.println(automovel1.getNum_rodas());
        System.out.println(automovel1.getCombustivel());
        System.out.println(automovel1.getQuilometragem());
        System.out.println(automovel1.getChassi());
        System.out.println(automovel1.getValor_locacao());

        System.out.println("\nAutomovel2:");
        System.out.println(automovel2.getId());
        System.out.println(automovel2.getRenavan());
        System.out.println(automovel2.getPlaca());
        System.out.println(automovel2.getCor());
        System.out.println(automovel2.getNum_rodas());
        System.out.println(automovel2.getCombustivel());
        System.out.println(automovel2.getQuilometragem());
        System.out.println(automovel2.getChassi());
        System.out.println(automovel2.getValor_locacao());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Automovel automovel3 = new Automovel(3L, "858148457", "IJL1F39", "Branco", 4, "Flex", 95000, "584383918GJ0", 350.00);
        Automovel automovel4 = new Automovel(3L, "858148457", "IJL1F39", "Branco", 4, "Flex", 95000, "584383918GJ0", 350.00);
        Automovel automovel5 = new Automovel(5L, "481757173", "UFO0I12", "Preto", 4, "Flex", 15000, "859185J301H3", 999.99);
        List<Automovel> automovelsList = new ArrayList<>();
        automovelsList.add(automovel1);
        automovelsList.add(automovel2);
        automovelsList.add(automovel3);
        automovelsList.add(automovel4);
        automovelsList.add(automovel5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + automovelsList);

        // e o objeto de id=3 de cada coleção
        automovelsList.forEach(automovel -> {
            if(automovel.getId() == 3){
                System.out.print("\n Automovel de id 3 no List\n" + automovel + "\n");
            }
        });

        automovelsList.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + automovelsList);


        Map<Long, Automovel> automoveisMap = new HashMap<>();
        automoveisMap.put(automovel1.getId(), automovel1);
        automoveisMap.put(automovel2.getId(), automovel2);
        automoveisMap.put(automovel3.getId(), automovel3);
        automoveisMap.put(automovel4.getId(), automovel4);
        automoveisMap.put(automovel5.getId(), automovel5);
        System.out.println("\nMap\n" + automoveisMap);

        System.out.print("\nAutomovel de ID 3 no MAP\n" + automoveisMap.get(3L));

        //Não é possível reordenar o MAP pois quebrará o hash

    }
}
