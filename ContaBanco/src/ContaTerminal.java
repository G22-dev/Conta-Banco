import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Dados da conta
        String nome = "Antonio Guilherme";
        double saldo = 1000.0;

        // Solicitando informações da conta
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        scanner.close();

        // Exibindo informações da conta
        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é "+ agencia +" , conta "+ conta);
        System.out.println("Seu saldo atual é de R$ " + saldo);
    }
}
