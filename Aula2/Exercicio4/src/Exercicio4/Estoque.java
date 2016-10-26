package Exercicio4;


public class Estoque {
    
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    private int qtd;
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getQtdAtual() {
        return qtdAtual;
    }

  
    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
        
    }

   
    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

      public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
    public void mudarNome(String nome)
    {
       setNome(nome);
    }
    
    
    public void mudarQtdMinima(int qtdMinima)
    {
        
        setQtdMinima(qtdMinima);
    }
    
    
    public void repor(int qtd)
    {
        setQtdAtual(qtdAtual + qtd);
    }
    
    
    public boolean darBaixa(int qtd)
    {   
        if (!testarSaldo(qtd))
            return false;
        
        setQtdAtual(qtdAtual - qtd);
    
        return true;
    }
    
    public boolean testarSaldo(int qtd)
    {
        return (qtdAtual >=qtd && qtdAtual >0);
    }
    
    public String mostra()
    {   
        
        String mostra = "Nome: " + getNome() + " Atual: " + Integer.toString(getQtdAtual()) + " Qtd Minima: " + getQtdMinima();
        return mostra;
    }
    
    public boolean precisaRepor()
    {
 
        return (getQtdAtual() <= getQtdMinima());
    }
    
}

