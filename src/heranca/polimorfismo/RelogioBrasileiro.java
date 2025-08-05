package heranca.polimorfismo;

import java.time.format.DateTimeFormatter; // A gente vai precisar do formatador de data e hora

public class RelogioBrasileiro extends Relogio {

    // Eu sobrescrevo o método da classe pai para mudar o formato do relógio.
    @Override
    public String getHoraFormatada() {
        // Formato padrão de 24 horas (HH:mm)
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");

        return "Horário no formato brasileiro: " + this.horaAtual.format(formatador);
    }
}