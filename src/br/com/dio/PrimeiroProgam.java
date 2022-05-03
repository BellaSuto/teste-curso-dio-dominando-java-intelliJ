package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgam {
    public static void main(String[] args) {

        Gato gato = new Gato("Nina", "amarelo", 07 );

        System.out.println(gato);

        Livro livro = new Livro("Rainha Vermelha",455 );
        System.out.println(livro);
    }

}

class Livro{
    private String nome;
    private int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

