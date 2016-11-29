package Exercicio1;

public class Novo extends Imovel {
	
	
	public Novo(String endereco, float preco) {
		super(endereco, preco);
		// TODO Auto-generated constructor stub
	}

	public void precoAdicional(float valor)
	{
		float total = getPreco() + valor;
		setPreco(total);
	}
	
	
	
}
