
package Exercicio4;


public class Moto {
    private String marca;
    private String modelo;
    private String cor;
    private int marcha;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
        
    public String imprimir()
    {  
        return "Marca: " + getModelo() + " | Modelo: " + getModelo() + " | Cor: " + getCor() + " | Marcha: " + Integer.toString(getMarcha());
    }
}
