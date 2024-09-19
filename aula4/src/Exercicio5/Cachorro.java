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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            System.out.println("ERROOOU!!");
        }

    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca != null && !raca.isEmpty()) {
            this.raca = raca;
        }else{
            System.out.println("ERRO!!");
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 ) {
            this.idade = idade;
        }else{
            System.out.println("ERRO!!");
        }

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
