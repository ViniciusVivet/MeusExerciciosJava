package heranca.polimorfismo;

import java.time.LocalDate;


public class CorpusChristi extends FeriadoReligioso {

    @Override
    public String calculaData() {
        // A data de Corpus Christi é 60 dias após a Páscoa.
        // Vou usar um valor fixo para a Páscoa de 2025 para simplificar.
        LocalDate pascoa = LocalDate.of(2025, 4, 20);
        LocalDate corpusChristi = pascoa.plusDays(60);
        return "Corpus Christi em 2025 será em: " + corpusChristi;
    }
}