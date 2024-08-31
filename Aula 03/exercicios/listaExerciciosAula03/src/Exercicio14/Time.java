package Exercicio14;

/*Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores. Adicione métodos para adicionar e remover jogadores.*/

public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    void adicionarJogador(int quantidade) {
        this.numeroDeJogadores += quantidade;

    }
    void removerJogador(int quantidade) {
        this.numeroDeJogadores -= quantidade;
    }
}
