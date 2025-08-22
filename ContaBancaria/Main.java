public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("123-45", "Carlos", 1000.00);
        ContaBancaria conta2 = new ContaBancaria("678-90", "Ana", 500.00);

        System.out.println("--- Operações na Conta de Carlos ---");
        conta1.consultarSaldo();
        conta1.depositar(200.00);
        conta1.consultarSaldo();
        conta1.sacar(300.00);
        conta1.consultarSaldo();
        conta1.sacar(2000.00); 

        System.out.println("\n--- Operações na Conta de Ana ---");
        conta2.consultarSaldo();
        conta2.sacar(50.00);
        conta2.consultarSaldo();
        conta2.depositar(150.00);
        conta2.consultarSaldo();
    }
}