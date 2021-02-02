package trabalho;

import trabalho.model.Colecao;
import trabalho.model.Livraria;
import trabalho.model.Livro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int id = 0;

        Livraria livraria = new Livraria();

        ArrayList<Livro> c = new ArrayList<>();

        c.add((Livro) livraria.cadastrarItem(criarLivro(id++, "2020", 123)));
        c.add((Livro) livraria.cadastrarItem(criarLivro(id++, "2021", 456)));
        c.add((Livro) livraria.cadastrarItem(criarLivro(id++, "2022", 789)));
        c.add((Livro) livraria.cadastrarItem(criarLivro(id++, "2023", 101010)));


        livraria.cadastrarItem(criarColecao(id++, 987, c.toArray(new Livro[0])));

        for (int i = 0; i < id; i++) {
            livraria.setEstoque(i, i * 2);
        }

        // ITEM NORMAL
        try {
            livraria.venderItem(3, 1);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // ITEM NAO EXISTE
        try {
            livraria.venderItem(10000, 1);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // ITEM SEM ESTOQUE
        try {
            livraria.venderItem(0, 1);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }


    private static Livro criarLivro(int id, String lancamento, double preco) {
        return new Livro().setID(id).setAutor("Autor do livro " + id).setLancamento(lancamento).setPreco(preco).setTitulo("Titulo do livro " + id);
    }

    private static Colecao criarColecao(int id, double preco, Livro... livros) {
        return new Colecao().setID(id).setDescricao("Descricao da colecao " + id).setPreco(preco).setLivros(livros);
    }
}
