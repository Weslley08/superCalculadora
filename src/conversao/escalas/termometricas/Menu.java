package conversao.escalas.termometricas;

import java.util.Scanner;

public class Menu {
	
	protected static void menu(byte cod) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("   CALCULADORA TERMOMETRICA    ");
		System.out.println("-------------------------------");
		System.out.println("\n");
		System.out.println("1. Celsius para Fahrenheit");
		System.out.println("2. Celsius para Kelvin");
		System.out.println("3. Kelvin para Fahrenheit");
		System.out.println("4. Kelvin para Celsius");
		System.out.println("5. Fahrenheit para Celsius");
		System.out.println("6. Fahrenheit para Kelvin");
		System.out.println("7. Finalizar o programa!");
		cod = leitor.nextByte();
		leitor.close();
	}
}
