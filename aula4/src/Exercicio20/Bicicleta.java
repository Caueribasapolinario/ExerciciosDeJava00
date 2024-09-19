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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }else{
            System.out.println("Marca invalida");
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        }else{
            System.out.println("Modelo invalida");
        }

    }

    public double getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(double tamanhoRoda) {
        if (tamanhoRoda > 0) {
            this.tamanhoRoda = tamanhoRoda;
        }else{
            System.out.println("TamanhoRoda invalida");
        }

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
