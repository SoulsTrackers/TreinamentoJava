package Exercicio1Refatorado;

import java.util.Scanner;

public class Main {
	
		public static void main(String[] args)
		{
			Scanner   input     = new Scanner(System.in);
			Candidato candidato = new Candidato();
			
						
			System.out.println("Digite o nome do candidato: ");
			candidato.setNomeCandidato(input.nextLine());		
		    
			System.out.println("Digite o ano de nascimento: ");
		    candidato.setAnoNascimento(input.nextInt());
		        	    
		    System.out.println("Digite o ano atual: ");
		    candidato.setAnoAtual(input.nextInt());
		    
	        System.out.println("Digite o codigo do candidado:");
	        candidato.setCodigoCandidato(input.nextInt());
	        
	        System.out.println("Digite a nota da primeira etapa:");
	        candidato.setPrimeiraNota(input.nextInt());
	        
	        System.out.println("Digite o tempo de experiencia:");
	        candidato.setTempoExperiencia(input.nextInt());
	        
	        System.out.println("Digite a quantidade de horas em curso de qualificacao:");
	        candidato.setHorasQualificacao(input.nextInt());
	        
	        
	        System.out.println(candidato.imprimirResultado());
	        
		}    		
}		