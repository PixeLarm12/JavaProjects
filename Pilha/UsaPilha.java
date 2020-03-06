public class UsaPilha
 {    
 	
    public static void main(String[] args) 
    {
    	
    	Pilha prato;
    	int valor;
    	prato = new Pilha();
    	prato.Mostrar();
    	
    	prato.criacx1(10);
    		prato.Mostrar();
    		
    	prato.criacx2(20);
    		prato.Mostrar();
    		
    	prato.criacx3(30);
    		prato.Mostrar();
    		
    	prato.criacx4(40);
    		prato.Mostrar();
    		
    	valor=prato.removecx4();    	
    		prato.Mostrar();
    	
    	System.out.println("Valor removido ="+ valor);
    	
    	valor=prato.removecx3();    	
    		prato.Mostrar();
    	
    	System.out.println("Valor removido ="+ valor);
    	
    	valor=prato.removecx2();    	
    		prato.Mostrar();
    	
    	System.out.println("Valor removido ="+ valor);
    	
    	valor=prato.removecx1();    	
    		prato.Mostrar();
    	
    	System.out.println("Valor removido ="+ valor);
  		
    }
}
