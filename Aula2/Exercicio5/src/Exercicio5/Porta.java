package Exercicio5;


public class Porta {
    
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    
    
    
    public Porta(boolean aberta, String cor) {
        this.aberta = aberta;
        this.cor = cor;

    }

    public Porta() {
    }
    

    
    
    //GET E SET
    public boolean isAberta() {
        return aberta;
    }

    
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    
    public String getCor() {
        return cor;
    }

   
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public double getDimensaoX() {
        return dimensaoX;
    }

    
    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    
    public double getDimensaoY() {
        return dimensaoY;
    }

   
    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    
    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }


    //METODOS
    
    public void abre()
    {
        setAberta(true);
    }
    
    public void fecha()
    {
        setAberta(false);
    }   
    
    public void pinta(String s)
    {
        setCor(s);
    }
    
    public String estaAberta()
    {
        return (isAberta()) ? "Esta aberta" : "esta fechada";
    }
    


    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
