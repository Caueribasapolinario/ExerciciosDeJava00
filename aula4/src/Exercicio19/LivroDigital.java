package Exercicio19;

/*Defina uma classe LivroDigital com atributos como titulo, autor, e tamanhoArquivo. Adicione métodos para abrir e fechar o livro.*/

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;
    private boolean statusDoLivro;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null ) {
            this.titulo = titulo;
        }else{
            System.out.println("Erro");
        }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null ) {
            this.autor = autor;
        }else {
            System.out.println("Erro");
        }

    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        if (tamanhoArquivo > 0) {
            this.tamanhoArquivo = tamanhoArquivo;
        }else{
            System.out.println("Erro");
        }

    }

    void abrirLivro() {
        statusDoLivro = true;
    }

    void fecharLivro() {
        statusDoLivro = false;
    }
}
