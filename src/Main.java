import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual a agência da sua conta: ");
        String agenciaConta = scanner.nextLine();

        System.out.println("Qual o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá , %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d " +
                "e seu saldo %.2f já está disponível para saque", nome, agenciaConta, numeroConta, saldo);

        scanner.close();
    }
}