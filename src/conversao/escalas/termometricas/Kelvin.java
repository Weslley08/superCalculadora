package conversao.escalas.termometricas;

public class Kelvin {

	protected static float KelvinFahrenheit(float F, float K) {
		return F = (float) ((K - 273) * 1.8 + 32);
	}

	protected static float KelvinCelsius(float C, float K) {
		return C = K - 273;
	}

}
