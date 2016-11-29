package Exercicio2;

public class Calcula {
	
	private int maior=0;
	private int menor=10000000;
	private int total;
	private int i=0;
	
	
	
	private int num;
	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
		if(num>maior)
			maior = num;
		if(num>=0 && num <menor)
			menor = num;
	}



	
	public int maiorNum()
	{
		
		return maior;
	}
	
	public int menorNum()
	{
		return menor;
	}
	
	public int media()
	{	
		i+=1;
		total += num;
		return total/i;
	}
}
