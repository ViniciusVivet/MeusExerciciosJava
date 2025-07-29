import java.util.Scanner;

public class CalculoAreaRetangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o valor da base do retângulo:");

        double base = scanner.nextDouble();

        System.out.println("Por favor, digite o valor da altura do retângulo:");

        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
        // Boa prática para evitar vazamento de recursos.
    }
}