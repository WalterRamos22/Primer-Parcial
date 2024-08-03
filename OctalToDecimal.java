package ParcialNumeroUno;

public class OctalToDecimal {
	
	private final String octalNumber;

    // Constructor
    public OctalToDecimal(String octalNumber) {
        this.octalNumber = octalNumber;
    }

    // Método para convertir el número octal a decimal
    public int convert() {
        return Integer.parseInt(octalNumber, 8);
    }

}
