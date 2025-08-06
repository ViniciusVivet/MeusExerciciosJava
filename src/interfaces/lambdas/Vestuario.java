package interfaces.lambdas;

public class Vestuario implements Calculavel {

    private double valor;
    private String nome;

    public Vestuario(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public double calcularTributo() {
        // Tributo para vestuário é de 2.5%
        return this.valor * 0.025;
    }
}