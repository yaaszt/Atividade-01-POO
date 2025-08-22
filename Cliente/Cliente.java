public class Cliente {

    String nome;
    String cpf;
    int idade;

    public void comprarLivro() {
        System.out.println(this.nome + " está comprando um livro na livraria.");
    }

    public void consultarLivro() {
        System.out.println(this.nome + " está consultando o acervo de livros.");
    }
}