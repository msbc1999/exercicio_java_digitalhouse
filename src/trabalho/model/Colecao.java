package trabalho.model;

import java.util.Objects;

public class Colecao implements IdEPreco {

    private int id = 0;
    private double preco = 0;
    private String descricao = "";
    private Livro[] livros = new Livro[0];

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    public Colecao setID(int id) {
        this.id = id;
        return this;
    }

    public Colecao setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public Colecao setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public Colecao setLivros(Livro... livros) {
        this.livros = livros;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colecao colecao = (Colecao) o;
        return id == colecao.id &&
                Double.compare(colecao.preco, preco) == 0 &&
                Objects.equals(descricao, colecao.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preco, descricao);
    }
}
