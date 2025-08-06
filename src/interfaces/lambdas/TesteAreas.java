package interfaces.lambdas;

import java.util.ArrayList;
import java.util.List;

public class TesteAreas {

    public static void main(String[] args) {

        // Criando objetos de diferentes figuras
        Quadrado quadrado = new Quadrado(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        Circulo circulo = new Circulo(3.0);

        // Usando o polimorfismo!
        // Eu posso ter uma lista de objetos do tipo da interface (AreaCalculavel),
        // e essa lista pode conter objetos de diferentes classes que a implementam.
        List<AreaCalculavel> figuras = new ArrayList<>();
        figuras.add(quadrado);
        figuras.add(retangulo);
        figuras.add(circulo);

        System.out.println("--- Calculando a Área das Figuras ---");

        // Eu itero sobre a lista e chamo o mesmo método para cada objeto,
        // mas o resultado é diferente para cada um!
        for (AreaCalculavel figura : figuras) {
            double area = figura.calcularArea();

            // Note que eu imprimo o tipo do objeto (a classe) para mostrar a diferença
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Área: " + String.format("%.2f", area));
            System.out.println("----------------------------------");
        }
    }
}