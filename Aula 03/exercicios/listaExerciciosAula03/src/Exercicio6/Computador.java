package Exercicio6;


public class Computador {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;


    public Computador(String processador, String memoriaRAM, String armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }
    public void ligarDesligar(boolean ligar){
        if(ligar){
            System.out.println("ligado");
        }else {
            System.out.println("desligado");
        }
    }
}
