package Exercicio11;

/*11 - Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.*/

public class Cidade {
    private String nome;
    private String estado;
    private int populacao;


    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            System.out.println("Cidade fantasma???");
        }

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.isEmpty()) {
            this.estado = estado;
        }else{
            System.out.println("Cidade fantasma???");
        }

    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        if (populacao >= 0 ) {
            this.populacao = populacao;
        }else{
            System.out.println("Cidade fantasma???");
        }

    }

    void aumentarPopulacao(int quantidade ) {
        this.populacao += quantidade;
    }

    void diminuirPopulacao(int quantidade ) {
        this.populacao -= quantidade;
    }
}
