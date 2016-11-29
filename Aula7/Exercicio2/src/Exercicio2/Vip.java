package Exercicio2;

public class Vip extends Ingresso{
	
	public Vip(double valor) {
		super(valor);
	}

		
	//Metodos
	public void valorAdicional(double valor)
	{
		double total = valor + this.getValor();
		setValor(total);
	}
	
	public String getInformacoes()
	{
		return  "Valor e R$ " + this.getValor();
	}
}
