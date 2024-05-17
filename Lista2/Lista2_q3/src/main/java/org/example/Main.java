package org.example;

import org.example.loja.Produto;
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camisa do Vasco", 19.90, 10);

        produto.adicionar(5);
        produto.diminuir(3);

        produto.visualizarProduto();
    }



}