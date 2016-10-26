package Exercicio2;



public class Lampada {
    private boolean ligada;
   
   
    public boolean isLigada() {
        return ligada;
    }

    
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    
       
    public void liga()
    {        
        setLigada(true);
    }
    
    
    public void desliga()
    {
        setLigada(false);
    }
    
    public String observa()
    {
         
        return (isLigada()) ? "Ligada" : "Desligada";
    }        
}
