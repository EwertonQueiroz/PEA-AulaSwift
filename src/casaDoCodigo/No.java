package casaDoCodigo;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class No {
	private Set<No> adjcentes = new HashSet<>();
	private Cor cor;
	private String nome;
	
	public No (String nome) {
		this.nome = nome;
		cor = new Branco();
	}
	
	public void buscaProfundidade (List<No> lista) {
		cor.busca(this, lista);
	}
	
	public Set<No> getAdjacente () {
		return this.adjcentes;
	}
	
	public void addAdjacente (No adj) {
		this.adjcentes.add(adj);
	}
	
	public void setCor (Cor cor, List<No> lista) {
		this.cor = cor;
		cor.assumiu(this, lista);
	}
	
	public String toString () {
		return this.nome;
	}
}
