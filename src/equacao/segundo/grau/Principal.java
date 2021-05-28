package equacao.segundo.grau;

import java.util.Scanner;
import util.clear;

public class Principal {

	public static void main(String[] args) {
		double a, b, c, x1, x2;
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor de A");
		a = Leitor.nextDouble();
		System.out.println("Informe o valor de B");
		b = Leitor.nextDouble();
		System.out.println("Informe o valor de C");
		c = Leitor.nextDouble();
		
		clear.screen();
		
		System.out.println("\n A = " + a + " \n B = " + b + " \n C = " + c);
		
		System.out.println("\n Seu delta é igual a: " + Delta.Calc_Delta(a, b, c));
		
		if (Delta.Calc_Delta(a, b, c) != 0) {
			
			if (Delta.Calc_Delta(a, b, c) > 0) {
				x1 = (-b + Math.sqrt(Delta.Calc_Delta(a, b, c))) / (2 * a);
				x2 = (-b - Math.sqrt(Delta.Calc_Delta(a, b, c))) / (2 * a);
				System.out.println("\n A equação, admite duas raizes reais, sendo elas x1: " + x1 + " e x2: " + x2);
			}
			
			if (Delta.Calc_Delta(a, b, c) < 0) {
				System.out.println("\n Não há raizes reais nesta equação.");
			}
		}
		
		else {
			x1 = (-b + Math.sqrt(Delta.Calc_Delta(a, b, c))) / (2 * a);
			System.out.println("\n As raizes desta equação são iguais, neste caso o seu valor é:  " + x1);
		Leitor.close();	

		}

	}

}