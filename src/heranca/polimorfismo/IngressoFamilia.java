package heranca.polimorfismo;

public class IngressoFamilia extends Ingresso {

    private int quantidadePessoas;


    public IngressoFamilia(double valor, String nomeFilme, int quantidadePessoas) {

        super(valor, nomeFilme);
        this.quantidadePessoas = quantidadePessoas;


        if (quantidadePessoas > 3) {
            this.valor = this.valor * (1 - 0.05); // valor * 0.95
        }

        // Multiplica o valor final pelo número de pessoas
        this.valor = this.valor * quantidadePessoas;
    }


    @Override
    public void imprimeTipo() {
        System.out.println("Ingresso para família | Filme: " + nomeFilme);
        System.out.println("Quantidade de pessoas: " + quantidadePessoas);
        System.out.println("Valor total: R$ " + this.valor);
    }
}