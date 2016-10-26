package Exercicio3;


public class Quadrado {
    private double lado;
   
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
    
    public double area()
    {
        double area;
        area = Math.pow(getLado(),2);
        return area;
    }
    
    public double perimetro()
    {
        double perimetro;
        perimetro = 4 * lado;
        return perimetro;
    
    }
}
