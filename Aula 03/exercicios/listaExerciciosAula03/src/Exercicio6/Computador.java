package Exercicio6;

/*Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento. Adicione métodos para ligar e desligar o computador.*/

public class Computador {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private boolean StatusPC = false;


    public Computador(String processador, String memoriaRAM, String armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public void ligar(){
        this.StatusPC = true;
        System.out.println("PC Ligado");
    }

    public void desligar(){
        this.StatusPC = false;
        System.out.println("PC desligado");
    }

}
