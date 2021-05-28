package tabuada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numeroTabuada = 0;
		int resultado;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o número da tabuada que você quer");
		numeroTabuada = leitor.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			resultado = i * numeroTabuada;
			
			System.out.println(i + " X " + numeroTabuada + " = " + resultado);	
		leitor.close();
		}

	}

}
