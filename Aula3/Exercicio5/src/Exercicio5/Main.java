package Exercicio5;

public class Main {
	public static void main(String[] args) {
		

	


		Empresa empresa = new Empresa();
		
		//Masculino = true, Feminino = false, Sim = true, Nao = false;
		empresa.addPessoa(new Pessoa(true , true ));
		empresa.addPessoa(new Pessoa(true , false));
		empresa.addPessoa(new Pessoa(false, false));
		empresa.addPessoa(new Pessoa(false, true ));
		empresa.addPessoa(new Pessoa(false, true ));
		empresa.addPessoa(new Pessoa(false, false));
		empresa.addPessoa(new Pessoa(true , true ));
		empresa.addPessoa(new Pessoa(true , true ));
		empresa.addPessoa(new Pessoa(true , false));
		empresa.addPessoa(new Pessoa(true , false));
		empresa.addPessoa(new Pessoa(true , true ));
		empresa.addPessoa(new Pessoa(false, true ));
		empresa.addPessoa(new Pessoa(false, false));
		empresa.addPessoa(new Pessoa(true , true ));
		empresa.addPessoa(new Pessoa(false, true ));
		empresa.addPessoa(new Pessoa(false, true ));
		empresa.addPessoa(new Pessoa(true , true ));
		empresa.addPessoa(new Pessoa(true , true ));
		empresa.addPessoa(new Pessoa(false, false));
		empresa.addPessoa(new Pessoa(true , false));
		
		
		
		System.out.println(empresa.calculaResposta());
		System.out.println();
		System.out.println(empresa.calculaPorcentagem());
		
		
		
	}
}
