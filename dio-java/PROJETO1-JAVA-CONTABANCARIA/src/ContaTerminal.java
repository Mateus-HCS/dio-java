import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numero;
            String agencia;
            String nome;
            double saldo;

            System.out.print("Digite o número da conta: ");
            numero = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite a agência da conta: ");
            agencia = scanner.nextLine();

            System.out.print("Digite o nome do titular da conta: ");
            nome = scanner.nextLine();

            System.out.print("Digite o saldo da conta: ");
            saldo = scanner.nextDouble();

            System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

            scanner.close();

        }
}
