package Exercicio2;

public class Celular {
    public String marca;
    public String modelo;
    public int capacidadeBateria;
    public boolean celularLigado;

    public Celular(){

    }

    public Celular(String marca, String modelo, int capacidadeBateria, boolean celularLigado){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.celularLigado = celularLigado;
    }

    @Override
    public String toString() {
        return "Celular{" + "marca = " + marca + ", modelo = " + modelo + ", capacidadeBateria = " + capacidadeBateria + ", celularLigado = " + celularLigado + '}';
    }
}
