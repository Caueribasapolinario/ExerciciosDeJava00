package Exercicio5;

/*5 - Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.*/

import com.sun.source.tree.ReturnTree;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;


    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir(boolean comando1){
        if(comando1){
            System.out.println("AU AU AU");
        }else{
            System.out.println("...");
        }
    }
    public void correr(boolean comando2){
        if(comando2){
            System.out.println("correndo*");
        }else{
            System.out.println("parado*");
        }
    }

    @Override
    public String toString() {
        return "nome :" + nome + ", raca :" + raca + ", idade :" + idade + "\n";
    }
}
