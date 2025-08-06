package interfaces.lambdas;

import java.util.ArrayList;
import java.util.List;

public class TesteTributos {

    public static void main(String[] args) {

        // Criando objetos de diferentes classes de produto
        Alimentacao arroz = new Alimentacao(10.0, "Arroz");
        SaudeEBemEstar remedio = new SaudeEBemEstar(50.0, "Remédio para dor");
        Vestuario calca = new Vestuario(100.0, "Calça Jeans");
        Cultura livro = new Cultura(40.0, "Livro de Ficção");

        // Usando o polimorfismo!
        // Eu posso ter uma lista de objetos do tipo da interface (Calculavel),
        // e essa lista pode conter objetos de diferentes classes que a implementam.
        List<Calculavel> produtos = new ArrayList<>();
        produtos.add(arroz);
        produtos.add(remedio);
        produtos.add(calca);
        produtos.add(livro);

        System.out.println("--- Calculando Tributos dos Produtos ---");

        // Eu itero sobre a lista e chamo o mesmo método para cada objeto,
        // mas o resultado é diferente para cada um!
        for (Calculavel produto : produtos) {
            double tributo = produto.calcularTributo();

            // Note que eu imprimo o tipo do objeto (a classe) para mostrar a diferença
            System.out.println("Produto: " + produto.getClass().getSimpleName());
            System.out.println("Valor do tributo: R$ " + String.format("%.2f", tributo));
            System.out.println("----------------------------------");
        }
    }
}