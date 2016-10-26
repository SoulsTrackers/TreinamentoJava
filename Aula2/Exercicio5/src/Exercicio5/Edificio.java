package Exercicio5;


import java.lang.reflect.Array;
import java.util.ArrayList;


public class Edificio {
    
    private String cor;
    private int totalDePortas;
    private int totalDeAndares;
    private int totalPortas;
    
    private ArrayList<Porta> porta;
    private ArrayList<Andar> andar;

    
    public Edificio() {
        this.porta = new ArrayList<Porta>();
        this.andar = new ArrayList<Andar>();
    }

    public Edificio(String cor) {
        this.porta = new ArrayList<>();
        this.andar = new ArrayList<>();
        this.cor = cor;
      
    }
    
       
    //METODOS
    
    public void pinta(String cor)
    {
        this.cor = cor;
    }
    
    
    public String cor()
    {
        return cor;
    }
    
    
    public void addAndar(Andar andar)
    {
        this.andar.add(andar);
    }
    
    
    public int totalDeAndares()
    {
        for(Andar andar : andar)
        {
            totalDeAndares++;
        }
        return totalDeAndares;
    }
    
    
    public void addPorta(Porta porta)
    {
        this.porta.add(porta);
       
    }
     
    public int totalPortas()
    {   
        for(Porta p : porta)
        {
            totalPortas++;
        }
        return totalPortas;
    }   
        
    
    public int quantasPortasEstaoAbertas()
    {
        int totalAbertas = 0;
        for(Porta porta : porta)
        {
            if(porta.isAberta())
               totalAbertas++;
        }
        return totalAbertas;
    }
}   
    
   
    
     
    
