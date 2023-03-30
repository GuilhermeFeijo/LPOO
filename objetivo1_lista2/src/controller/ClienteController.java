package controller;

import model.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteController {
    public static void main(String[] args){

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente(2, "403.304.495-10", "Victor", "Barbosa", "Rua XV de Setembro, Pelotas - RS", "96050-030", "(53)99149-8472", "victor.barbosa@gmail.com");
        Cliente c3 = new Cliente(3, "030.304.304-19", "Jéssica", "Silva", "AV. Duque de Caxias, Pelotas - RS", "96050-040", "(53)99903-9409", "jessicaaa@gmail.com");
        Cliente c4 = new Cliente(4, "307.394.093-07", "Victória", "Barroso", "Rua Barão de Santa Tecla , Pelotas - RS", "96050-050", "(53)99119-0394", "victoria.a.barroso@outlook.com");
        Cliente c5 = new Cliente(2, "403.304.495-10", "Victor", "Barbosa", "Rua XV de Setembro, Pelotas - RS", "96050-030", "(53)99149-8472", "victor.barbosa@gmail.com");

        System.out.println("\n\nCom Construtores padrões");
        System.out.println("\nCliente 1: "+ c1);
        System.out.println("\nCliente 2: "+ c2);
        System.out.println("\nCliente 2: "+ c2);
        System.out.println("\nCliente 2: "+ c2);
        System.out.println("\nCliente 2: "+ c2);

        c1.setID(1);
        c1.setCpf("036.794.520-71");
        c1.setNome("Denise");
        c1.setSobrenome("Abrahão");
        c1.setEndereco("Travessa 1 João Batista Gomes, Capão do Leão - RS");
        c1.setCep("96160-000");
        c1.setTelefone("(53)98112-6620");
        c1.setEmail("deniseac0@gmail.com");

        System.out.println("\n\nCom Getter");
        System.out.println("\nCliente 1" +
                "\nID: "+c1.getID()+
                "\nCPF: "+c1.getCpf()+
                "\nNome: "+c1.getNome()+
                "\nSobrenome: "+c1.getSobrenome()+
                "\nEndereco: "+c1.getEndereco()+
                "\nCEP: "+c1.getCep()+
                "\nTelefone: "+c1.getTelefone()+
                "\nE-mail: "+c1.getEmail());

        System.out.println("\nCliente 2" +
                "\nID: "+c2.getID()+
                "\nCPF: "+c2.getCpf()+
                "\nNome: "+c2.getNome()+
                "\nSobrenome: "+c2.getSobrenome()+
                "\nEndereco: "+c2.getEndereco()+
                "\nCEP: "+c2.getCep()+
                "\nTelefone: "+c2.getTelefone()+
                "\nE-mail: "+c2.getEmail());

        System.out.println("\nCliente 3" +
                "\nID: "+c3.getID()+
                "\nCPF: "+c3.getCpf()+
                "\nNome: "+c3.getNome()+
                "\nSobrenome: "+c3.getSobrenome()+
                "\nEndereco: "+c3.getEndereco()+
                "\nCEP: "+c3.getCep()+
                "\nTelefone: "+c3.getTelefone()+
                "\nE-mail: "+c3.getEmail());

        System.out.println("\nCliente 4" +
                "\nID: "+c4.getID()+
                "\nCPF: "+c4.getCpf()+
                "\nNome: "+c4.getNome()+
                "\nSobrenome: "+c4.getSobrenome()+
                "\nEndereco: "+c4.getEndereco()+
                "\nCEP: "+c4.getCep()+
                "\nTelefone: "+c4.getTelefone()+
                "\nE-mail: "+c4.getEmail());

        System.out.println("\nCliente 5" +
                "\nID: "+c5.getID()+
                "\nCPF: "+c5.getCpf()+
                "\nNome: "+c5.getNome()+
                "\nSobrenome: "+c5.getSobrenome()+
                "\nEndereco: "+c5.getEndereco()+
                "\nCEP: "+c5.getCep()+
                "\nTelefone: "+c5.getTelefone()+
                "\nE-mail: "+c5.getEmail());



        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);

        Map<Integer, Cliente> clienteMap = new HashMap<>();
        clienteMap.put(c1.getID(),c1);
        clienteMap.put(c2.getID(),c2);
        clienteMap.put(c3.getID(),c3);
        clienteMap.put(c4.getID(),c4);
        clienteMap.put(c5.getID(),c5);
        System.out.println("\nImpressão utilizando MAP: "+clienteMap+"\n");

        //Impressão de ID3
        Cliente clienteFind = clientes.stream().filter(a -> a.getID() == 3).findAny().orElse(null);
        System.out.println(clienteFind+"\n");


    }
}
