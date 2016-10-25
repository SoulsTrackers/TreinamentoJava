
package Exercicio7;


public class Main {
    public static void main(String[] args) {
        
        Moto moto = new Moto("honda", "titan", "prata");
        moto.marchaAcima(5);     
        moto.marchaAbaixo(1);
        System.out.println(moto.imprimir());
  
        
    }
}
