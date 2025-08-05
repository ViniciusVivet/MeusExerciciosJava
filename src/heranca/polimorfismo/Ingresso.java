package heranca.polimorfismo;

public class Ingresso {
    protected double valor;
    protected String nomeFilme;

    public Ingresso(double valor, String nomeFilme) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
    }


    public void imprimeTipo() {
        System.out.println("Ingresso para o filme: " + nomeFilme);
        System.out.println("Valor: R$ " + valor);
    }
}
