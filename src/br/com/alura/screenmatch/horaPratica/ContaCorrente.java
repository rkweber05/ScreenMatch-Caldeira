package br.com.alura.screenmatch.horaPratica;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal() {
        double tarifaMensal = 44.90;
        saldo -= tarifaMensal;
    }
}
