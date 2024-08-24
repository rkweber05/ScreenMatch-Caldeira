import br.com.alura.screenmatch.calculos.*;
import br.com.alura.screenmatch.conversao.ConversorMoeda;
import br.com.alura.screenmatch.horaPratica.*;
import br.com.alura.screenmatch.horaPratica.ContaBancaria;
import br.com.alura.screenmatch.modelos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConversorTemperatura temperatura = new ConversorTemperatura();
        double f = 40;
        double c = 37;

        System.out.println(temperatura.celsiusParaFahrenheit(c));
        System.out.println(temperatura.fahrenheitParaCelsius(f));


//        TabuadaMultiplicacao multiplicacao = new TabuadaMultiplicacao();
//        System.out.print("Qual numero deseja saber a tabuada? ");
//        int numero = sc.nextInt();
//
//        multiplicacao.mostrarTabuada(numero);

//        ConversorMoeda conversorMoeda = new ConversorMoeda();
//        double reais = 25;
//        System.out.println("Convertido R$ " + reais + " para dolar = $ " + conversorMoeda.converterDolarParaReal(reais));
//
//        CalculadoraSalaRetangular salaRetangular = new CalculadoraSalaRetangular();
//        double altura = 12;
//        double largura = 10;
//
//        System.out.println("Calculo área = " + salaRetangular.calcularArea(altura, largura));
//        System.out.println("Calculo perimetro = " + salaRetangular.calcularPerimetro(altura, largura));
//        Carro2 carro2 = new Carro2();
//        carro2.setModeloCarroAno("Duster");
//        carro2.defineNomeModelo();
//
//        carro2.precoMedio(10);
//        carro2.precoMedio(15);
//        carro2.precoMedio(2);
//
//        System.out.println("Media preços = R$ " + carro2.calculaMediaPrecos());
//
//        ModeloCarro modeloCarro = new ModeloCarro();
//        modeloCarro.setModeloCarroAno("HB20");
//        modeloCarro.precoMedio(10);
//        modeloCarro.precoMedio(20);
//        modeloCarro.precoMedio(40);
//
//        System.out.printf("Modelo carro 2, preço médio = R$ " + String.format("%.2f", modeloCarro.calculaMediaPrecos()) + "\n");
//        modeloCarro.mostrarInformacoes();
//
//        System.out.println("\n\n");
//
//        Gato gato = new Gato();
//        gato.emitirSom();
//        gato.arranharMoveis();
//        System.out.println();
//        Cachorro cachorro = new Cachorro();
//        cachorro.emitirSom();
//        cachorro.abanar();
//
//        System.out.println("---------------------------");
//        ContaBancaria contaBancaria = new ContaBancaria();
//        contaBancaria.depositar(1000);
//        contaBancaria.consultarSaldo();
//
//        ContaCorrente contaCorrente = new ContaCorrente();
//        contaCorrente.depositar(200);
//        contaCorrente.cobrarTarifaMensal();
//        contaCorrente.consultarSaldo();
//        contaCorrente.sacar(150);
//        contaCorrente.consultarSaldo();
//
//        double n1 = 50.55;
//        int n2 = 10;
//
//        int castingInt = (int) n1;
//        double castingDouble = (double) n2;
//
//        System.out.println( "Casting 1 " + castingInt);
//        System.out.println( "Casting 2 " + castingDouble);
//
//
//
//
//        Filme meuFilme = new Filme();
//        meuFilme.setAnoDeLancamento(1970);
//        meuFilme.setDuracaoEmMinutos(180);
//        System.out.println("Duração filme: " + meuFilme.getDuracaoEmMinutos());
//
//        meuFilme.exibeFichaTecnica();
//        meuFilme.avalia(8);
//        meuFilme.avalia(5);
//        meuFilme.avalia(10);
//
//        System.out.println("Total avaliações: " + meuFilme.getTotalAvaliacao());
//        System.out.println(meuFilme.mediaDasAvaliacoes());
//
//        Serie serie = new Serie();
//        serie.setNome("Lost");
//        serie.setAnoDeLancamento(2000);
//        serie.exibeFichaTecnica();
//        serie.setTemporadas(10);
//        serie.setEpisodiosPorTemporada(50);
//        serie.setMinutosPorEpisodio(10);
//        System.out.println("Duração serie = " + serie.getDuracaoEmMinutos());
//
//        Filme meuOutroFilme = new Filme();
//        meuOutroFilme.setAnoDeLancamento(1970);
//        meuOutroFilme.setDuracaoEmMinutos(180);
//
//        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
//        filtroRecomendacao.filtra(meuFilme);
//
//        Episodio episodio = new Episodio();
//        episodio.setNumero(1);
//        episodio.setNome("Lost2");
//        episodio.setTotalVizualizacoes(300);
//        filtroRecomendacao.filtra(episodio);

//        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
//        calculadoraDeTempo.inclui(meuFilme);
//        calculadoraDeTempo.inclui(meuOutroFilme);
//        calculadoraDeTempo.inclui(serie);
//        System.out.println(calculadoraDeTempo.getTempoTotal());
//
//
//        IdadePessoa idadePessoa = new IdadePessoa();
//        idadePessoa.setNome("Rodrigo");
//        idadePessoa.setIdade(17);
//        idadePessoa.validaidade(idadePessoa.getIdade());
//
//        Produto produto = new Produto();
//        produto.setNome("Jose");
//        produto.setPreco(200);
//        produto.aplicarDesconto(produto.getPreco());
//
//        Aluno2 aluno = new Aluno2();
//        aluno.calcularMedia(aluno.getNotas());
//
//        Livro livro = new Livro();
//        livro.setAutor("Rodrigo");
//        livro.setTitulo("Programação");
//        livro.exibeMensagens();
//
//        Filme filme = new Filme();
//        filme.setNome( "O Poderoso Chefão");
//        filme.setAnoDeLancamento(2024);
//        filme.setDuracaoEmMinutos(180);
//        filme.setIncluidoNoPlano(true);
//
//        filme.exibeFichaTecnica();
//        filme.avalia(8);
//        filme.avalia(10);
//        filme.avalia(5);
//
//        System.out.println(filme.getTotalAvaliacao());
//        System.out.println(filme.mediaDasAvaliacoes());
//
//        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Rodrigo Kunzler Weber";
//        pessoa.idade = 19;
//
//        pessoa.exebiMensagem();
//        System.out.println(pessoa.dobreNumero());
//
//        Musica musica = new Musica();
//        musica.titulo = "Wirth Industria Calçados LTDA";
//        musica.artista = "Rodrigo K Weber";
//        musica.anoLancamento = 2024;
//
//        musica.avaliaMusica(8);
//        musica.avaliaMusica(5);
//        musica.avaliaMusica(10);
//
//        System.out.println(musica.titulo);
//        System.out.println(musica.artista);
//        System.out.println(musica.anoLancamento);
//        System.out.println(musica.avaliacao);
//        System.out.println(musica.mediaAvaliacao());
//
//        Carro carro = new Carro();
//        carro.modelo = "Ferrari";
//        carro.ano = 2018;
//        carro.cor = "Azul";
//        carro.idade = 18;
//
//        carro.exibeFicha();
//        System.out.println(carro.calculaIdade());
//
//        Aluno aluno = new Aluno();
//        aluno.nome = "Jose";
//        aluno.idade = 18;
//
//        aluno.exibeAluno();
//
//        Aluno aluno2 = new Aluno();
//        aluno2.nome = "Carlos";
//        aluno2.idade = 29;
//
//        aluno2.exibeAluno();
    }
}