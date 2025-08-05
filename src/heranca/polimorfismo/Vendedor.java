package heranca.polimorfismo;

public class Vendedor extends Usuario {

    // O enunciado pediu para o Vendedor ter um atributo de quantidade de vendas.
    // Esse atributo é só do Vendedor, então eu o crio aqui.
    private int quantidadeVendas;

    // Construtor: a "fábrica" para criar um Vendedor.
    // Eu preciso das informações do Usuario mais a quantidade de vendas inicial.
    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        // Primeiro, eu chamo a "fábrica" da classe pai para criar o Usuario.
        super(nome, email, senha);

        this.quantidadeVendas = quantidadeVendas;
    }

    // O enunciado pediu para o Vendedor ter alguns métodos.
    // Ele consegue registrar uma venda, que incrementa o número de vendas.
    public void realizarVenda() {
        System.out.println("Venda realizada por " + this.nome + ".");
        this.quantidadeVendas++; // O número de vendas aumenta em 1.
    }


    @Override
    public void imprimeTipo() {
        System.out.println("-------------------------");
        System.out.println("Tipo de Usuário: Vendedor");
        super.imprimeTipo();
        System.out.println("Quantidade de vendas: " + this.quantidadeVendas);
        System.out.println("-------------------------");
    }
}