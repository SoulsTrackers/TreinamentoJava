package Exercicio5;



import java.util.ArrayList;

public class Casa {
    
    private ArrayList<Porta> portas;
    private String cor;
    private int totalPortas;
    
    
        public Casa()
    {
        this.portas = new ArrayList<Porta>();
        
    }

    public Casa(String cor) {
        this.portas = new ArrayList<Porta>();
        this.cor = cor;
    }
        


    public void AddPorta(Porta porta)
    {
        this.portas.add(porta);
    }
    
    
    public void pinta(String cor)
    {
        this.cor = cor;
    }
    
    public String retornaCor()
    {
        return cor;
    }
    
    public int quantasPortasEstaoAbertas()
    {
        int qtdPortasAbertas = 0;
        for (Porta p : portas)
        {
            if(p.isAberta())
                qtdPortasAbertas++;
        }
        
        return qtdPortasAbertas;
    }
    
    
    public int totalDePortasFechadas()
    {
        int qtdPortasFechadas = 0;
        
        for (Porta p : portas)
        {
            if(p.isAberta()==false)
                qtdPortasFechadas++;
        }
        return qtdPortasFechadas;
    }
    
         
    public int totalPortas()
    {   
        for(Porta p : portas)
        {
            totalPortas++;
        }
        return totalPortas;
    } 
}


