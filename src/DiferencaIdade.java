import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Digite os dados da PRIMEIRA pessoa ---");
        System.out.println("Por favor, digite o nome da primeira pessoa:");
        String nome1 = scanner.nextLine();
        System.out.println("Por favor, digite a idade da primeira pessoa:");
        int idade1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("\n--- Digite os dados da SEGUNDA pessoa ---");
        System.out.println("Por favor, digite o nome da segunda pessoa:");
        String nome2 = scanner.nextLine();

        System.out.println("Por favor, digite a idade da segunda pessoa:");
        int idade2 = scanner.nextInt();


        int diferencaIdade = Math.abs(idade1 - idade2);


        System.out.println("\n--- Resultado ---");
        System.out.println("Nomes: " + nome1 + " e " + nome2);
        System.out.println("Idades: " + idade1 + " e " + idade2);
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaIdade + " anos.");

        scanner.close();
    }
}