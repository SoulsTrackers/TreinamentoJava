package br.com.meta.aula3.exercicio3;

public class Animal {

	private String nome;
	private int    comprimento;
	private int    patas;
	private String cor;
	private String ambiente;
	private float  velocidade;
	
	

	public Animal(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade) {
		
		this.nome 		 = nome;
		this.comprimento = comprimento;
		this.patas 		 = patas;
		this.cor 		 = cor;
		this.ambiente	 = ambiente;
		this.velocidade  = velocidade;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getComprimento() {
		return comprimento;
	}



	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}



	public int getPatas() {
		return patas;
	}



	public void setPatas(int patas) {
		this.patas = patas;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getAmbiente() {
		return ambiente;
	}



	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}



	public float getVelocidade() {
		return velocidade;
	}



	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}



	public void alteraNome(String nome)
	{
		this.nome = nome;
	}

	public void alteraComprimento(int comprimento)
	{
		this.comprimento = comprimento;
	}
	
	public void alteraPatas(int patas)
	{
		this.patas = patas;
	}
	
	public void alteraCor(String cor)
	{
		this.cor = cor;
	}
	
	public void alteraAmbiente(String ambiente)
	{
		this.ambiente = ambiente;
	}
	
	public void alteraVelocidade(float velocidade)
	{
		this.velocidade = velocidade;
	}
	
	public  String dados() 
	{
		return "Animal: "		+ this.nome 
			 + "\nComprimento:" + this.comprimento + " cm"
			 + "\nPatas: "      + this.patas
			 + "\nCor: "	    + this.cor
			 + "\nAmbiente: "   + this.ambiente
			 + "\nVelocidade: " + this.velocidade + " m/s";
	}
}
