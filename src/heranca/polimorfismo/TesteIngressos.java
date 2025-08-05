package heranca.polimorfismo; // O pacote que você criou

public class TesteIngressos {

    public static void main(String[] args) {
        // Exemplo 1: Criando um ingresso padrão
        System.out.println("--- Testando Ingresso Padrão ---");
        Ingresso ingressoPadrao = new Ingresso(30.0, "O Ladrão de Raios");
        ingressoPadrao.imprimeTipo();

        // Exemplo 2: Criando um ingresso meia-entrada
        System.out.println("\n--- Testando Ingresso Meia-Entrada ---");
        MeiaEntrada meiaEntrada = new MeiaEntrada(30.0, "O Ladrão de Raios");
        meiaEntrada.imprimeTipo();

        // Exemplo 3: Criando um ingresso família (com 4 pessoas, então tem desconto)
        System.out.println("\n--- Testando Ingresso Família (4 pessoas) ---");
        IngressoFamilia ingressoFamilia = new IngressoFamilia(30.0, "O Ladrão de Raios", 4);
        ingressoFamilia.imprimeTipo();

        // Exemplo 4: Criando um ingresso família (com 2 pessoas, então NÃO tem desconto)
        System.out.println("\n--- Testando Ingresso Família (2 pessoas) ---");
        IngressoFamilia ingressoFamiliaSemDesconto = new IngressoFamilia(30.0, "O Ladrão de Raios", 2);
        ingressoFamiliaSemDesconto.imprimeTipo();
    }
}