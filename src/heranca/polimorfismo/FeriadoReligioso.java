package heranca.polimorfismo;

// A gente faz essa classe abstrata porque a ideia de um "Feriado Religioso"
// genérico não faz sentido. Ela existe apenas para ser a base de outras classes.
public abstract class FeriadoReligioso {

    // Um método abstrato não tem implementação. Ele é um contrato:
    // "Toda classe que me herdar DEVE implementar este método".
    public abstract String calculaData();

}