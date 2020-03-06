public class CaixaStr
{
	
	private String valor;
	private CaixaStr prox;
	
    public CaixaStr() 
    {
    	
    	setValor("");
    	setProx(null);
    	
    }
    
    public CaixaStr(String valorn) 
    {
    	
    	setValor(valorn);
    	setProx(null);
    	
    }
    
    public void setProx(CaixaStr endereco)
    {
    	
    	this.prox = endereco;
    	
    }
    
    public CaixaStr getProx()
    {
    	
    	return this.prox;
    	
    }
    
    public void setValor(String v)
    {
    	
    	this.valor = v;
    	
    }
    
    public String getValor()
    {
    	
    	return this.valor;
    	
    }
}