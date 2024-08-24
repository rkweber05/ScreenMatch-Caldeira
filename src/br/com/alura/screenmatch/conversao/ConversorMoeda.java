package br.com.alura.screenmatch.conversao;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 4.25;
    }
}
