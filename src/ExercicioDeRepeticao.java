import java.util.Scanner;

public class ExercicioDeRepeticao {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc <=18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <=24.9) {
            System.out.println("Peso ideal");
        } else if (imc <=29.9) {
            System.out.println("Levemente acima no peso");
        } else if (imc <=34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <=39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        scanner.close();
    }
}
