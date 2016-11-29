package Exercicio6;

import java.util.ArrayList;

public class Universidade {
	
	private int    totalCandidatos;
	private int    totalPorcent;
	private double totalPorVaga;
	private int    cod;
	private ArrayList<Curso> curso;
	
	
	
	public double getTotalPorVaga() {
		return totalPorVaga;
	}


	public void setTotalPorVaga(double totalPorVaga) {
		this.totalPorVaga = totalPorVaga;
	}



	public Universidade() {
		super();
		curso = new ArrayList<>();
	}
	
	
	public void addCurso(Curso cursos)
	{
		curso.add(cursos);
	}
	
	
	public String candidatosPorVaga()
	{
		
		
		for(Curso candidatos : curso)
		{
			this.totalCandidatos = candidatos.getQtdCandidatoFem() + candidatos.getQtdCandidatoMasc();
			this.totalPorVaga 	 = this.totalCandidatos / candidatos.getNumDeVagas(); 
			this.totalPorcent    = (candidatos.getQtdCandidatoFem() * 100) / this.totalCandidatos;
			
			
			System.out.println(    "Codigo do curso: " 							  + candidatos.getCodigo() 
								 + "\nNumero de vagas: "                          + candidatos.getNumDeVagas()
								 + "\nTotal de Candidatos: " 			 		  + this.totalCandidatos 
								 + "\nTotal de candidatos por vaga: " 			  + this.totalPorVaga 
								 + "\nPercentagem de candidatos do sexo Femino: " + this.totalPorcent + "%"	
								 + "\n\n"
							  );
		}
		
		return "";
		
	}
	
	
	public String maiorNumDeCandPorVaga()
	{
		double maior=0;
		
		for(Curso candidatos : curso)
		{
			this.totalCandidatos = candidatos.getQtdCandidatoFem() + candidatos.getQtdCandidatoMasc();
			this.totalPorVaga 	 = this.totalCandidatos / candidatos.getNumDeVagas();
			
			if(this.totalPorVaga >maior)
			{
				maior = this.totalPorVaga;
				cod   = candidatos.getCodigo();
				
			}
		}
		return "Codigo do curso: " + cod + "\nCandidatos por vaga: " + maior;
	}

	public String totalDeCandidatos()
	{
		int total=0;
		for(Curso candidatos : curso)
		{
			this.totalCandidatos = candidatos.getQtdCandidatoFem() + candidatos.getQtdCandidatoMasc();
			total= total + this.totalCandidatos;
	
		}
		return "Total de candidatos: " + total;
	}
}
