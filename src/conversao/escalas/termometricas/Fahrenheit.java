package conversao.escalas.termometricas;

public class Fahrenheit {

	protected static float FahrenheitCelsius(float F, float C) {
		return C = (float) ((F - 32) / 1.8);
	}

	protected static float FahrenheitKelvin(float K, float F) {
		return K = (F - 32) * 5 / 9 + 273;
	}

}
