package heranca.polimorfismo;

import java.time.LocalDate;

// Por herdar de FeriadoReligioso, eu sou obrigado a implementar
// o método 'calculaData()' que está na classe abstrata.
public class Pascoa extends FeriadoReligioso {

    // Eu implemento o método abstrato do meu pai aqui.
    @Override
    public String calculaData() {
        // Eu sei que a Páscoa em 2025 é em abril, mas vou dar um exemplo didático.
        // O algoritmo para calcular a Páscoa é complexo, então vou simplificar.
        LocalDate pascoa = LocalDate.of(2025, 4, 20);
        return "A Páscoa de 2025 será em: " + pascoa;
    }
}