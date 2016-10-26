package Exercicio4;


public class Main {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque();
        
        
        estoque1.setNome("Impressora");
        estoque1.setQtdAtual(13);
        estoque1.setQtdMinima(6);
        
        Estoque estoque2 = new Estoque();
        estoque2.setNome("Monitor");
        estoque2.setQtdAtual(11);
        estoque2.setQtdMinima(13);
        
        Estoque estoque3 = new Estoque();
        estoque3.setNome("Mouse");
        estoque3.setQtdAtual(6);
        estoque3.setQtdMinima(2);
        
        System.out.println(estoque1.mostra());
        System.out.println(estoque1.precisaRepor() ? "Precisa repor" : "Não precisa Repor");
        
        System.out.println(estoque2.mostra());
        System.out.println(estoque2.precisaRepor() ? "Precisa repor" : "Não precisa Repor");
        
        System.out.println(estoque3.mostra());
        System.out.println(estoque3.precisaRepor() ? "Precisa repor" : "Não precisa Repor");
        
        estoque1.darBaixa(0);
        estoque1.precisaRepor();
        System.out.println(estoque1.mostra());
        System.out.println(estoque1.precisaRepor() ? "Precisa repor" : "Não precisa Repor");
        
    
    }
}
