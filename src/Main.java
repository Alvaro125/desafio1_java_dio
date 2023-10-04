import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        System.out.print("Agencia: ");
        contaTerminal.setAgencia(scanner.nextLine());

        System.out.print("Nome Completo: ");
        contaTerminal.setNomeCliente(scanner.nextLine());

        System.out.print("Usuário: ");
        contaTerminal.setNumero(scanner.nextInt());

        System.out.print("Saldo: ");
        contaTerminal.setSaldo(scanner.nextFloat());

        System.out.println(contaTerminal.toString());
    }
}
