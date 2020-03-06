public class Lista 
{

    private Caixa inicio, fim, aux, ant, cx;

    public Lista() 
    {
        inicio=null;
        fim=null;
        cx=null;
        aux=null;
        ant=null;
    }

    public void Criacx(int v)
    {
        cx = new Caixa(v);

        if(inicio == null)
        {
            inicio = cx;
            fim = cx;
            return;
        }

        else
        {
            ant=inicio;
            if(v<=ant.getValor())
            {
                inicio=cx;
                cx.setProx(ant);
                return;
            }
        }

        aux=inicio;
        while(aux!=null)
        {
            ant=aux;
            aux=aux.getProx();
            if(aux==null)break;
            if(v<=aux.getValor())
            {
                ant.setProx(cx);
                cx.setProx(aux);

                return;
            }
        }

        fim=cx;
        ant.setProx(cx);
        return;
    }   

    public void Mostrar()
	{
		aux=inicio;
		System.out.println("Mostrando a Lista:");
		
   		while(aux != null)
   		{
   			
   			System.out.println("=>"+aux.getValor());
   			aux=aux.getProx();
   			
   		}	
   			
   		System.out.println("\n Acabou a Fila");
	}
    
}