package Exercicio1;
//1 - Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas.//
// Adicione métodos para abrir o livro e ler uma página.//
public class Livro {
    public String titulo;
    public String autor;
    public Integer numeroDePaginas;
    private Integer paginaslidas = 0;
    private Boolean livroAberto = false;

    public Livro(String titulo, String autor, Integer numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void paginasLidas(int pagina){
        paginaslidas = pagina;
    }
    public void  abrirLivro(){
        livroAberto = true;
    }

    @Override
    public String toString(){
        return "Livro{" + "titulo=" + titulo + "\'" + ", autor=" + autor + "\'" + ", numeroDePaginas=" + numeroDePaginas + '}';
    }

}
