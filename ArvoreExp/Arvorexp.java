import java.util.Scanner;

public class Arvorexp
{

    private Caixarv cx1, cx2, cx3, cx4, cx5, cx6, cx7;
    private Caixarv aux, raiz;

    public Arvorexp()
    {
        cx1=null;
        cx2=null;
        cx3=null;
        cx4=null;
        cx5=null;
        cx6=null;
        cx7=null;
        aux=null;
        raiz=null;  
    }

    public void criacx1(String v)
    {
        cx1=new Caixarv(v);
        raiz=cx1;
    }

    public void criacx2(String v)
    {
        cx2=new Caixarv(v);
        cx1.setEsq(cx2);
    }
    
    public void criacx3(String v)
    {
        cx3=new Caixarv(v);
        cx1.setDir(cx3);
    }

    public void criacx4(String v)
    {
        cx4=new Caixarv(v);
        cx2.setEsq(cx4);
    }

    public void criacx5(String v)
    {
        cx5=new Caixarv(v);
        cx2.setDir(cx5);
    }

    public void criacx6(String v)
    {
        cx6=new Caixarv(v);
        cx3.setEsq(cx6);
    }

    public void criacx7(String v)
    {
        cx7=new Caixarv(v);
        cx3.setDir(cx7);
    }

    public void calcula()
    {
        System.out.print("\n Resultado=" + calc(raiz));
    }

    public int calc(Caixarv c)
    {
        if(c.getValor().equals("+"))
            return calc(c.getEsq()) + calc(c.getDir()); 

        if(c.getValor().equals("/"))
            return calc(c.getEsq()) / calc(c.getDir());

        if(c.getValor().equals("-"))
            return calc(c.getEsq()) - calc(c.getDir());

        if(c.getValor().equals("*"))
            return calc(c.getEsq()) * calc(c.getDir());

        return Integer.parseInt(c.getValor());
    }

    public void mostrarv()
    {
        Scanner teclado;
        teclado=new Scanner(System.in);
        String tecla="";
        aux=raiz;
        
        while(aux!=null)
        {
            System.out.print("\n valor=" +aux.getValor());
            System.out.print("\n (E)sq, (D)ir, (F)im?");
            tecla=teclado.nextLine();

            if(tecla.equals("E"))
                aux=aux.getEsq();

            if(tecla.equals("D"))
                aux=aux.getDir();

            if(tecla.equals("F"))
                break;
        }
        System.out.print("\n Fim \n");
    }

    public void mostratudo()
    {
        mostrarecursivo(raiz);
    }

    public void mostrarecursivo(CaixaArvore c)
    {
        if(c==null)
        {
            return;
        }

        //decrescente
        mostrarecursivo(c.getEsq());
        System.out.print("\n valor=" + c.getValor());
        mostrarecursivo(c.getDir());
    }
}