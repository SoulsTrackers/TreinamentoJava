package Exercicio6;

public class Curso {
	
	private int codigo;
	private int numDeVagas;
	private int qtdCandidatoMasc;
	private int qtdCandidatoFem;
	
	
	public Curso(int codigo, int numDeVagas, int qtdCandidatoMasc, int qtdCandidatoFem) 
	{
		super();
		this.codigo 		  = codigo;
		this.numDeVagas 	  = numDeVagas;
		this.qtdCandidatoMasc = qtdCandidatoMasc;
		this.qtdCandidatoFem  = qtdCandidatoFem;
	}


	
	
	
	public int getCodigo() 
	{
		return codigo;
	}
	
	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}
	
	public int getNumDeVagas() 
	{
		return numDeVagas;
	}
	
	public void setNumDeVagas(int numDeVagas) 
	{
		this.numDeVagas = numDeVagas;
	}
	
	public int getQtdCandidatoMasc()
	{
		return qtdCandidatoMasc;
	}
	
	public void setQtdCandidatoMasc(int qtdCandidatoMasc)
	{
		this.qtdCandidatoMasc = qtdCandidatoMasc;
	}
	
	public int getQtdCandidatoFem() 
	{
		return qtdCandidatoFem;
	}
	
	public void setQtdCandidatoFem(int qtdCandidatoFem) 
	{
		this.qtdCandidatoFem = qtdCandidatoFem;
	}
	
	
	
	
	
}
