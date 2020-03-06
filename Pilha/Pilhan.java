public class Pilhan 
{
	private Caixa cx,inicio,aux;
	
    public Pilhan() 
    {
    	cx=null;
    	aux=null;
    	inicio=null;
    }
    
    public void criacx(int v)
    {
    	cx=new Caixa(v);
    	cx.setProx(inicio);
    	inicio=cx;
    }
    
    public int removecx()
    {
    	int volta=0;
    	cx=inicio;
    	
    	if(cx==null)
    		return 0;
    	
    	volta=cx.getValor();
    	inicio=cx.getProx();
    	cx=null;
    	
    	return volta;
    }
    
    public boolean procura(int v)
    {
    	aux=inicio;
    	
    	while(aux!=null)
    	{
    		if(aux.getValor() == v)
    			return true;
    		aux=aux.getProx();
    	}
    	
    	return false;
    }
    
    public void mostrar()
    {
    	aux=inicio;
    	System.out.println("Mostrando a fila: ");
    	
    	if(aux==null)
    	{
    		System.out.println("Fila vazia");
    	}
    	
    	while(aux!=null)
    	{
    		System.out.println("->" + aux.getValor());
    		aux=aux.getProx();
    	}
    	
    	System.out.println("Acabou a fila");
   }
}