package br.com.meta.aula3.exercicio3;

import java.util.ArrayList;

public class TesteAnimais {
	
	public static void main(String[] args) {
		
		ArrayList<Animal> listaAnimais = new ArrayList<>();
		
		listaAnimais.add(new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0f));
		listaAnimais.add(new Peixe("Tubarao", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda"));
		listaAnimais.add(new Mamifero("Urso-do-Canada", 180, 4, "Vermelho", "Terra", 0.5f, "Mel"));
		
		for(Animal animal : listaAnimais)
		{
			System.out.println("------------------------");
			System.out.println(animal.dados());
		}
		System.out.println("------------------------");
	}

}
