package interfaces.lambdas;

public class ServicoSMS implements ServicoMensagem {

    // O 'implements ServicoMensagem' me obriga a criar este método.
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
        // Aqui entraria a lógica de envio de SMS
    }
}