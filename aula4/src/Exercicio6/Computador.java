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

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        if (processador != null) {
            this.processador = processador;
        }else{
            System.out.println("NAO PODE MANITOOO");
        }

    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        if (memoriaRAM != null) {
            this.memoriaRAM = memoriaRAM;
        }else{
            System.out.println("NAO PODE MANITOOO");
        }

    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        if (armazenamento != null) {
            this.armazenamento = armazenamento;
        }else {
            System.out.println("NAO PODE MANITOOO");
        }

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
