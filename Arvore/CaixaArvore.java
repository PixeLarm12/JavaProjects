public class CaixaArvore 
{
	private CaixaArvore esq;
	private CaixaArvore dir;
	private int valor;
	
	public CaixaArvore(int valorn)
	{
	   	setValor(valorn);
	   	setEsq(null);
	   	setDir(null);
	}
   
	public void setDir(CaixaArvore endereco)
	{
		this.dir=endereco;
	}
	
	public void setEsq(CaixaArvore endereco)
	{
		this.esq=endereco;
	}
	
	public CaixaArvore getDir()
	{
		return this.dir;
	}
	
	public CaixaArvore getEsq()
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