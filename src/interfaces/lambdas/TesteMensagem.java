package interfaces.lambdas;

public class TesteMensagem {

    public static void main(String[] args) {
        String mensagem = "Olá, esta é uma mensagem de teste.";

        // Eu posso criar um objeto da classe SMS
        ServicoSMS servicoSMS = new ServicoSMS();
        servicoSMS.receberMensagem(mensagem);

        // Eu posso criar um objeto da classe Email
        ServicoEmail servicoEmail = new ServicoEmail();
        servicoEmail.receberMensagem(mensagem);

        System.out.println(); // Adiciona uma linha em branco

        // Eu posso ter uma variável do tipo da interface
        ServicoMensagem servico;

        // E posso fazer essa variável receber tanto um objeto SMS
        servico = new ServicoSMS();
        servico.receberMensagem("Mensagem de teste enviada pelo polimorfismo!");

        servico = new ServicoEmail();
        servico.receberMensagem("Outra mensagem de teste enviada pelo polimorfismo!");
    }
}