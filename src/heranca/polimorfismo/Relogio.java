package heranca.polimorfismo;

import java.time.LocalTime; // Importa a classe LocalTime para trabalhar com horários

public class Relogio {
    // Um atributo para guardar o horário atual.
    protected LocalTime horaAtual;

    // Construtor que inicializa a hora quando o relógio é criado.
    public Relogio() {
        // Eu decidi que a hora inicial de todo relógio será a hora atual do sistema.
        this.horaAtual = LocalTime.now();
    }


    public String getHoraFormatada() {
        return "Formato padrão: " + this.horaAtual.toString();
    }
}