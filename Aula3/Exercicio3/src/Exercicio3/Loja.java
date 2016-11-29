package Exercicio3;

import java.util.ArrayList;

public class Loja {
	
	private double margemDeLucro;
	private double lucro;
	private double total;
	double totalLucro;
	private ArrayList<Produto> produto;

	public Loja() {
		produto = new ArrayList<>();
	}

	public double getMargemDeLucro() {
		return margemDeLucro;
	}

	public void setMargemDeLucro(double margemDeLucro) {
		this.margemDeLucro = margemDeLucro;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	
	
	
	
	
	
	public void addProduto(Produto produtos)
	{
		produto.add(produtos);
	}

	
	
	public String margemLucro()
	{ 	

		int lucro20 =0;
		int lucro21 =0;
		int lucro10 =0;
		
		for(Produto produto : produto)
		{

			this.lucro = produto.getPrecoVenda() - produto.getPrecoCompra();
			this.margemDeLucro = (lucro / produto.getPrecoCompra())*100;
			
			if(this.margemDeLucro <10)
			{
				lucro10+=1;
				
			}
			if (this.margemDeLucro >= 10 && margemDeLucro <=20)
			{
				lucro20 += 1;
			}
			if (margemDeLucro >20)
			{
				lucro21+=1;
				
			}
		}
			
		return "Lucro 10%: " + lucro10 + "\nLucro 10% - 20%: " + lucro20+ "\nLucro maior que 20%: " + lucro21;
	}
	
	
	
	
	public String calculaTotalDeVendas()
	{	total=0;
		double venda;
		for(Produto prod : produto)
		{
			venda  =  prod.getPrecoVenda();
			total += venda;
		}
		return "Valor total de vendas: " + total;
	}
	
	public String calculaTotalDeCompras()
	{	
		double compra;
		for(Produto produto : produto)
		{
			compra  = produto.getPrecoCompra();
			total  += compra;
		}
		
		return "Valor total de Compras: " + total;
	}
	
	public String calculaTotalDeLucro()
	{	
		
		for(Produto produto : produto)
		{
			this.lucro = produto.getPrecoVenda() - produto.getPrecoCompra();
			totalLucro = totalLucro + this.lucro;
		}
		return "Valor total de lucro: " + totalLucro;
	}
}
