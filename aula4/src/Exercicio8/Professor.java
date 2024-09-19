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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            System.out.println("deixa de ser burrito");
        }

    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.isEmpty()) {
            this.disciplina = disciplina;
        }else{
            System.out.println("deixa de ser burrito");
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }else{
            System.out.println("deixa de ser burrito");
        }

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
