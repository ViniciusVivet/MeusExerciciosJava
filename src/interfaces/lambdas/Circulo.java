package interfaces.lambdas;

public class Circulo implements AreaCalculavel {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        // A fórmula da área do círculo é PI * raio * raio
        return Math.PI * this.raio * this.raio;
    }
}