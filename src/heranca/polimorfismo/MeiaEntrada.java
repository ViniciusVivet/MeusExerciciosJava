package heranca.polimorfismo;

// A palavra-chave 'extends' indica que esta classe herda de 'Ingresso'
public class MeiaEntrada extends Ingresso {


    public MeiaEntrada(double valor, String nomeFilme) {

        super(valor, nomeFilme);

        this.valor = this.valor * 0.50;
    }
}