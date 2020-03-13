import.java.util.Scanner;

public class Arvore 
{

    private CaixaArv cx1, cx2, cx3, cx4, cx5;
    private CaixaArv aux, raiz;

    public Arvore() 
    {
        cx1=null;
        cx2=null;
        cx3=null;
        cx4=null;
        cx5=null;
        aux=null;
        raiz=null;
    }

    public void criacx1(int v)
    {
        cx1=new CaixaArv(v);
        raiz=cx1;
    }   

    public void criacx2(int v)
    {
        cx2=new CaixaArv(v);

        if(v<cx1.getValor())
        {
            cx1.setEsq(cx2);
        }
        else
        {
            cx1.setDir(cx2);
        }
    }

    public void criacx3(int v)
    {
        cx3=new CaixaArv(v);
        aux=raiz;
        
        while(aux!=null)
        {
            if(v<aux.getValor())
            {
                if(aux.getEsq()==null)
                {
                    aux.setEsq(cx3);
                    break;
                }
                else
                {
                    aux=aux.getEsq();
                }
            }

            if(v>=aux.getValor())
            {
                if(aux.getDir()==null)
                {
                    aux.setDir(cx3);
                    break;
                }
                else
                {
                    aux=aux.getDir();
                }
            }
        }
    }

    public void criacx4(int v)
    {
        cx4=new CaixaArv(v);
        aux=raiz;
        
        while(aux!=null)
        {
            if(v<aux.getValor())
            {
                if(aux.getEsq()==null)
                {
                    aux.setEsq(cx4);
                    break;
                }
                else
                {
                    aux=aux.getEsq();
                }
            }

            if(v>=aux.getValor())
            {
                if(aux.getDir()==null)
                {
                    aux.setDir(cx4);
                    break;
                }
                else
                {
                    aux=aux.getDir();
                }
            }
        }
    }

    public void criacx5(int v)
    {
        cx5=new CaixaArv(v);
        aux=raiz;
        
        while(aux!=null)
        {
            if(v<aux.getValor())
            {
                if(aux.getEsq()==null)
                {
                    aux.setEsq(cx5);
                    break;
                }
                else
                {
                    aux=aux.getEsq();
                }
            }

            if(v>=aux.getValor())
            {
                if(aux.getDir()==null)
                {
                    aux.setDir(cx5);
                    break;
                }
                else
                {
                    aux=aux.getDir();
                }
            }
        }
    } 

    public void mostrav()
    {
        Scanner teclado;
        teclado=new Scanner(System.in);
        String tecla="";
        aux=raiz;

        while(aux!=null)
        {
            System.out.print("\n valor=" +aux.getValor());
            System.out.print("\n (E)sq, (D)ir, (F)im?");
            tecla.teclado.nextLine();

            if(tecla.equals("E"))
                aux=aux.getEsq();

            if(tecla.equals("D"))
                aux=aux.getDir();

            if(tecla.equals("F"))
                break;
        }
        System.out.print("\n Fim \n");
    }
}