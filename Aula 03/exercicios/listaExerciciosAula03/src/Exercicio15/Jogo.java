package Exercicio15;
/*Crie uma classe Jogo com atributos nome, genero, e preco. Adicione métodos para iniciar e pausar o jogo.*/


public class Jogo {
    private String nome;
    private String genero;
    private double preco;
    private boolean statusDoJogo = false;


    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar(){
        statusDoJogo = true;
        System.out.println("Jogo iniciado");
    }

    public void pausar(){
        statusDoJogo = false;
        System.out.println("Jogo pausado");
    }


}
