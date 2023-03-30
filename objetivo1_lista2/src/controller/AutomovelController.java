package controller;

import model.Automovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomovelController {

    public static void main(String[] args){

        Automovel a1 = new Automovel();
        Automovel a2 = new Automovel(2,"48583938548", "IOE4A34", "Branco", 17, "Flex", 75000, "3j5j4fi99315", 940.00);
        Automovel a3 = new Automovel(2,"48583938548", "IOE4A34", "Branco", 17, "Flex", 75000, "3j5j4fi99315", 940.00);
        Automovel a4 = new Automovel(3,"95917387481", "AOP0349", "Vermelho", 18, "Flex", 0, "41mlgekge99j24j42", 3500.00);
        Automovel a5 = new Automovel(4,"94849101184", "IEP9I23", "Branco", 13, "Flex", 145000, "9459l13m5n4", 390.00);

        System.out.println("\n\nCom Construtores padrões");
        System.out.println("\nAutomovel 1: "+ a1);
        System.out.println("\nAutomovel 2: "+ a2);
        System.out.println("\nAutomovel 2: "+ a3);
        System.out.println("\nAutomovel 2: "+ a4);
        System.out.println("\nAutomovel 2: "+ a5);

        a1.setID(1);
        a1.setRenavan("485918585");
        a1.setPlaca("POA3945");
        a1.setCor("Preto");
        a1.setRodas(15);
        a1.setQuilometragem(195000);
        a1.setChassi("49501JFJ94JK3");
        a1.setValor_locacao(350.00);
        a1.setCombustivel("Diesel");

        System.out.println("\n\nCom Getter");
        System.out.println("\nAutomovel 1:\nID: "+a1.getID()+"\nRenavan: "+a1.getRenavan()+"\nPlaca: "+a1.getPlaca()+"\nCor: "+a1.getCor()+"\nRodas: "+a1.getRodas()+"\nCombustível: "+a1.getCombustivel()+"\nQuilometragem: "+a1.getChassi()+"\nChassi: "+a1.getChassi()+"\nValor Locação: R$"+a1.getValor_locacao());
        System.out.println("\nAutomovel 2:\nID: "+a2.getID()+"\nRenavan: "+a2.getRenavan()+"\nPlaca: "+a2.getPlaca()+"\nCor: "+a2.getCor()+"\nRodas: "+a2.getRodas()+"\nCombustível: "+a2.getCombustivel()+"\nQuilometragem: "+a2.getChassi()+"\nChassi: "+a2.getChassi()+"\nValor Locação: R$"+a2.getValor_locacao());
        System.out.println("\nAutomovel 3:\nID: "+a3.getID()+"\nRenavan: "+a3.getRenavan()+"\nPlaca: "+a3.getPlaca()+"\nCor: "+a3.getCor()+"\nRodas: "+a3.getRodas()+"\nCombustível: "+a3.getCombustivel()+"\nQuilometragem: "+a3.getChassi()+"\nChassi: "+a3.getChassi()+"\nValor Locação: R$"+a3.getValor_locacao());
        System.out.println("\nAutomovel 4:\nID: "+a4.getID()+"\nRenavan: "+a4.getRenavan()+"\nPlaca: "+a4.getPlaca()+"\nCor: "+a4.getCor()+"\nRodas: "+a4.getRodas()+"\nCombustível: "+a4.getCombustivel()+"\nQuilometragem: "+a4.getChassi()+"\nChassi: "+a4.getChassi()+"\nValor Locação: R$"+a4.getValor_locacao());
        System.out.println("\nAutomovel 5:\nID: "+a5.getID()+"\nRenavan: "+a5.getRenavan()+"\nPlaca: "+a5.getPlaca()+"\nCor: "+a5.getCor()+"\nRodas: "+a5.getRodas()+"\nCombustível: "+a5.getCombustivel()+"\nQuilometragem: "+a5.getChassi()+"\nChassi: "+a5.getChassi()+"\nValor Locação: R$"+a5.getValor_locacao());

        List<Automovel> automoveis = new ArrayList<>();
        automoveis.add(a1);
        automoveis.add(a2);
        automoveis.add(a3);
        automoveis.add(a4);
        automoveis.add(a5);

        Map<Integer, Automovel> automovelMap = new HashMap<>();
        automovelMap.put(a1.getID(),a1);
        automovelMap.put(a2.getID(),a2);
        automovelMap.put(a3.getID(),a3);
        automovelMap.put(a4.getID(),a4);
        automovelMap.put(a5.getID(),a5);
        System.out.println("\nImpressão utilizando MAP: "+automovelMap+"\n");

        //Impressão de ID3
        Automovel automovelFind = automoveis.stream().filter(a -> a.getID() == 3).findAny().orElse(null);
        System.out.println(automovelFind+"\n");
    }
}
