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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie != null) {
            this.especie = especie;
        }else {
            System.out.println("erro ");
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }else{
            System.out.println("erro ");
        }

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }else{
            System.out.println("erro ");
        }

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
