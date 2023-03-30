package controller;
import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args){

        // 2 instâncias com construtor padrão
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        // 2 Instâncias com construtor parametrizado parcial
        Aluno a3 = new Aluno(3, "Cleber");
        Aluno a4 = new Aluno(4, "Guilherme");

        // 2 Instâncias com Construtor Parametrizado
        Aluno a5 = new Aluno(5, "384.395.105-10", "Pedro", "Pascal", "pedrinho@hotmail.com");
        Aluno a6 = new Aluno(6, "495.124.513.85", "Aline", "Lima", "alineee@gmail.com");


        ///////////////////////////////////////////////////////////


        //Questão 1.a
        System.out.println("Questão 1.a-");

        //Impressão com toString()
        System.out.println("Aluno 1: " + a1);
        System.out.println("Aluno 2: " + a2);
        System.out.println("Aluno 3: " + a3);
        System.out.println("Aluno 4: " + a4);
        System.out.println("Aluno 5: " + a5);
        System.out.println("Aluno 6: " + a6);


        //Organização da visualização
        System.out.println("\n-----------------------------------------------------\n");
        ///////////////////////////////////////////////////////////


        //Questão 1.b
        System.out.println("Questão 1.b-");

        //Modificando valores usando Setters
        //Aluno 1
        a1.setId(1);
        a1.setCpf("394.495.184-04");
        a1.setNome("Marcos");
        a1.setSobrenome("Maia");
        a1.setEmail("marquinhos@gmail.com");

        //Aluno 2
        a2.setId(2);
        a2.setCpf("948.123.321-11");
        a2.setNome("Gabrielle");
        a2.setSobrenome("Costa");
        a2.setEmail("gabii.costa@outlook.com");


        //Lendo os valores usando Getters
        System.out.println("Aluno 1: ID="+a1.getId()+" CPF="+a1.getCpf()+" Nome Completo= "+a1.getNome()+" "+a1.getSobrenome()+" E-mail= "+a1.getEmail());
        System.out.println("Aluno 2: ID="+a2.getId()+" CPF="+a2.getCpf()+" Nome Completo= "+a2.getNome()+" "+a2.getSobrenome()+" E-mail= "+a2.getEmail());


        //Organização da visualização
        System.out.println("\n-----------------------------------------------------\n");
        ///////////////////////////////////////////////////////////


        //Questão 2
        System.out.println("Questão 2");

        //Atribuição dos objetos no Array contas método List
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);
        alunos.add(a6);

        //Atribuição do metodo Map
        Map<Integer, Aluno> alunoMap = new HashMap<>();
        alunoMap.put(a1.getId(), a1);
        alunoMap.put(a2.getId(),a2);
        alunoMap.put(a3.getId(),a3);
        alunoMap.put(a4.getId(),a4);
        alunoMap.put(a5.getId(),a5);
        alunoMap.put(a6.getId(),a6);
        System.out.println("Impressão utilizando MAP: "+alunoMap+"\n");

        //Lista Organizada em ordem crescente
        System.out.println("Lista em ordem Crescente");
        alunos.sort(Comparator.comparing(Aluno::getId));
        System.out.println("Lista em Ordem Crescente: "+alunos+"\n");

        //Impressão do ID 5
        System.out.println("Impressão do ID=5");
        /*System.out.println(
                alunos.get(
                        Collections.binarySearch(
                                alunos,
                                new Aluno(5),
                                Comparator.comparing(Aluno::getId)
                        )
                )
        );*/

        //Pesquisa de forma Funcional
        Aluno AlunoFind = alunos.stream().filter(a -> a.getId() == 5).findAny().orElse(null);
        System.out.println(AlunoFind+"\n");

        //Lista Ordenada em Ordem Decrescente
        System.out.println("Lista em Ordem Decrescente");
        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunos);
        System.out.println();

    }


}
