package teorema.pitagoras;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double h = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\n Digite o valor do primeiro cateto");
		double cateto1 = leitor.nextDouble();
		System.out.println("\n Digite o valor do segundo cateto");
		double cateto2 = leitor.nextDouble();
		
		
		System.out.println("\n A hipotenusa do triângulo mede: " + 	Pitagoras.calcTeorema(cateto1, cateto2, h));
		leitor.close();
		
	}

}
