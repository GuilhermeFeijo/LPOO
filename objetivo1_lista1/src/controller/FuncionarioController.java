package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario(2L, "Jorge", 2100);


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(funcionario1);
        System.out.println(funcionario2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        funcionario1.setId(1L);
        funcionario1.setNome("Maria");
        funcionario1.setSalario(6800);

        funcionario2.setId(2L);
        funcionario2.setNome("Cleber");
        funcionario2.setSalario(3200);


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nFuncionario1:");
        System.out.println(funcionario1.getId());
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());

        System.out.println("\nFuncionario2:");
        System.out.println(funcionario2.getId());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getSalario());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Funcionario funcionario3 = new Funcionario(3L, "Marlon", 1800);
        Funcionario funcionario4 = new Funcionario(4L, "João", 2500);
        Funcionario funcionario5 = new Funcionario(4L, "João", 2500);
        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(funcionario1);
        funcionariosList.add(funcionario2);
        funcionariosList.add(funcionario3);
        funcionariosList.add(funcionario4);
        funcionariosList.add(funcionario5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + funcionariosList);

        // e o objeto de id=3 de cada coleção
        funcionariosList.forEach(funcionario -> {
            if(funcionario.getId() == 3){
                System.out.print("\n Funcionario de id 3 no List\n" + funcionario + "\n");
            }
        });

        funcionariosList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + funcionariosList);


        Map<Long, Funcionario> funcionariosMap = new HashMap<>();
        funcionariosMap.put(funcionario1.getId(), funcionario1);
        funcionariosMap.put(funcionario2.getId(), funcionario2);
        funcionariosMap.put(funcionario3.getId(), funcionario3);
        funcionariosMap.put(funcionario4.getId(), funcionario4);
        funcionariosMap.put(funcionario5.getId(), funcionario5);
        System.out.println("\nMap\n" + funcionariosMap);

        System.out.print("\nFuncionario de ID 3 no MAP\n" + funcionariosMap.get(3L));

        //Não é possível reordenar o MAP pois quebrará o hash

    }
}
