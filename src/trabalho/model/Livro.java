package trabalho.model;

import java.util.Objects;

public class Livro implements IdEPreco {

    private int id = 0;
    private String titulo = "";
    private String autor = "";
    private String lancamento = "";
    private double preco = 0;

    @Override
    public int getID() {
        return id;
    }

    public Livro setID(int id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Livro setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Livro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public String getLancamento() {
        return lancamento;
    }

    public Livro setLancamento(String lancamento) {
        this.lancamento = lancamento;
        return this;
    }


    public double getPreco() {
        return preco;
    }

    public Livro setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return id == livro.id &&
                Double.compare(livro.preco, preco) == 0 &&
                Objects.equals(titulo, livro.titulo) &&
                Objects.equals(autor, livro.autor) &&
                Objects.equals(lancamento, livro.lancamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autor, lancamento, preco);
    }
}
