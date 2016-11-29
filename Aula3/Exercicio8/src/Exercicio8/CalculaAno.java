package Exercicio8;

public class CalculaAno {
	
	private int ano;
		
	public CalculaAno() 
	{
	
	}


	public String verificaAno(int ano)
	{
		
		if (ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0))
		{
			return "Ano bissexto";
		}
		return "Nao é bissexto";
	}
}
