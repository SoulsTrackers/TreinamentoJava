package Exercicio1;

import java.util.ArrayList;

public class Montadora {
	
	private double 	 total;
	private double	 totalComDefeitoX;
	private double   totalComDefeitoY; 
	private ArrayList<Carro> carro;
	
	
	
	public double getTotalComDefeitoX() 
	{
		return totalComDefeitoX;
	}

	public void setTotalComDefeitoX(double totalComDefeitoX) 
	{
		this.totalComDefeitoX = totalComDefeitoX;
	}

	public double getTotalComDefeitoY() 
	{
		return totalComDefeitoY;
	}

	public void setTotalComDefeitoY(double totalComDefeitoY) 
	{
		this.totalComDefeitoY = totalComDefeitoY;
	}



	
	public Montadora()
	{
		carro = new ArrayList<>();
	
	}
 	
	
	public void addCarro(Carro carros)
	{
		carro.add(carros);
	}
		
	
	
	public String carroComDefeitos(double porcentagem, String modelo)
	{	
		porcentagem = porcentagem /100;
		for(Carro carro : carro)
		{
			if(carro.getModelo().equals(modelo))//COMPARA SE TEM O MODELO DIGITADO
			{
				double qtdCar = carro.getQtdModelo(); //ATRIBUI
				total = qtdCar * porcentagem;
				setTotalComDefeitoX(total);
				return "Carros do modelo " + carro.getModelo() + " Com defeito: " + total;
			}			
		}
		return "Nao foi encontrado";
	}
	
	
	
	
	public String carroSemDefeitos(double porcentagem, String modelo)
	{
		porcentagem = porcentagem /100;
		
		for(Carro carro : carro)
		{
			if(carro.getModelo().equals(modelo))
			{
				double qtdCar = carro.getQtdModelo();
				total = qtdCar * porcentagem;
				total = qtdCar - total;
				setTotalComDefeitoY(total);
				return "Carros do modelo " + carro.getModelo() + " com defeitos " + total;	
			}
			
		}
		return "Nao foi encontrado carro desse modelo!";
	}
	
	
	
	public String totalDeCarrosComDefeito()
	{	
		double totalComDefeito=0;
		total=0;
		for(Carro carro: carro)
		{
			total += carro.getQtdModelo();
			totalComDefeito = this.getTotalComDefeitoX() + this.getTotalComDefeitoY();
			totalComDefeito = (totalComDefeito *100) / total; 
			
		}
		
		return "Total de carros com defeitos " + totalComDefeito +"%";
	}
	
}
