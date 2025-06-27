import java.util.Scanner;

public class ExercicioVariaveisEprimitivos {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        String saldoTexto = scanner.nextLine().replace(",", ".");
        double saldo = Double.parseDouble(saldoTexto);

        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

         scanner.close();
    }
}
