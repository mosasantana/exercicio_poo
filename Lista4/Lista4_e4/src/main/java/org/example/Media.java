
package org.example;

import java.util.Scanner;

public class Media {
    private int codigo;
    private double preco;
    private String nome;

    public Media() {
        this.codigo = 0;
        this.preco = 0.0;
        this.nome = "";
    }

    public Media(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return "Mdia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
    }

    public void printDados() {
        System.out.println(getDetalhes());
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
