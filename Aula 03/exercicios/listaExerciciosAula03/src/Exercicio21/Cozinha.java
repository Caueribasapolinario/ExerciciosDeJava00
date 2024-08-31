package Exercicio21;

/*Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor. Adicione métodos para cozinhar e limpar.*/

public class Cozinha {
    private String tipo;
    private int quantidadeDePessoas;
    private String cor;
    private boolean cozinhar = false;
    private boolean limpar = false;

    public Cozinha(String tipo, int quantidadeDePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadeDePessoas = quantidadeDePessoas;
        this.cor = cor;
    }

    void cozinhando(){
        this.cozinhar = true;
    }

    void limpando(){
        this.limpar = true;
    }

}
