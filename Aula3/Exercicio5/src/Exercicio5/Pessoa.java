package Exercicio5;

public class Pessoa {
	private boolean  sexo;
	private boolean resposta;
	
	
	public Pessoa(boolean sexo, boolean resposta) {
		super();
		this.sexo = sexo;
		this.resposta = resposta;
	}

	

	public boolean isSexo()
	{
		return sexo;
	}

	public void setSexo(boolean sexo)
	{
		this.sexo = sexo;
	}

	public boolean isResposta() 
	{
		return resposta;
	}
	
	public void setResposta(boolean resposta) 
	{
		this.resposta = resposta;
	}
}
