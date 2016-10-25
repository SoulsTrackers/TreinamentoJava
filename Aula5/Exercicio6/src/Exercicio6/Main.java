
package Exercicio6;


public class Main {
    public static void main(String[] args) {
        
        Moto moto = new Moto("honda", "titan", "prata");
        moto.marchaAcima();
        moto.marchaAcima();
        moto.marchaAcima();
        moto.marchaAbaixo();
        moto.marchaAbaixo();
        System.out.println(moto.imprimir());
   
        
    }
}
