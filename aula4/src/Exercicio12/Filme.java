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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }else{
            System.out.println("Errooo");
        }

    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        if (diretor != null) {
            this.diretor = diretor;
        }else{
            System.out.println("Errooo");
        }

    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        }else {
            System.out.println("Errooo");
        }

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
