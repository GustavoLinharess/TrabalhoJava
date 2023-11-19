package model;

public abstract class Stream {
    private String titulo;
    private String genero;
    private String criador;
    private int duracao;

    public Stream(String titulo, String genero, String criador, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.criador = criador;
        this.duracao = duracao;
    }

    // Getters e Setters...

    @Override
    public String toString() {
        return "Título: " + titulo + "\nGênero: " + genero + "\nCriador: " + criador + "\nDuração: " + duracao + " minutos";
    }
}
