package Exercicio2Refatorado;

import java.util.Scanner;


public class Main {
    
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Combustivel gasolina = new Combustivel();       
        Bomba bombaGasolina = new Bomba();
        bombaGasolina.setCombustivel(gasolina);
        
        Combustivel alcool = new Combustivel();
        Bomba bombaAlcool  = new Bomba();
        bombaAlcool.setCombustivel(alcool);
        
        System.out.println("Digite 1 para Gasolina e 2 para Alcool");
        int opcao = input.nextInt();
            
        switch(opcao){
        
            case 1:
                System.out.println("Informe a quantida de gasolina em litros: ");
                bombaGasolina.setQtdLitros(input.nextFloat());

                System.out.println("Informe o preco: ");
                gasolina.setPreco(input.nextFloat());
                    
                System.out.println("Informe o preco de desconto: ");               
                gasolina.setPrecoDesconto(input.nextFloat());
                    
                bombaGasolina.calcularValor();
                System.out.println("Valor total é R$: " + bombaGasolina.CalcularTotal());
                break;
            
            case 2: 
                System.out.println("Informe a quantidade de alcool em litros: ");              
                bombaAlcool.setQtdLitros(input.nextFloat());
                    
                System.out.println("Informe o preco: ");
                alcool.setPreco(input.nextFloat());
                    
                System.out.println("Informe o desconto: ");
                alcool.setPrecoDesconto(input.nextFloat()); 
                    
                System.out.println("Valor total é R$: " + bombaAlcool.CalcularTotal());     
                break;
                
            default:
                System.out.println("Opcao invalida");

        }
    }           
}
