package br.com.meta.aula3.exercicio3;

public class Mamifero extends Animal{
	
	private String alimento;
	
	

	public Mamifero(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade,
			String alimento) 
	{
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}
	
	public Mamifero(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade) 
	{
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		
	}
	
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void alteraAlimento(String alimento)
	{
		this.alimento = alimento;
	}

	public String alimento() 
	{
		if(this.alimento != null)
			return "\nAlimento: " + this.alimento;
		else 
			return "";
	}


	@Override
	public  String dados()
	{
		return   "Animal: "	      + super.getNome()
			   + "\nComprimento:" + super.getComprimento() + " cm"
			   + "\nPatas: "      + super.getPatas()
			   + "\nCor: "	      + super.getCor()
			   + "\nAmbiente: "   + super.getAmbiente()
			   + "\nVelocidade: " + super.getVelocidade() + " m/s"
			   + alimento();
			
		}
	
	

}
