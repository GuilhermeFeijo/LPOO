package controller;

import model.Locacao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocacaoController {

    public static void main(String[] args){

        Locacao l1 = new Locacao();
        Locacao l2 = new Locacao(2, LocalDate.of(2022, 10, 25), LocalTime.of(15, 35), LocalDate.of(2022, 10, 30), LocalTime.of(8, 8), 380, 1250.00, 2500.00, true);
        Locacao l3 = new Locacao(3, LocalDate.of(2022, 1, 1), LocalTime.of(19, 35), LocalDate.of(2022, 1, 2), LocalTime.of(8, 45), 30, 350.00, 650.00, true);
        Locacao l4 = new Locacao(2, LocalDate.of(2022, 10, 25), LocalTime.of(15, 35), LocalDate.of(2022, 10, 30), LocalTime.of(8, 8), 380, 1250.00, 2500.00, true);
        Locacao l5 = new Locacao(5, LocalDate.of(2022, 3, 18), LocalTime.of(12, 23), LocalDate.of(2022, 3, 20), LocalTime.of(15, 00), 270, 950.00, 2000.00, true);


        System.out.println("\n\nCom Construtores padrões");
        System.out.println("\nLocacao 1: "+ l1);
        System.out.println("\nLocacao 2: "+ l2);
        System.out.println("\nLocacao 3: "+ l3);
        System.out.println("\nLocacao 4: "+ l4);
        System.out.println("\nLocacao 5: "+ l5);

        l1.setID(1);
        l1.setDataLocacao(LocalDate.of(2022,5,23));
        l1.setHoraLocacao(LocalTime.of(15,2));
        l1.setDataDevolucao(LocalDate.of(2022,5,29));
        l1.setHoraDevolucao(LocalTime.of(9, 15));
        l1.setQuilometragem(790);
        l1.setValorCalcao(2500.00);
        l1.setValorLocacao(1990.00);
        l1.setDevolvido(true);

        System.out.println("\n\nCom Getter");
        System.out.println("\nLocacao 1:\nData Locação: "+l1.getDataLocacao()+"\nHora de Locação: "+l1.getHoraLocacao()+"\nData Devolução: "+l1.getDataDevolucao()+"\nHora Devolução: "+l1.getHoraDevolucao()+"\nQuilometragem: "+l1.getQuilometragem()+"\nValor Calção: R$"+l1.getValorCalcao()+"\nValor Locação: R$"+l1.getValorLocacao()+"\nDevolvido? "+l1.isDevolvido());
        System.out.println("\nLocacao 2:\nData Locação: "+l2.getDataLocacao()+"\nHora de Locação: "+l2.getHoraLocacao()+"\nData Devolução: "+l2.getDataDevolucao()+"\nHora Devolução: "+l2.getHoraDevolucao()+"\nQuilometragem: "+l2.getQuilometragem()+"\nValor Calção: R$"+l2.getValorCalcao()+"\nValor Locação: R$"+l2.getValorLocacao()+"\nDevolvido? "+l2.isDevolvido());
        System.out.println("\nLocacao 3:\nData Locação: "+l3.getDataLocacao()+"\nHora de Locação: "+l3.getHoraLocacao()+"\nData Devolução: "+l3.getDataDevolucao()+"\nHora Devolução: "+l3.getHoraDevolucao()+"\nQuilometragem: "+l3.getQuilometragem()+"\nValor Calção: R$"+l3.getValorCalcao()+"\nValor Locação: R$"+l3.getValorLocacao()+"\nDevolvido? "+l3.isDevolvido());
        System.out.println("\nLocacao 4:\nData Locação: "+l4.getDataLocacao()+"\nHora de Locação: "+l4.getHoraLocacao()+"\nData Devolução: "+l4.getDataDevolucao()+"\nHora Devolução: "+l4.getHoraDevolucao()+"\nQuilometragem: "+l4.getQuilometragem()+"\nValor Calção: R$"+l4.getValorCalcao()+"\nValor Locação: R$"+l4.getValorLocacao()+"\nDevolvido? "+l4.isDevolvido());
        System.out.println("\nLocacao 5:\nData Locação: "+l5.getDataLocacao()+"\nHora de Locação: "+l5.getHoraLocacao()+"\nData Devolução: "+l5.getDataDevolucao()+"\nHora Devolução: "+l5.getHoraDevolucao()+"\nQuilometragem: "+l5.getQuilometragem()+"\nValor Calção: R$"+l5.getValorCalcao()+"\nValor Locação: R$"+l5.getValorLocacao()+"\nDevolvido? "+l5.isDevolvido());


        List<Locacao> locacoes = new ArrayList<>();
        locacoes.add(l1);
        locacoes.add(l2);
        locacoes.add(l3);
        locacoes.add(l4);
        locacoes.add(l5);

        Map<Integer, Locacao> locacaoMap = new HashMap<>();
        locacaoMap.put(l1.getID(),l1);
        locacaoMap.put(l2.getID(),l2);
        locacaoMap.put(l3.getID(),l3);
        locacaoMap.put(l4.getID(),l4);
        locacaoMap.put(l5.getID(),l5);
        System.out.println("\nImpressão utilizando MAP: "+locacaoMap+"\n");

        //Impressão de ID3
        Locacao locacaoFind = locacoes.stream().filter(a -> a.getID() == 3).findAny().orElse(null);
        System.out.println(locacaoFind+"\n");

    }

}
