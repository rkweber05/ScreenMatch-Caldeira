package br.com.alura.screenmatch.calculos;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println( numero + " * " + i + " = " + numero * i);
        }
    }
}
