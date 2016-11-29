package br.com.meta.aula7.exercicio4;

public class Funcionario {


	private String nome;
	private int rg;
	private double salario;
		
	public Funcionario(String nome, int rg, double salario) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario2) {
		this.salario = salario2;
	}
	
	public String imprimeSalario()
	{
		return "Salario R$ " + getSalario();
	}


	
}
