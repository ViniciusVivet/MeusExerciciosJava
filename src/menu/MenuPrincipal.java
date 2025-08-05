package menu; // O pacote do seu menu

import java.util.InputMismatchException;
import java.util.Scanner;

// Importa as classes de teste de todos os exercícios
import heranca.polimorfismo.TesteIngressos;
import heranca.polimorfismo.TesteUsuarios;
import heranca.polimorfismo.TesteFeriados;
import heranca.polimorfismo.TesteRelogios;
import fundamentos.SaudacaoComIdade;
import fundamentos.CalculoAreaQuadrado;
import fundamentos.CalculoAreaRetangulo;
import fundamentos.DiferencaIdade;


public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        System.out.println("--- Bem-vindo aos Exercícios de Java da DIO! ---");

        while (opcao != 0) {
            System.out.println("\n-------------------------------------------------");
            System.out.println("Escolha um exercício para executar:");
            System.out.println("1. Exercício - Olá [Nome] você tem [Idade] anos");
            System.out.println("2. Exercício - Cálculo da Área do Quadrado");
            System.out.println("3. Exercício - Cálculo da Área do Retângulo");
            System.out.println("4. Exercício - Diferença de Idade entre 2 pessoas");
            System.out.println("5. Exercício - Hierarquia de Ingressos (Polimorfismo)");
            System.out.println("6. Exercício - Hierarquia de Usuários (Herança)");
            System.out.println("7. Exercício - Hierarquia de Feriados (Classes Abstratas)");
            System.out.println("8. Exercício - Hierarquia de Relógios (Sobrescrita de Métodos)");
            System.out.println("0. Sair");
            System.out.println("-------------------------------------------------");
            System.out.print("Sua escolha: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consome a quebra de linha

                System.out.println("\n");

                switch (opcao) {
                    case 1:
                        SaudacaoComIdade.main(args);
                        break;
                    case 2:
                        CalculoAreaQuadrado.main(args);
                        break;
                    case 3:
                        CalculoAreaRetangulo.main(args);
                        break;
                    case 4:
                        DiferencaIdade.main(args);
                        break;
                    case 5:
                        TesteIngressos.main(args);
                        break;
                    case 6:
                        TesteUsuarios.main(args);
                        break;
                    case 7:
                        TesteFeriados.main(args);
                        break;
                    case 8:
                        TesteRelogios.main(args);
                        break;
                    case 0:
                        System.out.println("Obrigado por usar o menu. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, escolha um número de 0 a 8.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}