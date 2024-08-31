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

    void abrirLivro() {
        statusDoLivro = true;
    }

    void fecharLivro() {
        statusDoLivro = false;
    }
}
