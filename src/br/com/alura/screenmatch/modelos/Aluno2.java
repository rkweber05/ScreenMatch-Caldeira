package br.com.alura.screenmatch.modelos;

import java.util.Scanner;

public class Aluno2 {
    private String nome;
    private double notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public void calcularMedia(double notas) {
        Scanner scanner = new Scanner(System.in);
        double media = 0.0;
        double soma = 0.0;

        for (int  i = 1; i <= 3; i++) {
            System.out.print("nota " + i + ": ");
            notas = scanner.nextDouble();
            soma += notas;
        }

        media = soma / 3;
        System.out.println("Media: " + media);
    }
}
