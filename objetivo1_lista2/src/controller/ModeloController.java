package controller;

import model.Modelo;

import java.util.*;

public class ModeloController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo(2L, "Celta");


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(modelo1);
        System.out.println(modelo2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        modelo1.setId(1L);
        modelo1.setDescricao("Vectra");

        modelo2.setId(2L);
        modelo2.setDescricao("Parati");


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nModelo1:");
        System.out.println(modelo1.getId());
        System.out.println(modelo1.getDescricao());

        System.out.println("\nModelo2:");
        System.out.println(modelo2.getId());
        System.out.println(modelo2.getDescricao());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Modelo modelo3 = new Modelo(3L, "fusca");
        Modelo modelo4 = new Modelo(3L, "fusca");
        Modelo modelo5 = new Modelo(4L, "Kombi");
        List<Modelo> modelosList = new ArrayList<>();
        modelosList.add(modelo1);
        modelosList.add(modelo2);
        modelosList.add(modelo3);
        modelosList.add(modelo4);
        modelosList.add(modelo5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + modelosList);

        // e o objeto de id=3 de cada coleção
        modelosList.forEach(modelo -> {
            if(modelo.getId() == 3){
                System.out.print("\n Modelo de id 3 no List\n" + modelo + "\n");
            }
        });

        modelosList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + modelosList);


        Map<Long, Modelo> modelosMap = new HashMap<>();
        modelosMap.put(modelo1.getId(), modelo1);
        modelosMap.put(modelo2.getId(), modelo2);
        modelosMap.put(modelo3.getId(), modelo3);
        modelosMap.put(modelo4.getId(), modelo4);
        modelosMap.put(modelo5.getId(), modelo5);
        System.out.println("\nMap\n" + modelosMap);

        System.out.print("\nModelo de ID 3 no MAP\n" + modelosMap.get(3L));

        //Não é possível reordenar o MAP pois quebrará o hash

    }
}
