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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            System.out.println("Vazio");
        }

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj != null && !cnpj.isEmpty()) {
            this.cnpj = cnpj;
        }else{
            System.out.println("Vazio");
        }

    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        if (numeroFuncionarios >= 0) {
            this.numeroFuncionarios = numeroFuncionarios;
        }else {
            System.out.println("nao pode ser menor que 0");
        }

    }

    void contratar(int quantidade){
        this.numeroFuncionarios += quantidade;
    }

    void demitir(int quantidade){
        this.numeroFuncionarios -= quantidade;
    }
}
