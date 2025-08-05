package heranca.polimorfismo;

public class Usuario {

    // Atributos básicos que todo usuário vai ter.
    // 'protected' é importante para as classes filhas (como Gerente) poderem usar esses atributos.
    protected String nome;
    protected String email;
    protected String senha;

    // Esse atributo vai me dizer se o usuário é um administrador ou não.
    // Eu coloquei 'protected' também para as classes filhas poderem mexer nele.
    protected boolean ehAdministrador;

    // Construtor: essa é a "fábrica" para criar um novo usuário.
    // Aqui eu digo quais informações preciso para criar um usuário.
    public Usuario(String nome, String email, String senha) {
        // 'this' serve para eu saber que estou falando do atributo da classe,
        // e não do argumento que veio do construtor.
        this.nome = nome;
        this.email = email;
        this.senha = senha;

        // Eu decidi que, por padrão, um usuário normal não é administrador.
        // A gente muda isso nas classes filhas que precisarem.
        this.ehAdministrador = false;
    }

    // Método para me dizer que tipo de usuário eu tenho.

    public void imprimeTipo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("É administrador? " + this.ehAdministrador);
    }
}