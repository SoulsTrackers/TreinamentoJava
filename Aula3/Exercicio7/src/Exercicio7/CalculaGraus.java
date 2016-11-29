package Exercicio7;

public class CalculaGraus {
	
	private int  f=50;
	private int  c;
	private String a;
	
	public int incremento()
	{
		return f += 2; 
	}
	
	public String calculaGraus()
	{
		
		while(f<=150)
		{
			c = (f-32)*5/9;
			System.out.println("| Graus Fahrenheit: " + f + "  | Graus Celcius: " + c);
			f+=2;
		}
		return " ";
	}


}
