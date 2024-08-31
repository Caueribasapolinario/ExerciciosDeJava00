package Exercicio11;

/*11 - Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.*/

public class Cidade {
    private String nome;
    private String estado;
    private int populacao;


    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    void aumentarPopulacao(int quantidade ) {
        this.populacao += quantidade;
    }

    void diminuirPopulacao(int quantidade ) {
        this.populacao -= quantidade;
    }
}
