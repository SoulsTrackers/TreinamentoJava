package Exercicio1Refatorado;

public class Candidato {
	private String nomeCandidato;
	private int anoNascimento;
	private int anoAtual;
	private int codigoCandidato;
	private int primeiraNota;        
	private int tempoExperiencia;
	private int horasQualificacao;
	private int idade;
	
	
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int getAnoAtual() {
		return anoAtual;
	}
	
	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	
	public int getCodigoCandidato() {
		return codigoCandidato;
	}
	
	public void setCodigoCandidato(int codigoCandidato) {
		this.codigoCandidato = codigoCandidato;
	}
	
	public int getPrimeiraNota() {
		return primeiraNota;
	}
	
	public void setPrimeiraNota(int primeiraNota) {
		this.primeiraNota = primeiraNota;
	}
	
	public int getTempoExperiencia() {
		return tempoExperiencia;
	}
	
	public void setTempoExperiencia(int tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
	
	public int getHorasQualificacao() {
		return horasQualificacao;
	}
	
	public void setHorasQualificacao(int horasQualificacao) {
		this.horasQualificacao = horasQualificacao;
	}
	
	
	
	public int idade()
	{
	    return idade = anoAtual - anoNascimento;
	}
	
	
	public String imprimirResultado()
	{
        String mensagem = "Nome: " +nomeCandidato +  " | Codigo: " + codigoCandidato +  " | Idade: " + idade + "\n";        				  
        
        if(primeiraNota >= 8 || (tempoExperiencia >=2 && idade() <= 30) || horasQualificacao >= 1000)
        {
        	mensagem += "Está aprovado para a terceira etapa";
        }
        else
        {
        	mensagem += "Reprovado";
        }
        
        return mensagem;
       
	}






}
