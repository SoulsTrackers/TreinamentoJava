package Exercicio2;

import java.util.Scanner;

public class Main {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		Calcula calcula = new Calcula();
		
		System.out.println("Digite um numero positivo ou -1 para sair");
		
		for(;;)
		{
				
				
				System.out.println("Digite um novo numero positivo: ");
				calcula.setNum(input.nextInt());	
				input.nextLine();
				
				if(calcula.getNum()>=0)
				{
						calcula.maiorNum();
						calcula.menorNum();
						calcula.media();		
				}
				
				else
				{
					System.out.println(	  "Maior: "   + calcula.maiorNum() 
					+ "\nMenor: " + calcula.menorNum() 
					+ "\nMedia: " + calcula.media());	
					break;
				}
		}					
	}

}
