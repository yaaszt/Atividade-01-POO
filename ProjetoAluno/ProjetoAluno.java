public class ProjetoAluno {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        
        aluno1.nome = "João da Silva";
        aluno1.matricula = 12345;
        aluno1.notaAv1 = 8.5;
        aluno1.notaAv2 = 9.0;

        aluno2.nome = "Maria Souza";
        aluno2.matricula = 67890;
        aluno2.notaAv1 = 6.0;
        aluno2.notaAv2 = 5.5;

       
        System.out.println("--- Dados Iniciais de João ---");
        aluno1.mostrarDados();
        
        System.out.println("\nAtualizando a nota AV2 de João...");
        aluno1.notaAv2 = 7.5;

       
        System.out.println("\n--- Dados Atualizados de João ---");
        aluno1.mostrarDados();

      
        System.out.println("\n--- Verificando aprovação de João ---");
        aluno1.verificarAprovacao();

        System.out.println("\n--- Verificando aprovação de Maria ---");
        aluno2.verificarAprovacao();
    }
}