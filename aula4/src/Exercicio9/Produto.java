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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            System.out.println("Com grandes poderes vem grandes responsabilidades");
        }

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        }else{
            System.out.println("Com grandes poderes vem grandes responsabilidades");
        }

    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void tirarEstoque (int quantidade) {
        quantidadeEstoque = quantidadeEstoque - quantidade;
    }

    public void colocarEstoque (int quantidade) {
        quantidadeEstoque = quantidadeEstoque + quantidade;
    }
}
