package Exercicio5;



public class Main {
    public static void main(String[] args) {
        
        //TESTE PORTA
        
        Porta porta1 = new Porta(false, "vermelho");
        Porta porta2 = new Porta(true, "azul");
        Porta porta3 = new Porta(false, "verde");
        Porta porta4 = new Porta(false, "amarela");
        Porta porta5 = new Porta(true, "rosa");
        Porta porta6 = new Porta(true, "roxo");
        
        Andar andar1 = new Andar();
        Andar andar2 = new Andar();
        Andar andar3 = new Andar();
        
        
        
        System.out.println("Casa");
        Casa  casa = new Casa("vermelha");
        casa.AddPorta(porta1);
        casa.AddPorta(porta2);
        casa.AddPorta(porta3);
        
        System.out.println(   "Portas abertas: " 	 + casa.quantasPortasEstaoAbertas() 
        					+ " | Portas fechadas: " + casa.totalDePortasFechadas()
        					+ " | Cor da casa: " 	 + casa.retornaCor()
        				   );
        
        
        System.out.println("");

               
        //EDIFICIO
        System.out.println("Edificio");
        Edificio edificio = new Edificio("vermelho");
        edificio.addPorta(porta1);
        edificio.addPorta(porta2);
        edificio.addPorta(porta3);
        edificio.addPorta(porta4);
        edificio.addPorta(porta5);
        edificio.addPorta(porta6);        
        edificio.addAndar(andar1);
        edificio.addAndar(andar2);
        edificio.addAndar(andar3);
        
        System.out.println(   "Cor do edificio: " 		+ edificio.cor() 
        					+ " | Numeros de andares: " + edificio.totalDeAndares() 
        					+ " | Total de portas: " 	+ edificio.totalPortas() 
        					+ " | Portas Abertas: " 	+ edificio.quantasPortasEstaoAbertas()
        					);
        
    }
    
}
