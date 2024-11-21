package exercicio1;

public class Motor {
    private int cilindradas;
    private String modelo;
    private TipoCombustivel tipocombustivel;
    private int rpm;
    private int potencia;

    public Motor(int cilindradas, String modelo, TipoCombustivel tipocombustivel, int rpm, int potencia) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipocombustivel = tipocombustivel;
        this.rpm = rpm;
        this.potencia = potencia;
    }

    public String getModelo() { return modelo;}

    public TipoCombustivel getTipocombustivel(){return tipocombustivel;};


    public void ligar(){
        System.out.println("Motor ligado");
    }
    public void desligar(){
        System.out.println("motor desligado");
    }
    public void aumentarPotencia(int incremento){
        potencia += incremento;
        System.out.println("Aumentando potencia: " + potencia);
    }

    public void reduzirPotencia(int decremento){
        if (potencia - decremento >= 0){
            potencia -= decremento;
            System.out.println("Reduzindo potencia: " + potencia);
        }else{
            System.out.println("Esta no minimo.");
        }
    }

    public void acelerar(int incrementoRpm){
        rpm += incrementoRpm;
        System.out.println("Acelerar: " + rpm + " rpm");
    }
    public void reduzirRpm(int decrementoRpm){
        if (rpm - decrementoRpm >= 0){
            rpm -= decrementoRpm;
            System.out.println("Reduzindo: " + rpm);
        }else{
            System.out.println("esta no minimo.");
        }
    }

}
