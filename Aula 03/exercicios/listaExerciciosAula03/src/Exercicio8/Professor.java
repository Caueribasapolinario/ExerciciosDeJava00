package Exercicio8;

/*Crie uma classe Professor com atributos nome, disciplina, e salario. Adicione métodos para dar aula e corrigir provas.*/

public class Professor {
    private String nome;
    private String disciplina;
    private double salario;
    private boolean dandoAula = false;
    private boolean corrigindo = false;


    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula(){
        dandoAula = true;
        System.out.println("Professor esta dando aula");
    }
    public void corrigir(){
        corrigindo = true;
        System.out.println("Professor corrigido as provas");
    }


}
