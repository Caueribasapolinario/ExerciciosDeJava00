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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            System.out.println("Erro: Nome vazio");
        }

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero != null && !genero.isEmpty()) {
            this.genero = genero;
        }else{
            System.out.println("Erro: Genero vazio");
        }

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0 ) {
            this.preco = preco;
        }else {
            System.out.println("valor invalido");
        }

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
