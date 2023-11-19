package model;

public class Serie {
    private String nome;
    private String genero;

    public Serie(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}