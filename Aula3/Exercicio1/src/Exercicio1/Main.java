package Exercicio1;

public class Main {
	public static void main(String[] args) {
		
		
		Montadora montadora = new Montadora();	
		montadora.addCarro(new Carro("modeloX", 120));
		montadora.addCarro(new Carro("modeloY", 40));
		
		

		System.out.println(montadora.carroComDefeitos(30, "modeloX"));		
		System.out.println(montadora.carroSemDefeitos(50, "modeloY"));		
		System.out.println(montadora.totalDeCarrosComDefeito());
		
	}
	
	
}
