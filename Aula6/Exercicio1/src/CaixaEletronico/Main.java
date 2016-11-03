package CaixaEletronico;

import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		CaixaEletronico caixa = new CaixaEletronico();	
	
//		caixa.addCedulas(new Cedula("Nota50", 50, 60));
//		caixa.addCedulas(new Cedula("Nota20", 20, 20));
//		caixa.addCedulas(new Cedula("Nota10", 10, 10));
//		caixa.addCedulas(new Cedula("Nota5" ,  5, 10));
//		caixa.addCedulas(new Cedula("Nota2" ,  2, 20));	
		
		
		
		for(;;)
		{
			System.out.println(" ______________________"  );
			System.out.println("|                      | ");
			System.out.println("|   ESCOLHA UMA OPCAO  | ");
			System.out.println("|______________________|" );
			System.out.println("\n(1) Administracao: "
							 + "\n(2) Sacar Dinheiro: ");						
			int opcao = input.nextInt();
			input.nextLine();
		
			
				switch(opcao)
				{
					
					case 1:
					{
						System.out.print("Digite a senha: ");
						int senha = input.nextInt();
						
						if(senha == 123)
						{
							System.out.println(" ______________________"  );
							System.out.println("|                      | ");
							System.out.println("|   ESCOLHA UMA OPCAO  | ");
							System.out.println("|______________________|" );
							System.out.println();
							System.out.println("(1) Repor cedulas:");
							System.out.println("(2) Visualizar total disponivel no caixa e quantidade de cedulas: ");
							int opcao2 = input.nextInt();
							input.nextLine();
								
							switch(opcao2)
							{
								case 1:
								{
									int valorNota;
									int qtdCedula;
									System.out.print("Digite o valor da nota: ");
									valorNota = input.nextInt();
									System.out.println();
									System.out.print("Digite a quantidade de cedulas: ");
									qtdCedula = input.nextInt();
									System.out.println();
									
									if (valorNota == 50)
									{
										caixa.addCedulas(new Cedula("Nota50", 50, qtdCedula));
										
									}
									
									else if (valorNota == 20)
									{
										caixa.addCedulas(new Cedula("Nota20", 20, qtdCedula));
										
									}
									
									else if (valorNota == 10)
									{
										caixa.addCedulas(new Cedula("Nota10", 10, qtdCedula));
										
									}
									
									else if (valorNota == 5)
									{
										caixa.addCedulas(new Cedula("Nota5", 5, qtdCedula));
										
									}
									
									else if (valorNota == 2)
									{
										caixa.addCedulas(new Cedula("Nota2", 2, qtdCedula));
										
									}
									
									else
									{
										System.out.println("Cedula Invalida.");
									}
									
									break;
								}
								case 2:
								{
									caixa.getQtdDeCadaCedula();
									System.out.println(caixa.getValorTotalDisponivel());
									break;
									
								}
							}	
						}
						else
						{
							System.out.println("Senha invalida");
						}
						break;
					}
					
					case 2: 
					{
						System.out.println("Cedulas disponiveis para saque: ");
						caixa.cedulasDisponiveisSaque();
						System.out.println();
						System.out.println("Digite o valor para sacar: ");
						int valor = input.nextInt();
						caixa.saque(valor);
						System.out.println();
						break;			
				}
					
			}
		}		
	}
}
