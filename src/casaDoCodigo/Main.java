package casaDoCodigo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		No a = new No("A");
		No b = new No("B");
		No c = new No("C");
		No d = new No("D");
		No e = new No("E");
		No f = new No("F");
		No g = new No("G");
		No h = new No("H");
		
		a.addAdjacente(b);
		a.addAdjacente(e);
		a.addAdjacente(h);
		b.addAdjacente(c);
		c.addAdjacente(d);
		d.addAdjacente(b);
		e.addAdjacente(f);
		f.addAdjacente(c);
		f.addAdjacente(g);
		f.addAdjacente(h);
		
		List<No> lista = new ArrayList<>();
		a.buscaProfundidade(lista);
		
		for (No n : lista) 
			System.out.println(n);
	}

}
