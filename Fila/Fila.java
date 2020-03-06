public class Fila 
{

	private Caixa cx1,cx2,cx3,cx4,inicio,fim,aux;
	
    public Fila() 
    {
    	
    	inicio=null;
    	fim=null;	
    	aux=null;
    	cx1=null;
    	cx2=null;
    	cx3=null;
    	cx4=null;
    	
    }
    
    
    	//1
    public void criacx1(int valor)
    {
    	
    	cx1 = new Caixa(valor);
    	inicio=cx1; 
    	fim=cx1;
    	
    }
    
    	//2
    public void criacx2(int valor)
    {
    	
    	cx2 = new Caixa(valor);
    	fim=cx2;
    	cx1.setProx(cx2);
    	
    }
    
    	//3
    public void criacx3(int valor)
    {
    	
    	cx3 = new Caixa(valor);
    	fim=cx3;
    	cx2.setProx(cx3);
    }
    
    	//4
    public void criacx4(int valor)
    {
    	
    	cx4 = new Caixa(valor);
    	fim=cx4;
    	cx3.setProx(cx4);
    	
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
   	
   	
   		//REMOVE CX1
   	public int removecx1()
   	{
   		
   		int volta;
   		aux=inicio;
   		volta=aux.getValor();
   		inicio=aux.getProx();
   		cx1=null;
   		return volta;
   		
   	}
   	
   		//REMOVE CX2
   	public int removecx2()
   	{
   		
   		int volta;
   		aux=inicio;
   		volta=aux.getValor();
   		inicio=aux.getProx();
   		cx2=null;
   		return volta;
   		
   	}
   	
   		//REMOVE CX3
   	public int removecx3()
   	{
   		
   		int volta;
   		aux=inicio;
   		volta=aux.getValor();
   		inicio=aux.getProx();
   		cx3=null;
   		return volta;
   		
   	}
   	
   		//REMOVE CX4
   	public int removecx4()
   	{
   		
   		int volta;
   		aux=inicio;
   		volta=aux.getValor();
   		inicio=aux.getProx();
   		cx4=null;
   		fim=null;
   		return volta;
   		
   	}
}