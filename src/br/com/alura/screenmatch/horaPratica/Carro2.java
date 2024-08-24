package br.com.alura.screenmatch.horaPratica;

public class Carro2 {
    private String modeloCarroAno;
    private double precos;
    private int numeroPrecos;

    public String getModeloCarroAno() {
        return modeloCarroAno;
    }

    public void setModeloCarroAno(String modeloCarroAno) {
        this.modeloCarroAno = modeloCarroAno;
    }

    public void defineNomeModelo() {
        System.out.println("Nome modelo = " + modeloCarroAno);
    }

    public void precoMedio(double nota) {
        precos += nota;
        numeroPrecos++;
    }

    public double calculaMediaPrecos() {
        return precos / numeroPrecos;
    }
}
