package Exercicio5;

import java.util.ArrayList;

public class Empresa {
	
	private int totalSim;
	private int totalNao;
	private int masculino;
	private int feminino;
	private ArrayList<Pessoa> pessoa;
	

    public int getTotalSim() 
	{
		return totalSim;
	}

	public int getTotalNao() 
	{
		return totalNao;
	}
	
	public Empresa() 
	{
		pessoa = new ArrayList<>();
	}
		
	public void addPessoa(Pessoa pessoas)
	{
		pessoa.add(pessoas);
	}
	
	
	
	
	public String calculaResposta()
	{
		for(Pessoa pessoa : pessoa)
		{
			if(pessoa.isResposta())
			{
				this.totalSim += 1;
			}
			else
			{
				this.totalNao += 1;
			}
		}
		return "Total de votos Sim: " + this.totalSim + "\nTotal de votos Não: " + this.totalNao;
	}
	
	public String calculaPorcentagem()
	{	
		this.totalSim = 0;
		this.totalNao = 0;
		for(Pessoa pessoa : pessoa)
		{
			if(pessoa.isSexo()==true)
			{
				this.masculino +=1;
			}
			
			if(pessoa.isSexo()==true && pessoa.isResposta()==false)
			{
				this.totalNao  += 1;
			}
			
			//total Feminino
			if(pessoa.isSexo() == false)
			{
				this.feminino += 1;
			}
			
			if(pessoa.isSexo()== false && pessoa.isResposta()== true )
			{
				
				this.totalSim += 1;
			}
		}
		
		double porcentagemFem  = (this.totalSim * 100) / this.feminino;
		double porcentagemMasc = (this.totalNao * 100) / this.masculino;
		return   "Porcentagem do sexo Feminino que respondeu Sim: "    + porcentagemFem  + "%" 
			   + "\nPorcentagem do sexo Masculino que respondeu Não: " + porcentagemMasc + "%";
		
	}
}
