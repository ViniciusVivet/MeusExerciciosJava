package interfaces.lambdas;

public class ServicoEmail implements ServicoMensagem {

    // Eu sou obrigado a implementar este método também.
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
        // Aqui entraria a lógica de envio de Email
    }
}