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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else {
            System.out.println("Erro: Nome vazio");
        }

    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        if (tecnico != null && !tecnico.isEmpty()) {
            this.tecnico = tecnico;
        }else{
            System.out.println("Erro: Tecnico vazio");
        }

    }

    void adicionarJogador(int quantidade) {
        this.numeroDeJogadores += quantidade;

    }
    void removerJogador(int quantidade) {
        this.numeroDeJogadores -= quantidade;
    }
}
