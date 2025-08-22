public class ProjetoCarro {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

     
        carro1.marca = "Honda";
        carro1.modelo = "Civic";
        carro1.ano = 2022;

        carro2.marca = "Ford";
        carro2.modelo = "Mustang";
        carro2.ano = 1969;
        
        System.out.println("--- Informações do Carro 1 ---");
        carro1.mostrarInformacoes();
        
        System.out.println("\n--- Informações do Carro 2 (antes da alteração) ---");
        carro2.mostrarInformacoes();

      
        carro2.modelo = "Mustang GT";
        carro2.ano = 2023;
        
     
        System.out.println("\n--- Informações do Carro 2 (depois da alteração) ---");
        carro2.mostrarInformacoes();

 
        System.out.println("\n--- Ações com os carros ---");
        carro1.ligar();
        carro2.ligar();
    }
}