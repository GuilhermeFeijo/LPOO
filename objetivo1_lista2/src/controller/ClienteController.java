package controller;

import model.Cliente;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente(2L, "123.456.789-00", "João", "Borges", "Rua Comendador Rafael Mazza 1942", "96030-020", "(53)98135-3434", "joaofborges@gmail.com");


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(cliente1);
        System.out.println(cliente2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        cliente1.setId(1L);
        cliente1.setCpf("098.765.432-10");
        cliente1.setNome("Cleber");
        cliente1.setSobrenome("Weber");
        cliente1.setEndereco("Avenida Adolfo Fetter 4918");
        cliente1.setCep("96050-010");
        cliente1.setTelefone("(53)99912-8483");

        cliente2.setId(2L);
        cliente2.setCpf("111.222.333-44");
        cliente2.setNome("Cleber");
        cliente2.setSobrenome("Weber");
        cliente2.setEndereco("Avenida Adolfo Fetter 4918");
        cliente2.setCep("96050-010");
        cliente2.setTelefone("(53)99912-8483");


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nCliente1:");
        System.out.println(cliente1.getId());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getCep());
        System.out.println(cliente1.getTelefone());

        System.out.println("\nCliente2:");
        System.out.println(cliente2.getId());
        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getSobrenome());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getCep());
        System.out.println(cliente2.getTelefone());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Cliente cliente3 = new Cliente(3L, "444.333.555-66", "Jorge", "Silva", "Rua Almirante Barroso 312", "96030-000", "(53)99112-6628", "jorgessilva@gmail.com");
        Cliente cliente4 = new Cliente(3L, "444.333.555-66", "Jorge", "Silva", "Rua Almirante Barroso 312", "96030-000", "(53)99112-6628", "jorgessilva@gmail.com");
        Cliente cliente5 = new Cliente(4L, "999.888.333-12", "Vilma", "Soares", "Rua Alberto Bento 98", "96050-040", "(53)99952-8938", "vsilva@gmail.com");
        List<Cliente> clientesList = new ArrayList<>();
        clientesList.add(cliente1);
        clientesList.add(cliente2);
        clientesList.add(cliente3);
        clientesList.add(cliente4);
        clientesList.add(cliente5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + clientesList);

        // e o objeto de id=3 de cada coleção
        clientesList.forEach(cliente -> {
            if(cliente.getId() == 3){
                System.out.print("\n Cliente de id 3 no List\n" + cliente + "\n");
            }
        });

        clientesList.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + clientesList);


        Map<Long, Cliente> clientesMap = new HashMap<>();
        clientesMap.put(cliente1.getId(), cliente1);
        clientesMap.put(cliente2.getId(), cliente2);
        clientesMap.put(cliente3.getId(), cliente3);
        clientesMap.put(cliente4.getId(), cliente4);
        clientesMap.put(cliente5.getId(), cliente5);
        System.out.println("\nMap\n" + clientesMap);

        System.out.print("\nCliente de ID 3 no MAP\n" + clientesMap.get(3L));

        //Não é possível reordenar o MAP pois quebrará o hash

    }
}
