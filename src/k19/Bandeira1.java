package k19;

public class Bandeira1 implements Bandeira {

	@Override
	public double calcularValorCorrida(double tempo, double distancia) {
		return 5.0 + tempo * 1.5 + distancia * 1.7;
	}

}
