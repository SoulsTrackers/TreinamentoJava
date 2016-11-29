package br.com.meta.aula7.exercicio4;

public class Vendedor extends Funcionario{
	
	private double valorTotalDeVendas;
	
	public Vendedor(String nome, int rg, double salario, double valorTotalDeVendas) {
		super(nome, rg, salario);
		this.valorTotalDeVendas = valorTotalDeVendas;
	}


	
	public void SalarioTotal()
	{
		double totalDeVendas = this.valorTotalDeVendas;
		totalDeVendas = totalDeVendas * 0.05d;
		double salario = this.getSalario();
		salario +=totalDeVendas;
		setSalario(salario);
		
	}
	
	@Override
	public String imprimeSalario()
	{
		SalarioTotal();
		return "Nome: " + super.getNome() + "\nSalario R$ " + super.getSalario();
		
	}
	
	

}
