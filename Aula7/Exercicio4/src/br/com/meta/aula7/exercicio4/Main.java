package br.com.meta.aula7.exercicio4;

public class Main {
	public static void main(String[] args) {
		Funcionario vendedor = new Vendedor("Manolo", 9999, 1500, 500);
		Funcionario admin    = new Administrador("Admin", 999, 1500,10);
		
		System.out.println(vendedor.imprimeSalario());
		
		
		System.out.println(admin.imprimeSalario());
		
	}
}
