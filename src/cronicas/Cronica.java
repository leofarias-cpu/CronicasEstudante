package cronicas;

import java.util.Objects;

public class Cronica {
    private int posicao;
    private String titulo;
    private String texto;
    private String autor;
    private String dataCriacao;
    private int qtdLeituras;

    public Cronica(int posicao, String titulo, String dataCriacao, String autor, String texto) {
        this.posicao = posicao;
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
        this.autor = autor;
        this.texto = texto;
        this.qtdLeituras = 0;
    }
    public Cronica(int posicao, String titulo, String dataCriacao, String texto) {
        this.posicao = posicao;
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
        this.autor = "Anônimo";
        this.texto = texto;
    }

    @Override
    public String toString(){
        return "Cronica #" + this.posicao + "\n" + this.titulo + "\n" + this.dataCriacao + "\n" + this.autor + "\n" + this.texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cronica cronica = (Cronica) o;
        return Objects.equals(titulo, cronica.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }

    public int getQtdLeituras() {
        return qtdLeituras;
    }
    public String ler(){
        this.qtdLeituras++;
        return this.toString();
    }
}
