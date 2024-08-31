package Exercicio22;

/*Defina uma classe Empresa com atributos como nome, CNPJ, e numeroFuncionarios. Adicione métodos para contratar e demitir funcionários.*/

public class Empresa {
    private String nome;
    private String cnpj;
    private int numeroFuncionarios;


    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    void contratar(int quantidade){
        this.numeroFuncionarios += quantidade;
    }

    void demitir(int quantidade){
        this.numeroFuncionarios -= quantidade;
    }
}
