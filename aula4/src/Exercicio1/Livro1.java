package Exercicio1;
//1 - Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas.//
// Adicione métodos para abrir o livro e ler uma página.//
public class Livro1 {
    public String titulo;
    public String autor;
    public Integer numeroDePaginas;
    private Integer paginaslidas = 0;
    private Boolean livroAberto = false;

    public Livro1(String titulo, String autor, Integer numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        if (numeroDePaginas > 0 ) {
            this.numeroDePaginas = numeroDePaginas;
        }else{
            System.out.println("Numero de paginas tem que ser maior que 0");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null) {
            this.autor = autor;
        }

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
