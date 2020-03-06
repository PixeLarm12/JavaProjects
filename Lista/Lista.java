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

    public boolean Removecx(int vv)
    {
        if(inicio == null)
        {
            System.out.println("Lista vazia");
            return false;
        }

        aux=inicio;
        
        if(vv==aux.getValor())
        {
            inicio=aux.getProx();
            aux=null;
            return true;
        }

        while(aux!=null)
        {
            ant=aux;
            aux=aux.getProx();
            if(aux==null)break;
            if(vv==aux.getValor())
            {
                ant.setProx(aux.getProx());

                if(aux.getProx() == null) fim=ant;

                aux=null;

                return true;
            }
        }
         
        return false;
    }
    
    public boolean Procurar(int vv)
    {
        return recursiva(inicio, vv);
    }

    public boolean recursiva(Caixa c, int v)
    {
        if(c == null)
            return false;

        System.out.println("procurando=" + c.getValor());

        if(c.getValor() == v)
            return true;

        return recursiva(c.getProx(), v);
    }

    public void MostrarRecur()
	{
        System.out.println("Inicio->fim");
        MostraMostra(inicio);
        System.out.println("fim lista");

    }

    public void MostraMostra(Caixa c)
    {
		aux=c;

   		if(aux != null)
   		{
   			
   			System.out.println("=>" + aux.getValor() + "<=");
   			MostraMostra(c.getProx());
   			
   		}	
   			
   		System.out.println("\n Acabou a Fila");
	}
}