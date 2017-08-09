package k19;

public class Main {

	public static void main(String[] args) {
		Bandeira b1 = new Bandeira1();
		Taximetro taximetro = new Taximetro(b1);
		
		double valor1 = taximetro.calcularValorCorrida(10, 20);
		System.out.println("Corrida em bandeira 1: " + valor1);
		
		Bandeira b2 = new Bandeira2();
		taximetro.setBandeira(b2);
		
		double valor2 = taximetro.calcularValorCorrida(10, 20);
		System.out.println("Corrida em bandeira 2: " + valor2);
	}

}
