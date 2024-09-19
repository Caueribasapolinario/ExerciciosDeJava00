package Exercicio16;

/*Crie uma classe Loja com atributos nome, endereco, e telefone. Adicione métodos para abrir e fechar a loja.*/

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean StatusDaLoja = false;//se ele ta aberta eh true

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else {
            System.out.println("Erro: Nome vazio");
        }

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.isEmpty()) {
            this.endereco = endereco;
        }else{
            System.out.println("Erro: Endereco vazio");
        }

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && !telefone.isEmpty()) {
            this.telefone = telefone;
        }else {
            System.out.println("Erro: Telefone vazio");
        }

    }

    void FecharLoja() {
        StatusDaLoja = false;
    }

    void AbrirLoja() {
        StatusDaLoja = true;
    }
}
