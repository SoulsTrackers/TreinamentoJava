package Exercicio2Refatorado;


public class Combustivel {
    private Bomba bomba;
    private float Preco;
    private float PrecoDesconto;
    
   
    public float getPreco() {
        return Preco;
    }

   
    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    
    public float getPrecoDesconto() {
        return PrecoDesconto;
    }

  
    public void setPrecoDesconto(float PrecoDesconto) {
        this.PrecoDesconto = PrecoDesconto;
    }


	public Bomba getBomba() {
		return bomba;
	}


	public void setBomba(Bomba bomba) {
		this.bomba = bomba;
	}
    
}