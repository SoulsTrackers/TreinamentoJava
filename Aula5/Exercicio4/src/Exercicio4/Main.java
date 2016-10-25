package Exercicio4;


public class Main {
    public static void main(String[] args) {
        
        Moto moto = new Moto();
        moto.setMarca("honda");
        moto.setModelo("titan");
        moto.setCor("prata");
        moto.setMarcha(3);
        System.out.println(moto.imprimir());
     
    }
    
}
