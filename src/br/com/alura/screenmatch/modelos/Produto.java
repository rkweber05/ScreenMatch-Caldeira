package br.com.alura.screenmatch.modelos;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double precoOriginal) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto será descontado do produto ? ");
        double percentual = sc.nextDouble();

        double precoFinal = precoOriginal - (precoOriginal * (percentual / 100));

        System.out.println(precoFinal);
    }
}
