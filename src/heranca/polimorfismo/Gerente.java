package heranca.polimorfismo;

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {

        super(nome, email, senha);


        this.ehAdministrador = true;
    }


    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado pelo gerente " + this.nome + ".");
    }

    // Ele também consegue realizar uma venda.
    public void realizarVenda() {
        System.out.println("Venda realizada pelo gerente " + this.nome + ".");
    }

    // E, claro, a gente precisa sobrescrever o método imprimeTipo()
    // para que um Gerente se apresente como um Gerente.
    // A anotação '@Override' é para o Java saber que eu estou sobrescrevendo
    // um método que já existia na classe pai (Usuario).
    @Override
    public void imprimeTipo() {
        System.out.println("-------------------------");
        System.out.println("Tipo de Usuário: Gerente");
        super.imprimeTipo();
        System.out.println("-------------------------");
    }
}