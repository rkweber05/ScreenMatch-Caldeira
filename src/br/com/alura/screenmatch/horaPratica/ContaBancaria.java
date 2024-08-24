package br.com.alura.screenmatch.horaPratica;

public class ContaBancaria {

    protected double saldo;

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Valor maior que o saldo digite um valor menor de saque !");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor deve ser maior que 0");
        } else {
            saldo += valor;
        }
    }

    public void consultarSaldo () {
        System.out.println("Saldo = R$ " + saldo);
    }
}
