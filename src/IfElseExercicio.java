import java.util.Scanner;

public class IfElseExercicio {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, informe seu nome:");
        var name = scanner.next();

        System.out.println("Por favor, informe sua idade:");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado(a)? s/n");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("Bem vindo(a), %s\n", name);
            System.out.printf("Você tem %d anos e então pode dirigir.\n", age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de você ter %d anos, você é emancipado(a) e pode dirigir.\n", name, age);
        } else {
            System.out.printf("%s, você infelizmente não pode dirigir!\n", name);
        }

        System.out.println("Fim.");

        scanner.close();
    }
}
