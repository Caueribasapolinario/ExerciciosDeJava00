package Exercicio10;


/*Crie uma classe Veiculo com atributos tipo, placa, e cor. Adicione métodos para abastecer e lavar o veículo.*/

public class Veiculos {
    private String tipoVeiculo;
    private String placa;
    private String cor;

    public Veiculos (String placa, String cor) {
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        if (tipoVeiculo == null) {
            this.tipoVeiculo = tipoVeiculo;
        }else{
            System.out.println("Veiculo relampago marquinhos");
        }

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null) {
            this.placa = placa;
        }else{
            System.out.println("Veiculo relampago marquinhos");
        }

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null) {
            this.cor = cor;
        }else{
            System.out.println("Veiculo relampago marquinhos");
        }

    }

    public void abastecer(boolean comando1){
        if(comando1){
            System.out.println("Abastecendo");
        }else {
            System.out.println("tanque ja esta cheio");
        }
    }

    public void lavarCarro(boolean comando2){
        if(comando2){
            System.out.println("Lavando");
        }else{
            System.out.println("...");
        }
    }

}
