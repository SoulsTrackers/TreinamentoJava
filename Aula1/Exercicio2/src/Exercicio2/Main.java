package Exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de litros de gasolina: ");
		float qtdGasolina = input.nextFloat();
		
		System.out.println("Digite a quantidade de litros de alcool: ");
		float qtdAlcool = input.nextFloat();
		
		
		
		float valorTotalGasolina = qtdGasolina * 3.39f;		
		if (valorTotalGasolina > 70)
		{
			float descTotalGasolina = (valorTotalGasolina * 10)/100;
			valorTotalGasolina = valorTotalGasolina - descTotalGasolina;
		}
		
		
		float valorTotalAlc = 0;
		if(qtdAlcool > 10)
		{
			valorTotalAlc = qtdAlcool * 2.10f;
		}
		else
			valorTotalAlc = qtdAlcool * 2.57f;
		
		if(valorTotalAlc > 70)
		{
			float descTotalAlcool = (valorTotalAlc * 10) / 100;
			valorTotalAlc = valorTotalAlc - descTotalAlcool;
		}
	
		System.out.println("o Valor total da Gasolina é: " + valorTotalGasolina + "\n");
		System.out.println("O valor total do Alcool é: " + valorTotalAlc);
	}
}
