public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int numAvaliacoes;
    double avaliacao;

    void exibirFichaTecnica() {
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println(numAvaliacoes);
        System.out.println(avaliacao);
    }

    void avaliaMusica (double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao() {
        return  avaliacao / numAvaliacoes;
    }
}
