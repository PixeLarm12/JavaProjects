public class UsaFila
 {    
 	
    public static void main(String[] args) 
    {
    	
    	Fila Fcaixas;
    	int valor;
    	Fcaixas = new Fila();
    	Fcaixas.Mostrar();
    	
    	Fcaixas.criacx1(10);
    		Fcaixas.Mostrar();
    		
    	Fcaixas.criacx2(20);
    		Fcaixas.Mostrar();
    		
    	Fcaixas.criacx3(30);
    		Fcaixas.Mostrar();
    		
    	Fcaixas.criacx4(40);
    		Fcaixas.Mostrar();
    		
    	valor=Fcaixas.removecx1();    	
    		Fcaixas.Mostrar();
    	
    	System.out.println("Valor removido ="+ valor);
    	
    	valor=Fcaixas.removecx2();    	
    		Fcaixas.Mostrar();
    	
    	System.out.println("Valor removido ="+ valor);
    	
    	valor=Fcaixas.removecx3();    	
    		Fcaixas.Mostrar();
    	
    	System.out.println("Valor removido ="+ valor);
    	
    	valor=Fcaixas.removecx4();    	
    		Fcaixas.Mostrar();
    	
    	System.out.println("Valor removido ="+ valor);
  		
    }
}
