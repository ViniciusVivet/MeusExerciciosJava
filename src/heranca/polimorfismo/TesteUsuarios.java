package heranca.polimorfismo;

public class TesteUsuarios {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("João da Silva", "joao@empresa.com", "senha123");
        gerente.imprimeTipo();
        gerente.gerarRelatorioFinanceiro();

        System.out.println(); // Linha em branco para separar

        // Criando um objeto da classe Vendedor
        Vendedor vendedor = new Vendedor("Maria Souza", "maria@empresa.com", "senha456", 10);
        vendedor.imprimeTipo();
        vendedor.realizarVenda();

        System.out.println(); // Linha em branco para separar

        // Criando um objeto da classe Atendente
        Atendente atendente = new Atendente("Carlos Pereira", "carlos@empresa.com", "senha789", 5);
        atendente.imprimeTipo();
        atendente.receberPagamento();
    }
}