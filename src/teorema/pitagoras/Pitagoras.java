package teorema.pitagoras;

public class Pitagoras {

	public static double calcTeorema(double cateto1, double cateto2, double h) {
		
		h = (cateto1 * cateto1) + (cateto2 * cateto2);
		return Math.sqrt(h);
		
		
	}
}	