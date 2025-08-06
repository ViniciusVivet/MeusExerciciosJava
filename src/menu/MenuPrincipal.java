package menu;

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
import interfaces.lambdas.TesteMensagem;
import interfaces.lambdas.TesteTributos;
import interfaces.lambdas.TesteAreas;


public class MenuPrincipal {

    // Cores ANSI para o terminal
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String BOLD = "\u001B[1m";
    private static final String MAGENTA = "\u001B[35m";
    private static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        System.out.println(GREEN + BOLD + "--- Bem-vindo aos Exercícios de Java da DIO! ---" + RESET);

        while (opcao != 0) {
            System.out.println(CYAN + "\n-------------------------------------------------");
            System.out.println(YELLOW + "Escolha um exercício para executar:" + RESET);

            // Categoria: Fundamentos
            System.out.println(BOLD + "\n[ FUNDAMENTOS ]" + RESET);
            System.out.println(CYAN + "1. Exercício - Olá [Nome] você tem [Idade] anos");
            System.out.println("2. Exercício - Cálculo da Área do Quadrado");
            System.out.println("3. Exercício - Cálculo da Área do Retângulo");
            System.out.println("4. Exercício - Diferença de Idade entre 2 pessoas" + RESET);

            // Categoria: Herança e Polimorfismo
            System.out.println(BOLD + "\n[ HERANÇA E POLIMORFISMO ]" + RESET);
            System.out.println(MAGENTA + "5. Exercício - Hierarquia de Ingressos (Polimorfismo)");
            System.out.println("6. Exercício - Hierarquia de Usuários (Herança)");
            System.out.println("7. Exercício - Hierarquia de Feriados (Classes Abstratas)");
            System.out.println("8. Exercício - Hierarquia de Relógios (Sobrescrita de Métodos)" + RESET);

            // Categoria: Interfaces e Lambdas
            System.out.println(BOLD + "\n[ INTERFACES E LAMBDAS ]" + RESET);
            System.out.println(BLUE + "9. Exercício - Serviços de Mensageria (Interfaces)");
            System.out.println("10. Exercício - Cálculo de Tributos (Interfaces)");
            System.out.println("11. Exercício - Cálculo de Áreas (Interfaces)" + RESET);

            System.out.println(CYAN + "0. Sair" + RESET);
            System.out.println(CYAN + "-------------------------------------------------" + RESET);
            System.out.print(YELLOW + "Sua escolha: " + RESET);

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
                    case 9:
                        TesteMensagem.main(args);
                        break;
                    case 10:
                        TesteTributos.main(args);
                        break;
                    case 11:
                        TesteAreas.main(args);
                        break;
                    case 0:
                        System.out.println(YELLOW + "Obrigado por usar o menu. Até mais!" + RESET);
                        break;
                    default:
                        System.out.println(RED + "Opção inválida! Por favor, escolha um número de 0 a 11." + RESET);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(RED + "Entrada inválida! Por favor, digite um número." + RESET);
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}