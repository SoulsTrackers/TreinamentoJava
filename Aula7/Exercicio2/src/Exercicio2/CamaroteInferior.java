package Exercicio2;

public class CamaroteInferior extends Vip{
	
	private String local;
	
	
	public CamaroteInferior(double valor, String local) {
		super(valor);
		this.local = local;
	}
	
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	
	//Metodos
	public String getLocalizacao()
	{
		return  this.local;
	}
	
	@Override
	public String getInformacoes()
	{
		return this.getLocal() + " | " + super.getInformacoes();
	}
}
