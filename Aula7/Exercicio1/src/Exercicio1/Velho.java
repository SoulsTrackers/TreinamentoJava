package Exercicio1;

public class Velho extends Imovel {
	
	public Velho(String endereco, float preco) {
		super(endereco, preco);
		// TODO Auto-generated constructor stub
	}

	public void descontoPreco(float valor)
	{
		float total = getPreco() - valor;
		setPreco(total);
	}
	
}
