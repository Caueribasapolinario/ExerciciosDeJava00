package Exercicio12;

/*12 - Implemente uma classe Filme com atributos titulo, diretor, e duracao. Adicione métodos para iniciar e parar o filme.*/

public class Filme {
    private String titulo;
    private String diretor;
    private double duracao;
    private boolean statusDoFilme = false;//false eh parado

    public Filme(String titulo, String diretor, double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar(){
        statusDoFilme = true;
        System.out.println("Filme iniciado");
    }

    public void parar(){
        statusDoFilme = false;
        System.out.println("Filme parado");
    }
}
