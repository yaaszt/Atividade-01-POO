public class ProjetoLivraria {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        
       
        cliente1.nome = "Maria";
        cliente1.cpf = "123.456.789-00";
        cliente1.idade = 25;

       
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente1.nome);
        System.out.println("CPF: " + cliente1.cpf);
        System.out.println("Idade: " + cliente1.idade);
        
        System.out.println("\nAções do Cliente:");
        cliente1.comprarLivro();
        cliente1.consultarLivro();
    }
}