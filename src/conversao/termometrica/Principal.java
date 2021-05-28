package conversao.termometrica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		byte cod = 0;
		double K = 0;
		double C = 0;
		double F = 0;
			
		Menu.menu(cod);
		
		switch (cod) {
		case 1:
			System.out.println("Quantos graus celsius voc� quer converter fahrenheit ?");
			C = leitor.nextDouble();

			F = C * 1.8 + 32;

			System.out.println("Est� fazendo " + F + "�F");
			break;

		case 2:
			System.out.println("Quantos graus celsius voc� quer converter para kelvin ?");
			C = leitor.nextDouble();

			K = C + 273;

			System.out.println("Est� fazendo " + K + "K");
			break;

		case 3:
			System.out.println("Quantos graus kelvin voc� quer converter para fahrenheit ?");
			K = leitor.nextDouble();

			F = (K - 273) * 1.8 + 32;

			System.out.println("Est� fazendo " + F + "�F");
			break;

		case 4:
			System.out.println("Quantos graus kelvin voc� quer converter para celsius ?");
			K = leitor.nextDouble();

			C = K - 273;

			System.out.println("Est� fazendo " + C + "�C");
			break;

		case 5:
			System.out.println("Quantos graus fahrenheit voc� quer converter para celsius ?");
			F = leitor.nextDouble();

			C = (F - 32) / 1.8;

			System.out.println("Est� fazendo " + C + "�C");
			break;

		case 6:
			System.out.println("Quantos graus fahrenheit voc� quer converter para kelvin ?");
			F = leitor.nextDouble();

			K = (F - 32) * 5 / 9 + 273;

			System.out.println("Est� fazendo " + K + "K");
			break;

		case 7:
			
			break;
		
		default:
			System.out.println("Digite uma op��o v�lida");

		}
		leitor.close();
	}

}


	