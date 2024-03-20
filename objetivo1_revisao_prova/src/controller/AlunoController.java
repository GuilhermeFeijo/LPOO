package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args){
        //1-a
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno(3, "Jorge");
        Aluno a4 = new Aluno(4, "Rita");
        Aluno a5 = new Aluno(5, 123678910, "Beto", "Silva", "bebeto@gmail.com");
        Aluno a6 = new Aluno(6, 94716561, "Fernando", "Medeiros", "femedeiros@gmail.com");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        //1-b
        a1.setId(1);
        a1.setCpf(1485717839);
        a1.setNome("Patrícia");
        a1.setSobrenome("Fagundes");
        a1.setEmail("patfagundes@gmail.com");

        a2.setId(2);
        a2.setCpf(484571745);
        a2.setNome("Aline");
        a2.setSobrenome("Borges");
        a2.setEmail("aborges@gmail.com");

        System.out.println(a1.getId());
        System.out.println(a1.getCpf());
        System.out.println(a1.getNome());
        System.out.println(a1.getSobrenome());
        System.out.println(a1.getEmail());

        System.out.println(a2.getId());
        System.out.println(a2.getCpf());
        System.out.println(a2.getNome());
        System.out.println(a2.getSobrenome());
        System.out.println(a2.getEmail());

        //2
        List<Aluno> alunosList = new ArrayList<>();
        alunosList.add(a1);
        alunosList.add(a2);
        alunosList.add(a3);
        alunosList.add(a4);
        alunosList.add(a5);
        alunosList.add(a6);

        System.out.println(alunosList);

        alunosList.forEach(aluno ->{
            if (aluno.getId() == 5){
                System.out.println(aluno);
            }
        });

        alunosList.sort(Comparator.comparing(Aluno::getId).reversed());

        System.out.println(alunosList);

        Map<Integer, Aluno>alunoMap = new HashMap<>();
        alunoMap.put(a1.getId(), a1);
        alunoMap.put(a2.getId(), a2);
        alunoMap.put(a3.getId(), a3);
        alunoMap.put(a4.getId(), a4);
        alunoMap.put(a5.getId(), a5);
        alunoMap.put(a6.getId(), a6);

        System.out.println(alunoMap);

        System.out.println(alunoMap.get(5));
    }
}
