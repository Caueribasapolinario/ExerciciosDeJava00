package Exercicio4;
/*Crie uma classe ContaBancaria com atributos como numeroConta e saldo. Adicione métodos para depositar e sacar dinheiro.*/



public class ContaBancaria {
    public String numeroConta;
    public double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {saldo = saldo - valor;}

    public void depositar(double valor) {saldo = saldo + valor;}

    @Override
    public String toString() {
        return "numeroConta: " + numeroConta + ", saldo: " + saldo;
    }

}
