package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {

        //Cada instância deve ser criada, no mínimo, de duas formas diferentes,
        //uma com o construtor padrão da classe, outra com um construtor parametrizado que
        //receba como argumento todos os atributos contidos na classe
        Produto produto1 = new Produto();
        Produto produto2 = new Produto(2, "Mouse", "Aponta as coisas na tela", 40.00,100);


        //Depois de instanciados os objetos, imprima-os utilizando o comportamento toString() da própria classe.
        System.out.println("Impressão utilizando toString()");
        System.out.println(produto1);
        System.out.println(produto2);


        //Após essa impressão, utilize os métodos setters para alterar o estado do objeto na memória RAM
        produto1.setId(1);
        produto1.setNome("Teclado");
        produto1.setDescricao("Digita as teclas");
        produto1.setValor(40.00);
        produto1.setEstoque(200);

        produto2.setId(2);
        produto2.setNome("Monitor");
        produto2.setDescricao("Mostra a tela");
        produto2.setValor(400.00);
        produto2.setEstoque(20);


        //imprima esses objetos novamente, agora utilizando os getters de cada classe.
        System.out.println("\nProduto1:");
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());


        System.out.println("\nProduto2:");
        System.out.println(produto2.getId());
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());


        //Nos controladores criados no exercício 1 adicione dois tipos de coleções de
        //objetos, List e Map

        Produto produto3 = new Produto(3, "Notebook", "Um computador portátil", 3500.00, 10);
        Produto produto4 = new Produto(4, "Computador", "Um Desktop", 2500.00, 25);
        Produto produto5 = new Produto(4, "Computador", "Um Desktop", 2500.00, 25);
        List<Produto> produtosList = new ArrayList<>();
        produtosList.add(produto1);
        produtosList.add(produto2);
        produtosList.add(produto3);
        produtosList.add(produto4);
        produtosList.add(produto5);
        // Imprima os objetos contidos em cada coleção
        System.out.println("\nList\n" + produtosList);

        // e o objeto de id=3 de cada coleção
        for(Produto produto : produtosList){
            if(produto.getId() == 3){
                System.out.print("\n Produto de id 3 no List\n" + produto + "\n");
            }
        }

        produtosList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println("\nOrdenando de forma decrescente\n" + produtosList);


        Map<Integer, Produto> produtosMap = new HashMap<>();
        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        produtosMap.put(produto5.getId(), produto5);
        System.out.println("\nMap\n" + produtosMap);

        System.out.print("\nProduto de ID 3 no MAP\n" + produtosMap.get(3));

        //Não é possível reordenar o MAP pois quebrará o hash

    }
}
