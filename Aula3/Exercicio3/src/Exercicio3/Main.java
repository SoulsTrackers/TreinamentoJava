package Exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Produto mesa     = new Produto("mesa"    , 100, 110);
		Produto cadeira  = new Produto("Cadeira" , 100, 120);
		Produto cadeira2 = new Produto("Cadeira" , 100, 130);
		Produto cadeira3 = new Produto("Cadeira" , 100, 140);
		Produto cadeira4 = new Produto("Cadeira" , 100, 150);
		Produto cadeira5 = new Produto("Cadeira" , 100, 160);
		Produto cadeira6 = new Produto("Cadeira" , 100, 170);
		Produto cadeira7 = new Produto("Cadeira" , 100, 100);
		
		Loja loja = new Loja();
		
		loja.addProduto(mesa);
		loja.addProduto(cadeira);
		loja.addProduto(cadeira2);
		loja.addProduto(cadeira3);
		loja.addProduto(cadeira4);
		loja.addProduto(cadeira5);
		loja.addProduto(cadeira6);
		loja.addProduto(cadeira7);
		
		
		System.out.println(loja.margemLucro());
		
		System.out.println();
		
		System.out.println(loja.calculaTotalDeCompras());
		System.out.println(loja.calculaTotalDeVendas());
		System.out.println(loja.calculaTotalDeLucro());
		
	}
}
