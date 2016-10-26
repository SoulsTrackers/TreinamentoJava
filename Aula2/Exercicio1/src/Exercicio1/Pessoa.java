package Exercicio1;


public class Pessoa {
    
       
    private String nome;
    private int    idade;
 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    
  
    //Metodos
    
    public void fazAniversario()
    {
        idade++;
    }
    
    
    public String retornaNomeIdade()
    {   
        
        String mensagem = "nome " + nome + " idade " + Integer.toString(idade);
        return mensagem;
        
    }        
}
