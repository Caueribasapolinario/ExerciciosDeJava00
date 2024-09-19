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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }else{
            System.out.println("tipo esta vazio");
        }

    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        if (quantidadeDePessoas > 0) {
            this.quantidadeDePessoas = quantidadeDePessoas;
        }else {
            System.out.println("quantidadeDePessoas nao pode ser menor que zero");
        }

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null) {
            this.cor = cor;
        }else{
            System.out.println("cor esta vazio");
        }

    }

    void cozinhando(){
        this.cozinhar = true;
    }

    void limpando(){
        this.limpar = true;
    }

}
