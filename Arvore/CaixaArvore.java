public class CaixaArv 
{
	private CaixaArv esq;
	private CaixaArv dir;
	private int valor;
	
	public CaixaArv(int valorn)
	{
	   	setValor(valorn);
	   	setEsq(null);
	   	setDir(null);
	}
   
	public void setDir(CaixaArv endereco)
	{
		this.dir=endereco;
	}
	
	public void setEsq(CaixaArv endereco)
	{
		this.esq=endereco;
	}
	
	public CaixaArv getdir()
	{
		return this.dir;
	}
	
	public CaixaArv getesq()
	{
		return this.esq;
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