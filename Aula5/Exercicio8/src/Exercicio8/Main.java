
package Exercicio8;


public class Main {
    public static void main(String[] args) {
        
        Moto moto = new Moto("honda", "titan", "prata", 6, 0);
        moto.marchaAcima(4);
        moto.marchaAcima();
        moto.marchaAbaixo();

        System.out.println(moto.imprimir());
        
   
    }
}
