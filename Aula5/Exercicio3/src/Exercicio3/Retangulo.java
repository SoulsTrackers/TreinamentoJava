
package Exercicio3;


public class Retangulo {
    
    private double comprimento;
    private double largura;
    private double area;
    private double perimetro;
    
    

    public Retangulo(double comprimento, double largura) 
    {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public void calcularArea()
    {
        this.area = this.comprimento * this.largura;
    }
    
    public void calcularPerimetro()
    {
        perimetro = (2 * this.comprimento) + (2 * this.largura);
    }
    
    
    public String imprimir()
    {
        return "Area: " + this.area + " | Perimetro: " + this.perimetro;
    }   
    
    
    public void calcularTudo()
    {
        this.calcularArea();
        this.calcularPerimetro();
    }
    
    public void setDados(double comprimento)
    {
        this.comprimento = comprimento;
    }
            
    public void setDados(double area,double largura)
    {
        this.area = area;
        this.largura = largura;
    }
    
    public void setDados(double perimetro, double area, double largura)
    {
        this.area = area;
        this.perimetro = perimetro;
         this.largura = largura;
    }
    
    public void setDados(double comprimento, double largura, double area, double perimetro) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.area = area;
        this.perimetro = perimetro;
    }           
}
