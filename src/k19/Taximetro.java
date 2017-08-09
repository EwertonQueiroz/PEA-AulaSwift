package k19;

public class Taximetro {
	private Bandeira bandeira;
	
	public Taximetro (Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	
	public void setBandeira (Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	
	public double calcularValorCorrida (double tempo, double distancia) {
		return this.bandeira.calcularValorCorrida(tempo, distancia);
	}
}
