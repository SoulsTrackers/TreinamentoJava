package Exercicio1;

public class Imovel {
	
	

	private String endereco;
	private float  preco;
	
	
	public Imovel(String endereco, float preco) {
		
		this.endereco = endereco;
		this.preco = preco;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPreco()
	{
		return  this.preco;
	}
	
	
	public String imprimir()
	{
		return "O valor do imovel e: " + getPreco();
	}
}
