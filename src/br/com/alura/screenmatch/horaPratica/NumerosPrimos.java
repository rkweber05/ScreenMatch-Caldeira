package br.com.alura.screenmatch.horaPratica;

public class NumerosPrimos {

    private int numero;
    boolean ehPrimo = true;

    public void verificarPrimalidade(int numero) {
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
