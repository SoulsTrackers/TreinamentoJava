
package Exercicio1;


import java.util.Scanner;

public class Main {
	
		public static void main(String[] args)
		{
			
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("Digite o nome do candidato: ");
			String nomeCandidato = input.next();
			
		    
			System.out.println("Digite o ano de nascimento: ");
		    	int anoNascimento = input.nextInt();        
		        

			System.out.println("Digite o ano atual: ");
			int anoAtual = input.nextInt();
			int idade    = anoAtual - anoNascimento;


			System.out.println("Digite o codigo do candidado:");
			int codigoCandidato = input.nextInt();


			System.out.println("Digite a nota da primeira etapa:");
			int primeiraNota = input.nextInt();


			System.out.println("Digite o tempo de experiencia:");
			int tempoExperiencia = input.nextInt();


			System.out.println("Digite a quantidade de horas em curso de qualificacao:");
			int horasQualificacao = input.nextInt();




			String mensagem = "Nome: " +nomeCandidato +  " | Codigo: " + codigoCandidato +  " | Idade: " + idade + "\n";        				  

			if(primeiraNota >= 8 || (tempoExperiencia >=2 && idade <= 30) || horasQualificacao >= 1000)
			{
				mensagem += "Está aprovado para a terceira etapa";
			}
			else
			{
				mensagem += "Reprovado";
			}

			System.out.println(mensagem);        
		}


}
