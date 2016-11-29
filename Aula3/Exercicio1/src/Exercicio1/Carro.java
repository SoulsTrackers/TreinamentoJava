package Exercicio1;

public class Carro {
	
	private String    modelo;
	private double    qtdModelo;
	private double    qtdTotalComDefeito;
	

	public Carro(String modelo, double qtdModelo) 
	{
		super();
		this.modelo    = modelo;
		this.qtdModelo = qtdModelo;
	}

	public Carro(double qtdTotalComDefeito)
	{
		this.qtdTotalComDefeito = qtdTotalComDefeito;
	}
	
	
	
	public double getQtdTotalComDefeito() 
	{
		return qtdTotalComDefeito;
	}

	public void setQtdTotalComDefeito(double qtdTotalComDefeito)
	{
		this.qtdTotalComDefeito = qtdTotalComDefeito;
	}

	
	public String getModelo() 
	{
		return modelo;
	}
	
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	
	public double getQtdModelo() 
	{
		return qtdModelo;
	}
	
	public void setQtdModelo(double qtdModelo) 
	{
		this.qtdModelo = qtdModelo;
	}
	

	
	
}
