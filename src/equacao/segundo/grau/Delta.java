package equacao.segundo.grau;

public class Delta {

	protected static double Calc_Delta(double a, double b, double c) {
		
		// Função para retornar o valor de Delta
		return Math.pow(b, 2) - 4 * a * c;
	}
}