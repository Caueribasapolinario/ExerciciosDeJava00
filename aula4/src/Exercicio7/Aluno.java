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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }else{
            System.out.println("NAAAOOOOO   ");
        }

    }

    public int getMatricula() {
        return matricula;
    }

    //nao pode trocar a matricula

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null) {
            this.curso = curso;
        }else{
            System.out.println("NAAAOOOOO   ");
        }

    }

    public void calcularMedia(int nota1, int nota2, int nota3) {
        int media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);
    }
}
