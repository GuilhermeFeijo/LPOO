package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(2, 300);


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(conta1);
        System.out.println(conta2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        conta1.setId(1);
        conta1.deposita(200);
        conta1.atualiza(10);

        conta2.setId(2);
        conta2.saca(100);
        conta2.atualiza(20);


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nConta1:");
        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());

        System.out.println("\nConta2:");
        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Conta conta3 = new Conta(3, 600);
        Conta conta4 = new Conta(4, 400);
        Conta conta5 = new Conta(4, 400);
        List<Conta> contasList = new ArrayList<>();
        contasList.add(conta1);
        contasList.add(conta2);
        contasList.add(conta3);
        contasList.add(conta4);
        contasList.add(conta5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + contasList);

        // e o objeto de id=3 de cada coleção
        contasList.forEach(conta -> {
            if(conta.getId() == 3){
                System.out.print("\n Conta de id 3 no List\n" + conta + "\n");
            }
        });

        contasList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + contasList);


        Map<Integer, Conta> contasMap = new HashMap<>();
        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta5.getId(), conta5);
        System.out.println("\nMap\n" + contasMap);

        System.out.print("\nConta de ID 3 no MAP\n" + contasMap.get(3));

        //Não é possível reordenar o MAP pois quebrará o hash

    }
}
