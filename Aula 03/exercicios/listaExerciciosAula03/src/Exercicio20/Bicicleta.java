package Exercicio20;

/*Crie uma classe Bicicleta com atributos marca, modelo, e tamanhoRoda. Adicione métodos para pedalar e frear.*/

public class Bicicleta {
    private String marca;
    private String modelo;
    private double tamanhoRoda;
    private boolean pedalar;
    private boolean freiar;


    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    void comandoPedalar(){
        this.pedalar = true;
        this.freiar = false;
        System.out.println("Voce esta pedalando");
    }

    void comandoFreiar(){
        this.freiar = true;
        this.pedalar = false;
        System.out.println("Voce esta freiando");
    }
}
