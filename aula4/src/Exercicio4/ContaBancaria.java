package Exercicio4;
/*Crie uma classe ContaBancaria com atributos como numeroConta e saldo. Adicione métodos para depositar e sacar dinheiro.*/



public class ContaBancaria {
    public String numeroConta;
    public double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    //nao pode trocar o numero da conta

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("ERRO!!");
        }

    }

    public void sacar(double valor) {saldo = saldo - valor;}

    public void depositar(double valor) {saldo = saldo + valor;}

    @Override
    public String toString() {
        return "numeroConta: " + numeroConta + ", saldo: " + saldo;
    }

}
