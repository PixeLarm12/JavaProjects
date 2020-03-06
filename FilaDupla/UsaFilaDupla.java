public class UsaFilaDupla 
{
    public static void main(String[] args) 
    {
    	
    	FilaDupla Fd;
    	int valor;
    	Fd = new FilaDupla();
    	Fd.mostraif();
    	
    	Fd.criacx1(10);
    		
    	Fd.criacx2(20);
    		
    	Fd.criacx3(30);
    		
    		
    	Fd.mostrafi();
    	Fd.mostraif();
    		
    	valor=Fd.removecx1();
    	Fd.mostraif();
    	
    	System.out.println("Valor removido ="+ valor);
    	
    	valor=Fd.removecx2();    	
    	Fd.mostraif();
    	
    	System.out.println("Valor removido ="+ valor);
    	
    	valor=Fd.removecx3();    	
    	Fd.mostraif();
    	    	
    	System.out.println("Valor removido ="+ valor);
    	
  		
    }
}
