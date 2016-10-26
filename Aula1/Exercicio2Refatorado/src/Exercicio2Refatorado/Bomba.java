package Exercicio2Refatorado;

public class Bomba {
    private Combustivel combustivel;

    private float qtdLitros;
    
    public float getQtdLitros() {
        return qtdLitros;
    }

   
    public void setQtdLitros(float qtdLitros) {
        this.qtdLitros = qtdLitros;
    }

   
    public Combustivel getCombustivel() {
        return combustivel;
    }

    
    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
    
        
    public float calcularValor() {

        float valorTotal = 0f;

        if(qtdLitros < 10)
        {
            valorTotal = qtdLitros * combustivel.getPreco();
        }
        else
        {
            valorTotal = qtdLitros * combustivel.getPrecoDesconto();
        }

        return valorTotal;
    }


    public float CalcularTotal()
    {
        float valorTotal = 0;

        {
            valorTotal += calcularValor();
        }

        if(valorTotal > 70)
            valorTotal *= 0.9;

        return valorTotal;
    }
    
    
}