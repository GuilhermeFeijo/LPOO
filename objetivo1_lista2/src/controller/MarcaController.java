package controller;

import model.Marca;

import java.util.*;

public class MarcaController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Marca marca1 = new Marca();
        Marca marca2 = new Marca(2L, "Chevrolet");


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(marca1);
        System.out.println(marca2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        marca1.setId(1L);
        marca1.setMarca("Chevrolet");

        marca2.setId(2L);
        marca2.setMarca("Volkswagen");


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nMarca1:");
        System.out.println(marca1.getId());
        System.out.println(marca1.getMarca());

        System.out.println("\nMarca2:");
        System.out.println(marca2.getId());
        System.out.println(marca2.getMarca());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Marca marca3 = new Marca(3L, "Volkswagen");
        Marca marca4 = new Marca(3L, "Volkswagen");
        Marca marca5 = new Marca(4L, "Volkswagen");
        List<Marca> marcasList = new ArrayList<>();
        marcasList.add(marca1);
        marcasList.add(marca2);
        marcasList.add(marca3);
        marcasList.add(marca4);
        marcasList.add(marca5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + marcasList);

        // e o objeto de id=3 de cada coleção
        marcasList.forEach(marca -> {
            if(marca.getId() == 3){
                System.out.print("\n Marca de id 3 no List\n" + marca + "\n");
            }
        });

        marcasList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + marcasList);


        Map<Long, Marca> marcasMap = new HashMap<>();
        marcasMap.put(marca1.getId(), marca1);
        marcasMap.put(marca2.getId(), marca2);
        marcasMap.put(marca3.getId(), marca3);
        marcasMap.put(marca4.getId(), marca4);
        marcasMap.put(marca5.getId(), marca5);
        System.out.println("\nMap\n" + marcasMap);

        System.out.print("\nMarca de ID 3 no MAP\n" + marcasMap.get(3L));

        //Não é possível reordenar o MAP pois quebrará o hash

    }
}
