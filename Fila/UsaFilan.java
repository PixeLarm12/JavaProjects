public class UsaFilan 
{ 

    public static void main(String[] args) 
    {
    	
    	Filan bixos;
    	String valor;
    	bixos = new Filan();
    	
    	bixos.Mostrar();
    	
    	bixos.criacx("Lucas");
    		bixos.Mostrar();

    	bixos.criacx("Renato");
    		bixos.Mostrar();
    		
    	bixos.criacx("Danilo");
    		bixos.Mostrar();
    		
    	while(true)
    	{
    		
    		valor=bixos.removecx();
    			bixos.Mostrar();
    			
    		if(valor.equals(""))
    			break;
    			
    		System.out.println("Removido ="+ valor);
    		
    	}
    
    }
    
}
