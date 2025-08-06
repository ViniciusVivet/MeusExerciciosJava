package interfaces.lambdas;

public class SaudeEBemEstar implements Calculavel {

    private double valor;
    private String nome;

    public SaudeEBemEstar(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public double calcularTributo() {
        // Exemplo: o tributo para produtos de saúde é de 10%
        return this.valor * 0.10;
    }
}