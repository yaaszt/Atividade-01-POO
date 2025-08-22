public class ProjetoLivraria {
    public static void main(String args[]) {
       
        Livro obj1 = new Livro();
        Livro obj2 = new Livro();

     
        obj1.titulo = "Harry Potter e a Pedra Filosofal";
        obj1.numeroPaginas = 304;
        obj1.anoPublicacao = 1997;
        obj1.preco = 25.90;

        obj2.titulo = "O Guia do Mochileiro das Galáxias";
        obj2.numeroPaginas = 208;
        obj2.anoPublicacao = 1979;
        obj2.preco = 30.50;
        
   
        System.out.println("--- Dados do Livro 1 ---");
        System.out.println("Título: " + obj1.titulo);
        System.out.println("Número de páginas: " + obj1.numeroPaginas);
        System.out.println("Ano de publicação: " + obj1.anoPublicacao);
        System.out.println("Preço: " + obj1.preco);

        System.out.println("\n--- Dados do Livro 2 ---");
        System.out.println("Título: " + obj2.titulo);
        System.out.println("Número de páginas: " + obj2.numeroPaginas);
        System.out.println("Ano de publicação: " + obj2.anoPublicacao);
        System.out.println("Preço: " + obj2.preco);
        
        System.out.println();
        
        
        System.out.println("--- Ações com o Livro 1 ---");
        obj1.cadastrar();
        double frete1 = obj1.calcFrete("12345-678");
        System.out.printf("Frete R$ %.2f\n", frete1);
        obj1.vender();
        System.out.println();
        System.out.println(obj1.trocar());

        System.out.println("\n--- Ações com o Livro 2 ---");
        obj2.cadastrar();
        double frete2 = obj2.calcFrete("87654-321");
        System.out.printf("Frete R$ %.2f\n", frete2);
        obj2.vender();
        System.out.println();
        System.out.println(obj2.trocar());
    }
}