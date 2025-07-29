import java.util.Scanner;

public class SaudacaoComIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite seu ano de nascimento (ex: 1990):");
        int anoNascimento = scanner.nextInt();

        int anoAtual = 2025;

        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + " você tem " + idade + " anos.");

        scanner.close();
    }
}