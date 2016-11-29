package Exercicio9;

public class verificaFinanciamento {
	
	private double salario;
	private double financiamento;
	private String mensagem;
	
	
	
	public verificaFinanciamento(double salario, double financiamento) {
		super();
		this.salario = salario;
		this.financiamento = financiamento;
	}



	public String verificaFinanciamento()
	{
		salario *=5;
		if(financiamento <= salario)
			
			mensagem = "Financiamento concedido!";
			
		else
			mensagem = "Financiamento Negado!"; 
		
		return mensagem + "\nObrigado por nos consultar!";
	}
	
	
}
