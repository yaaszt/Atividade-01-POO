public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota AV1: " + this.notaAv1);
        System.out.println("Nota AV2: " + this.notaAv2);
    }

    public double calcularMedia() {
        return (this.notaAv1 + this.notaAv2) / 2;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.printf("Média: %.2f\n", media);
        if (media >= 7.0) {
            System.out.println("Status: Aprovado!");
        } else {
            System.out.println("Status: Reprovado.");
        }
    }
}