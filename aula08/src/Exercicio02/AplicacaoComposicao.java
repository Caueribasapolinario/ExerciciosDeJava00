package Exercicio02;

public class AplicacaoComposicao {
    public static void main(String[] args){
        Livro livro1 = new Livro("caue lindao", "caue");
        livro1.adicionarPagina(1, "solidao e liberdade");

        System.out.println(livro1);
    }
}
