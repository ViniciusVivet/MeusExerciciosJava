package heranca.polimorfismo;

import java.time.format.DateTimeFormatter;

public class RelogioAmericano extends Relogio {

    // Eu sobrescrevo o método do meu pai para mudar o formato do relógio.
    @Override
    public String getHoraFormatada() {
        // Formato de 12 horas com AM/PM ('hh' para 1-12, 'a' para AM/PM)
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("hh:mm:ss a");

        return "Horário no formato americano: " + this.horaAtual.format(formatador);
    }
}