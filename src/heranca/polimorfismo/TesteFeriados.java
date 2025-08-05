package heranca.polimorfismo;

public class TesteFeriados {

    public static void main(String[] args) {
        // Eu não posso fazer 'new FeriadoReligioso()' porque a classe é abstrata!
        // Eu preciso instanciar as classes filhas, que são concretas.

        // Criando um objeto da classe Pascoa
        Pascoa pascoa = new Pascoa();
        System.out.println(pascoa.calculaData());

        System.out.println(); // Linha em branco para separar

        // Criando um objeto da classe CorpusChristi
        CorpusChristi corpusChristi = new CorpusChristi();
        System.out.println(corpusChristi.calculaData());
    }
}