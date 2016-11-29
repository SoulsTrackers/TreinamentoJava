package Exercicio1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Imovel novo = new Novo("Flores da cunha", 250);	
		((Novo) novo).precoAdicional(50);;
		//300
		
		Imovel velho = new Velho("Rua sem nome",250);
		((Velho) velho).descontoPreco(50);
		//200
		
		System.out.println("Digete 1 para novo e 2 para velho");
		int opcao = input.nextInt();
		
		switch(opcao)
		{
			case 1:
				System.out.println(novo.imprimir());
				break;
				
			case 2:
				System.out.println(velho.imprimir());
		}
	}
}