package Exercicio17;

/*Implemente uma classe Animal com atributos especie, idade, e peso. Adicione métodos para alimentar e dormir.*/

public class Animal {
    private String especie;
    private int idade;
    private double peso;
    private boolean alimentar;
    private boolean dormir;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;

    }

    void darComida(){
        this.alimentar = true;
        System.out.println("voce alimentou o animal ");
    }

    void animalDormir(){
        this.dormir = true;
        System.out.println("animal esta dormindo ");
    }
}
