package exercicio1;

public class AplicacaoAgregacao {
    public static  void main(String[] args){
        Motor motor = new Motor(5000, "V6", TipoCombustivel.GASOLINA, 1000, 300);
        Carro carro1 = new Carro("Clio V6", motor);

        System.out.println("Carro1: " + carro1.getModelo() + " Motor: " + motor.getModelo() + " Combustivel: " + TipoCombustivel.GASOLINA);
        motor.ligar();
        motor.acelerar(1550);
        motor.reduzirRpm(1200);
        motor.desligar();
    }
}
