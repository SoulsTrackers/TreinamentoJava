package Exercicio2;

public class Ingresso {
	

	private double valor;
	
	public Ingresso(double valor) {
		super();
		this.valor = valor;
	}

	
	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}


	//METODOS
	
	public String imprimeValor()
		{
		return "O valor e: " + getValor();
	}
}
