package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Julian");
        pessoa.setEndereco("Rua");
        pessoa.setTelefone(99999999);
        
        System.out.println(pessoa.imprimir());


    }
}