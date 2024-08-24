package br.com.alura.screenmatch.modelos;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibeMensagens() {
        System.out.println(autor);
        System.out.println(titulo);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
