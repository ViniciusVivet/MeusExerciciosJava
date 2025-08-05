package heranca.polimorfismo;

public class Atendente extends Usuario {

    private int quantidadeAtendimentos;

    public Atendente(String nome, String email, String senha, int quantidadeAtendimentos) {
        super(nome, email, senha);
        this.quantidadeAtendimentos = quantidadeAtendimentos;
    }

    public void receberPagamento() {
        System.out.println("Pagamento recebido pelo atendente " + this.nome + ".");
        this.quantidadeAtendimentos++;
    }

    @Override
    public void imprimeTipo() {
        System.out.println("-------------------------");
        System.out.println("Tipo de Usuário: Atendente");
        super.imprimeTipo();
        System.out.println("Quantidade de atendimentos: " + this.quantidadeAtendimentos);
        System.out.println("-------------------------");
    }
}