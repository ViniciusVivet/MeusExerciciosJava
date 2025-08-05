package heranca.polimorfismo;

public class TesteRelogios {

    public static void main(String[] args) {
        RelogioBrasileiro relogioBR = new RelogioBrasileiro();
        System.out.println(relogioBR.getHoraFormatada());

        RelogioAmericano relogioUS = new RelogioAmericano();
        System.out.println(relogioUS.getHoraFormatada());
    }
}