package Exercicio16;

/*Crie uma classe Loja com atributos nome, endereco, e telefone. Adicione métodos para abrir e fechar a loja.*/

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean StatusDaLoja = false;//se ele ta aberta eh true

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    void FecharLoja() {
        StatusDaLoja = false;
    }

    void AbrirLoja() {
        StatusDaLoja = true;
    }
}
