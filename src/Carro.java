public class Carro {
    String modelo;
    String cor;
    int idade;
    int ano;

    void exibeFicha() {
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(ano);
        System.out.println(idade);
    }

    int calculaIdade() {
        return 2024 - ano;
    }
}
