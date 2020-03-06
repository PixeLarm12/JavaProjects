//crediaria


public class FilaDupla 
{
	private CaixaD inicio,fim,cx1,cx2,cx3,aux;
	
	public FilaDupla() 
	{
		inicio=null;
		fim=null;
		aux=null;
		cx1=null;
		cx2=null;
		cx3=null;
	}
	
	public void criacx1(int v)
	{
		cx1 = new CaixaD(v);
    	inicio=cx1; 
    	fim=cx1;
	}
	
	public void criacx2(int v)
	{
		cx2 = new CaixaD(v);
    	fim=cx2;
    	cx2.setAnt(cx1);
    	cx1.setProx(cx2);
	}
	
	public void criacx3(int v)
	{
		cx3 = new CaixaD(v); 
    	fim=cx3;
    	cx3.setAnt(cx2);
    	cx2.setProx(cx3);
	}
	
	public int removecx1()
	{
		int volta;
		
		volta = cx1.getValor();
		cx1 = null;
		cx2.setAnt(null);
		inicio=cx2;
		return volta;
	}
	
	public int removecx2()
	{
		int volta;
		
		volta = cx2.getValor();
		cx2 = null;
		cx3.setAnt(null);
		inicio=cx3;
		return volta;
	}
	
	public int removecx3()
	{
		int volta;
		
		volta = cx3.getValor();
		cx3 = null;
		inicio=null;
		fim=null;	
	
		return volta;
	}
	
	public void mostraif() // inicio -> fim
	{
		aux=inicio;
		System.out.println("Mostrando a Fila (I->F) :");
		
   		while(aux != null)
   		{
   			
   			System.out.println("=>"+aux.getValor());
   			aux=aux.getProx();
   			
   		}	
   			
   		System.out.println("\n Acabou a Fila");
	}
	
	public void mostrafi() // fim -> inicio
	{
		aux=inicio;
		System.out.println("Mostrando a Fila (F->I) :");
		
   		while(aux != null)
   		{
   			
   			System.out.println("=>"+aux.getValor());
   			aux=aux.getAnt();
   			
   		}	
   			
   		System.out.println("\n Acabou a Fila");
	}
		
}
