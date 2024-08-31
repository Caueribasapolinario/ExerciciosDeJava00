package Exercicio9;

/*Defina uma classe Produto com atributos como nome, preco, e quantidadeEstoque. Adicione métodos para aumentar e diminuir o estoque.*/

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;


    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void tirarEstoque (int quantidade) {
        quantidadeEstoque = quantidadeEstoque - quantidade;
    }

    public void colocarEstoque (int quantidade) {
        quantidadeEstoque = quantidadeEstoque + quantidade;
    }
}
