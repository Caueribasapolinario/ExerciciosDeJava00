public class Motor {
    private int cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private int rpm;
    private int potencia;

    public Motor(int cilindradas, String modelo, int rpm, TipoCombustivel tipoCombustivel, int potencia) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.rpm = 0;
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
    }


}
