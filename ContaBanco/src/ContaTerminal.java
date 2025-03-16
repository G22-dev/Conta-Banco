import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Dados da conta
        String Nome = "Antonio Guilherme";
        double Saldo = 1000.0;

        // Solicitando informações da conta
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int Conta = scanner.nextInt();

        // Exibindo informações da conta
        System.out.println("Olá " + Nome + " , obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é "+ agencia +" , conta "+ Conta);
        System.out.println("Seu saldo atual é de R$ " + Saldo);
    }
}
