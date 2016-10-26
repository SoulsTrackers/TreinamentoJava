package Exercicio1;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args)
    {
        Scanner input    = new Scanner(System.in);
        Pessoa objPessoa = new Pessoa();
        
        System.out.println("Informe seu nome: ");
        objPessoa.setNome(input.next());
        
        System.out.println("Informe a idade: ");
        objPessoa.setIdade(input.nextInt());
        objPessoa.fazAniversario();
        System.out.println(objPessoa.retornaNomeIdade());
    
    }  
}
