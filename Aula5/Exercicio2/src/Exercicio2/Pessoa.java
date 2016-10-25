
package Exercicio2;

public class Pessoa {
    
	private String nome;
    private String endereco;
    private int    telefone;

    public Pessoa() 
    {
    	
    }

    public Pessoa(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }
   
    public String imprimir()
    {    
         return "Nome: " + nome + " | Endereço: " +  endereco + " | Telefone: " + Integer.toString(telefone);
    }

    
}