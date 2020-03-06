public class UsaLista
 {    
 	
    public static void main(String[] args) 
    {
    	
    	Lista ordena;

    	ordena = new Lista();

    	ordena.Criacx(20);
    		
    	ordena.Criacx(10);
    		
    	ordena.Criacx(15);

        ordena.Criacx(50);


    	ordena.Mostrar();
        if(ordena.Procurar(15))
            System.out.printf("\n Achou 15");
        else
            System.out.printf("\n Nao achou 15");

        ordena.Removecx(15);
        System.out.printf("\n Valor removido=15");
        ordena.Mostrar();

        ordena.Removecx(50);
        System.out.printf("\n Valor removido=50");
        ordena.Mostrar();
    }
}
