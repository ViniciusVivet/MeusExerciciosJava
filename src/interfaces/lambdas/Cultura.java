package interfaces.lambdas;

public class Cultura implements Calculavel {

    private double valor;
    private String nome;

    public Cultura(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public double calcularTributo() {
        // Tributo para cultura é de 4%
        return this.valor * 0.04;
    }
}