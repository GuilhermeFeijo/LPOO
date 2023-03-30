package controller;

import model.Marca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarcaController {

    public static void main(String[] args){

        Marca m1 = new Marca();
        Marca m2 = new Marca(2,"Honda");
        Marca m3 = new Marca(3,"VolksWagen");
        Marca m4 = new Marca(2,"Honda");
        Marca m5 = new Marca(5,"Chevrolet");

        System.out.println("\n\nCom Construtores padrões");
        System.out.println("\nMarca 1: "+ m1);
        System.out.println("\nMarca 2: "+ m2);
        System.out.println("\nMarca 3: "+ m3);
        System.out.println("\nMarca 4: "+ m4);
        System.out.println("\nMarca 5: "+ m5);

        m1.setID(1);
        m1.setDescricao("Fiat");

        System.out.println("\n\nCom Getter");
        System.out.println("\nMarca 1: \nID:"+m1.getID()+"\nDescrição: "+m1.getDescricao());
        System.out.println("\nMarca 2: \nID:"+m2.getID()+"\nDescrição: "+m2.getDescricao());
        System.out.println("\nMarca 3: \nID:"+m3.getID()+"\nDescrição: "+m3.getDescricao());
        System.out.println("\nMarca 4: \nID:"+m4.getID()+"\nDescrição: "+m4.getDescricao());
        System.out.println("\nMarca 5: \nID:"+m5.getID()+"\nDescrição: "+m5.getDescricao());


        List<Marca> marcas = new ArrayList<>();
        marcas.add(m1);
        marcas.add(m2);
        marcas.add(m3);
        marcas.add(m4);
        marcas.add(m5);

        Map<Integer, Marca> marcaMap = new HashMap<>();
        marcaMap.put(m1.getID(),m1);
        marcaMap.put(m2.getID(),m2);
        marcaMap.put(m3.getID(),m3);
        marcaMap.put(m4.getID(),m4);
        marcaMap.put(m5.getID(),m5);
        System.out.println("\nImpressão utilizando MAP: "+marcaMap+"\n");

        //Impressão de ID3
        Marca marcaFind = marcas.stream().filter(a -> a.getID() == 3).findAny().orElse(null);
        System.out.println(marcaFind+"\n");
    }

}
