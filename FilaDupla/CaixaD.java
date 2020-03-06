public class CaixaD 
{
	private CaixaD ant;
	private int valor;
	private CaixaD prox;
	
	public CaixaD(int valorn)
	{
	   	setValor(valorn);
	   	setAnt(null);
	   	setProx(null);
	}
   
	public void setProx(CaixaD endereco)
	{
		this.prox=endereco;
	}
	
	public void setAnt(CaixaD endereco)
	{
		this.ant=endereco;
	}
	
	public CaixaD getProx()
	{
		return this.prox;
	}
	
	public CaixaD getAnt()
	{
		return this.ant;
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