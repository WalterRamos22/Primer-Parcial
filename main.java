package ParcialNumeroUno;

import java.util.Scanner;

public class main {

	
	public main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Introduce un numero en base octal: ");
			String octalNumber = scanner.nextLine();
			
			// Crear una instancia de la clase Octal a Decimal
			OctalToDecimal converter = new OctalToDecimal(octalNumber);
			
			// Convertir y mostrar el resultado
			int decimalNumber = converter.convert();
			System.out.println("El numero en base decimal es: " + decimalNumber);
		}
    }


}
