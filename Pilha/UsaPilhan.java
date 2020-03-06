public class UsaPilhan 
{    	
    public static void main(String[] args) 
    {
    	Pilhan prato;
    	
    	prato=new Pilhan();
    	for(int c=110; c<=1000; c=c+100)
    	{
    		prato.criacx(c); 
    		prato.mostrar();
    	}//Mostrando
    	
    	for(int c=110; c<=1000; c=c+100)
    	{
    		prato.removecx(); 
    		prato.mostrar();
    	}//Apagando
    }
}
