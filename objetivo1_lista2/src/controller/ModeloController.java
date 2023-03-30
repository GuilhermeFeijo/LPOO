package controller;

import model.Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModeloController {

    public static void main(String[] args){

        Modelo m1 = new Modelo();
        Modelo m2 = new Modelo(2, "Fit");
        Modelo m3 = new Modelo(3, "Camaro");
        Modelo m4 = new Modelo(4, "Civic");
        Modelo m5 = new Modelo(2, "Fit");

        System.out.println("\n\nCom Construtores padrões");
        System.out.println("\nModelo 1: "+ m1);
        System.out.println("\nModelo 2: "+ m2);
        System.out.println("\nModelo 3: "+ m3);
        System.out.println("\nModelo 4: "+ m4);
        System.out.println("\nModelo 5: "+ m5);

        m1.setID(1);
        m1.setDescricao("Argo");

        System.out.println("\n\nCom Getter");
        System.out.println("\nModelo 1: \nID: "+m1.getID()+"\nDescrição: "+m1.getDescricao());
        System.out.println("\nModelo 2: \nID: "+m2.getID()+"\nDescrição: "+m2.getDescricao());
        System.out.println("\nModelo 3: \nID: "+m3.getID()+"\nDescrição: "+m3.getDescricao());
        System.out.println("\nModelo 4: \nID: "+m4.getID()+"\nDescrição: "+m4.getDescricao());
        System.out.println("\nModelo 5: \nID: "+m5.getID()+"\nDescrição: "+m5.getDescricao());



        List<Modelo> modelos = new ArrayList<>();
        modelos.add(m1);
        modelos.add(m2);
        modelos.add(m3);
        modelos.add(m4);
        modelos.add(m5);

        Map<Integer, Modelo> modeloMap = new HashMap<>();
        modeloMap.put(m1.getID(),m1);
        modeloMap.put(m2.getID(),m2);
        modeloMap.put(m3.getID(),m3);
        modeloMap.put(m4.getID(),m4);
        modeloMap.put(m5.getID(),m5);
        System.out.println("\nImpressão utilizando MAP: "+modeloMap+"\n");

        //Impressão de ID3
        Modelo modeloFind = modelos.stream().filter(a -> a.getID() == 3).findAny().orElse(null);
        System.out.println(modeloFind+"\n");


    }

}
