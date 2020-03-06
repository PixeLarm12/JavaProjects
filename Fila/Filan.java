public class Filan 
{

	CaixaStr cx,inicio,fim,aux;
	
    public Filan() 
    {
    	
    	inicio=null;
    	fim=null;	
    	aux=null;
    	cx=null;
    	
    }
    
    
    	//Cria Caixa
    public void criacx(String valor)
    {
    	
    	aux=cx;
    	cx=new CaixaStr(valor); 
    	fim=cx;
    	
    	if(inicio==null)
    	{
			inicio=cx;    		
    	}
    	
    	else
    	{
    		aux.setProx(cx);
    	}
    	
    }
    
    	
   		//Mostrar
   	public void Mostrar()
   	{
   		
   		aux = inicio;
   		
   		System.out.println("Mostrando a Fila:");
		if(aux == null)
		{
			System.out.println("Fila Vazia");
			return;
		}
   			
   		while(aux != null)
   		{
   			
   			System.out.println("=>"+aux.getValor());
   			aux=aux.getProx();
   			
   		}	
   			
   		System.out.println("\n Acabou a Fila");
   		
   	}
   	
   	
   		//Remove Caixa
   	public String removecx()
   	{
   		
   		String volta="";
   		aux=inicio;
   		
   		if(aux==null)
   		{
   			System.out.println("Fila Vazia");
   			return "";
   		}
   		
   		volta=aux.getValor();
   		inicio=aux.getProx();
   		aux=null;
   		
   		if(inicio==null)
   		{
   			fim=null;
   		}
   		
   		return volta;
   		
   	}
}