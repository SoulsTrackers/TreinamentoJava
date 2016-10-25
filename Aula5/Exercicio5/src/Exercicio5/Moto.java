
package Exercicio5;


public class Moto {
    private String marca;
    private String modelo;
    private String cor;
    private int marcha;

    public Moto(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = 0;
    }
    
    
    
    public String imprimir()
    {  
        return "Marca: " + this.marca + " | Modelo: " + this.modelo + " | Cor: " + this.cor + " | Marcha: " + Integer.toString(this.marcha);
    }
}
