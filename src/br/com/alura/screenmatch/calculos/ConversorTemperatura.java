package br.com.alura.screenmatch.calculos;

public class ConversorTemperatura implements ConversorTemperaturaPadrao{
    @Override
    public double celsiusParaFahrenheit(double temperatura) {
        return (temperatura * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperatura) {
        return (temperatura - 32) / 1.8;
    }
}
