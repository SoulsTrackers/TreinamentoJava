package Exercicio3;

public class Produto {
	
	private String nome;
	private double precoCompra;
	private double precoVenda;	
 
	
	
	
	public Produto(String nome, double precoCompra, double precoVenda) {
		super();
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}


	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}


	

}
