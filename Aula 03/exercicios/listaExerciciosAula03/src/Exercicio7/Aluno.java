package Exercicio7;

/*Implemente uma classe Aluno com atributos nome, matricula, e curso. Adicione um método para calcular a média de notas.*/

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void calcularMedia(int nota1, int nota2, int nota3) {
        int media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);
    }
}
