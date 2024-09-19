package Exercicio2;

public class Celular {
    public String marca;
    public String modelo;
    public int capacidadeBateria;
    public boolean celularLigado = false;

    public Celular(){

    }

    public Celular(String marca, String modelo, int capacidadeBateria, boolean celularLigado){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("ERRO!!");
        }

    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        if (capacidadeBateria > 0){
            this.capacidadeBateria = capacidadeBateria;
        }else {
            System.out.println("ERRO!!");
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null){
            this.marca = marca;
        }else {
            System.out.println("ERRO!!");
        }

    }

    public void ligar(){
        this.celularLigado = true;
        System.out.println("Ligado");
    }

    public void Desligar(){
        this.celularLigado = false;
        System.out.println("Desligado");
    }


    @Override
    public String toString() {
        return "Celular{" + "marca = " + marca + ", modelo = " + modelo + ", capacidadeBateria = " + capacidadeBateria + ", celularLigado = " + celularLigado + '}';
    }
}
