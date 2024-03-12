package controller;

import model.Locacao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class LocacaoController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Locacao locacao1 = new Locacao();
        Locacao locacao2 = new Locacao(2L, LocalDate.of(2024,3,3), LocalTime.of(12,30), LocalDate.of(2024,3,5), LocalTime.of(17,30), 340, 1000.00, 2500.00, true);


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(locacao1);
        System.out.println(locacao2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        locacao2.setId(2L);
        locacao2.setDataLocacao(LocalDate.of(2024,3,2));
        locacao2.setHoraLocacao(LocalTime.of(8,15));
        locacao2.setDataDevolucao(LocalDate.of(2024,3,5));
        locacao2.setHoraDevolucao(LocalTime.of(17,30));
        locacao2.setQuilometragem(230);
        locacao2.setValorCalcao(1300.00);
        locacao2.setValor_locacao(2900.00);
        locacao2.setDevolvido(true);

        locacao1.setId(1L);
        locacao1.setDataLocacao(LocalDate.of(2024,3,12));
        locacao1.setHoraLocacao(LocalTime.of(13,0));
        locacao1.setValorCalcao(900);
        locacao1.setDevolvido(false);


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nLocacao1:");
        System.out.println(locacao1.getId());
        System.out.println(locacao1.getDataLocacao());
        System.out.println(locacao1.getHoraLocacao());
        System.out.println(locacao1.getDataDevolucao());
        System.out.println(locacao1.getHoraDevolucao());
        System.out.println(locacao1.getQuilometragem());
        System.out.println(locacao1.getValorCalcao());
        System.out.println(locacao1.getValor_locacao());
        System.out.println(locacao1.isDevolvido());


        System.out.println("\nLocacao2:");
        System.out.println(locacao2.getId());
        System.out.println(locacao2.getDataLocacao());
        System.out.println(locacao2.getHoraLocacao());
        System.out.println(locacao2.getDataDevolucao());
        System.out.println(locacao2.getHoraDevolucao());
        System.out.println(locacao2.getQuilometragem());
        System.out.println(locacao2.getValorCalcao());
        System.out.println(locacao2.getValor_locacao());
        System.out.println(locacao2.isDevolvido());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Locacao locacao3 = new Locacao(3L, LocalDate.of(2024,3,5), LocalTime.of(14,30), LocalDate.of(2024,3,6), LocalTime.of(17,30), 60, 500, 500, true);
        Locacao locacao4 = new Locacao(3L, LocalDate.of(2024,3,5), LocalTime.of(14,30), LocalDate.of(2024,3,6), LocalTime.of(17,30), 60, 500, 500, true);
        Locacao locacao5 = new Locacao(4L, LocalDate.of(2024,2,22), LocalTime.of(10,45), LocalDate.of(2024,2,29), LocalTime.of(11,15), 800, 1000, 4500, true);
        List<Locacao> locacaosList = new ArrayList<>();
        locacaosList.add(locacao1);
        locacaosList.add(locacao2);
        locacaosList.add(locacao3);
        locacaosList.add(locacao4);
        locacaosList.add(locacao5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + locacaosList);

        // e o objeto de id=3 de cada coleção
        locacaosList.forEach(locacao -> {
            if(locacao.getId() == 3){
                System.out.print("\n Locacao de id 3 no List\n" + locacao + "\n");
            }
        });

        locacaosList.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + locacaosList);


        Map<Long, Locacao> locacoesMap = new HashMap<>();
        locacoesMap.put(locacao1.getId(), locacao1);
        locacoesMap.put(locacao2.getId(), locacao2);
        locacoesMap.put(locacao3.getId(), locacao3);
        locacoesMap.put(locacao4.getId(), locacao4);
        locacoesMap.put(locacao5.getId(), locacao5);
        System.out.println("\nMap\n" + locacoesMap);

        System.out.print("\nLocacao de ID 3 no MAP\n" + locacoesMap.get(3L));

        //Não é possível reordenar o MAP pois quebrará o hash

    }
}
