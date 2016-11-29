package Exercicio2;

public class CamaroteSuperior extends Vip{
	
	private String local;
	
	public CamaroteSuperior(double valor, String local)
	{
		super(valor);
		this.local = local;
	}
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	

	public void valorAdicional(double valor)
	{
		double total = this.getValor() + valor;
		setValor(total);
	}
	
	@Override
	public String getInformacoes()
	{
		return  this.getLocal() + " | " + super.getInformacoes();
	}
		
}
