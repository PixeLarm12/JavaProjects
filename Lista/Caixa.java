public class Caixa 
{
	private int valor;
	private Caixa prox;
	
    public Caixa() 
    {
    	
    	setValor(0);
    	setProx(null);
    	
    }
    
    public Caixa(int valorn) 
    {
    	
    	setValor(valorn);
    	setProx(null);
    	
    }
    
    public void setProx(Caixa endereco)
    {
    	
    	this.prox = endereco;
    	
    }
    
    public Caixa getProx()
    {
    	
    	return this.prox;
    	
    }
    
    public void setValor(int v)
    {
    	
    	this.valor = v;
    	
    }
    
    public int getValor()
    {
    	
    	return this.valor;
    	
    }
}