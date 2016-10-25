
package Exercicio8;


public class Moto {
    
    private String marca;
    private String modelo;
    private String cor;
    private int marcha;
    private int maiorMarcha;
    private int menorMarcha;
    

    public Moto(String marca, String modelo, String cor, int maiorMarcha, int menorMarcha) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = 0;
        this.maiorMarcha = maiorMarcha;
        this.menorMarcha = menorMarcha;
        
    }
    
    
    
    public void marchaAcima()
    {
        if(this.marcha < this.maiorMarcha)
            this.marcha ++;  
        
    }
    
    
    public void marchaAcima(int qtdMarcha)
    {
       int i = 0;
       while(i < qtdMarcha)
       {
           if(marcha < maiorMarcha)
           {
               marcha++;
           }
           i++;
       }         
    }

    
    
    public void marchaAbaixo()
    {
        if(this.marcha > this.menorMarcha)
        {
            this.marcha -= 1;
        }
    }
    
    public void marchaAbaixo(int qtdMarcha)
    {
        int i = 0;
        while(i < qtdMarcha)
        {
            if(marcha > menorMarcha)
            {
                marcha--;
            }    
            i++;
        }
    }        

    public String imprimir()
    {  
        return "Marca: " + this.marca + " | Modelo: " + this.modelo + " | Cor: " + this.cor + " | Marcha: " + Integer.toString(this.marcha) + " | Maior marcha: " + this.maiorMarcha + " | Menor marcha: " + this.menorMarcha;
    }
}


