package conversao.escalas.termometricas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		byte cod = 0;
		float K = 0;
		float C = 0;
		float F = 0;

		/* Menu para testar */
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

		switch (cod) {

		case 1:
			System.out.println("Quantos graus celsius você quer converter fahrenheit ?");
			C = leitor.nextFloat();

			System.out.println("Está fazendo " + Celsius.CelsiusFahrenheit(C, F) + "°F");
			break;

		case 2:
			System.out.println("Quantos graus celsius você quer converter para kelvin ?");
			C = leitor.nextFloat();

			System.out.println("Está fazendo " + Celsius.CelsiusKelvin(K, C) + "K");
			break;

		case 3:
			System.out.println("Quantos graus kelvin você quer converter para fahrenheit ?");
			K = leitor.nextFloat();

			System.out.println("Está fazendo " + Kelvin.KelvinFahrenheit(F, K) + "°F");
			break;

		case 4:
			System.out.println("Quantos graus kelvin você quer converter para celsius ?");
			K = leitor.nextFloat();

			System.out.println("Está fazendo " + Kelvin.KelvinCelsius(C, K) + "°C");
			break;

		case 5:
			System.out.println("Quantos graus fahrenheit você quer converter para celsius ?");
			F = leitor.nextFloat();

			System.out.println("Está fazendo " + Fahrenheit.FahrenheitCelsius(F, C) + "°C");
			break;

		case 6:
			System.out.println("Quantos graus fahrenheit você quer converter para kelvin ?");
			F = leitor.nextFloat();

			System.out.println("Está fazendo " + Fahrenheit.FahrenheitKelvin(K, F) + "K");
			break;

		case 7:
			System.out.println("Programa Finalizado");
			break;

		default:
			System.out.println("Digite uma opção válida");

		}
		leitor.close();
	}

}
