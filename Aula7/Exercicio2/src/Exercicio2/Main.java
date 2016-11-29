package Exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		Ingresso normal = new Normal(50);
		
		System.out.println("Digite 1 para ingresso normal ou 2 para ingresso VIP");
		int opcao = input.nextInt();
		
		
		switch(opcao)
		{
			case 1: 
				System.out.println(((Normal) normal).imprimeNormal() + " | Valor R$ " + normal.getValor());
				break;
				
			case 2: 
				System.out.println("Voce escolheu o ingresso VIP, Digite 1 para Camarote Superior e 2 para Camarote Inferior");
				int opcaoVip = input.nextInt();
				Ingresso vip = new Vip(normal.getValor());
				((Vip) vip).valorAdicional(50);
				
				switch(opcaoVip)
				{
					case 1:
						Vip camaroteSuperior = new CamaroteSuperior(vip.getValor(), "Camarote Superior");
						((CamaroteSuperior) camaroteSuperior).valorAdicional(20);
						System.out.println(((CamaroteSuperior) camaroteSuperior).getInformacoes());
						break;
						
					case 2: 
						Vip camaroteInferior = new CamaroteInferior(vip.getValor(), "Camarote inferior");
						System.out.println(((CamaroteInferior)camaroteInferior).getInformacoes());
						break;
				}
			default:
				break;
		}
		
		
	}
}
