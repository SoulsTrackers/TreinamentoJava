package br.com.meta.aula7.exercicio4;

public class Administrador extends Funcionario{

	private double horaExtra;

	public Administrador(String nome, int rg, double salario, double horaExtra) {
		super(nome, rg, salario);
		this.horaExtra = horaExtra;
	}
	
	public double calculaSalario()
	{
		 return horaExtra *= (super.getSalario() * 0.01d); 
	}
	
	@Override
	public String imprimeSalario()
	{
		return "Nome: " + super.getNome() + "Salario: " +  (calculaSalario() + super.getSalario());
	}
}
