package interfaces.lambdas;

public class Alimentacao implements Calculavel {

    private double valor;
    private String nome;

    public Alimentacao(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public double calcularTributo() {
        // Exemplo: o tributo para alimentos é de 5% sobre o valor
        return this.valor * 0.05;
    }
}