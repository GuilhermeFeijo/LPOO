package controller;

import model.Produto;
import java.util.*;

public class ProdutoController {

    public static void main(String[] args){

        //Instância da classe Produto (ou um objeto)
        Produto produto1 = new Produto("Mouse", "Move o Ponteiro do Computador", 49.90, 30);

        //Impressão dos valores
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());


        //Instância da classe Produto (ou um objeto)
        Produto produto2 = new Produto("Garrafa", "Um objeto feito de Plastico", 1.50,50);

        //Impressão dos valores
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());


        //List
        Produto produto3 = new Produto("Caneca", "Onde se toma café", 9.90, 2);
        Produto produto4 = new Produto("Notebook", "Um computador portátil", 2500, 1);
        Produto produto5 = new Produto("Notebook", "Um computador portátil", 2499, 1);

        //Atribuição dos objetos no Array produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        //Impressão da Lista na ordem de cadastro
        System.out.println("Lista");
        System.out.println(produtos);
        System.out.println();

        //Lista Organizada em ordem alfabética
        System.out.println("Lista em ordem Alfabética");
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println(produtos);
        System.out.println();

        //Lista em ordem Alfabética Invertida
        System.out.println("Lista em Ordem Alfabética invertido");
        produtos.sort(Comparator.comparing(Produto::getNome).reversed());
        System.out.println(produtos);
        System.out.println();

        System.out.println("MAP");
        Map<String, Produto> produtoMap = new HashMap<>();
        produtoMap.put(produto1.getNome(), produto1);//Mouse
        produtoMap.put(produto2.getNome(),produto2);//Garrafa
        produtoMap.put(produto3.getNome(),produto3);//Caneca
        produtoMap.put(produto4.getNome(),produto4);//Notebook
        produtoMap.put(produto5.getNome(),produto5);//Notebook
        System.out.println(produtoMap);
    }
}


