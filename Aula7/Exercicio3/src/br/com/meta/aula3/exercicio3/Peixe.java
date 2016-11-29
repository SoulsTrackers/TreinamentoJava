package br.com.meta.aula3.exercicio3;

public class Peixe extends Animal{
	
	private Animal peixe;
	private String caracteristica;
	
	

	public Peixe(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade,
				 String caracteristica) 
	{
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;
	}

	public void alteraCaracteristica(String caracteristica)
	{
		this.caracteristica = caracteristica;
	}

	public String caracteristica()
	{
		if(caracteristica != null)
			return "\nCaracteristica: " +caracteristica;
		else
			return "";
	}
	
	@Override
	public  String dados()
	{
		return "Animal: "	    + super.getNome()
			 + "\nComprimento:" + this.getComprimento() + "cm"
			 + "\nPatas: "      + this.getPatas()
			 + "\nCor: "	    + this.getCor()   
			 + "\nAmbiente: "   + this.getAmbiente()
			 + "\nVelocidade: " + this.getVelocidade() + " m/s"
			 + caracteristica();
		
	}

}
