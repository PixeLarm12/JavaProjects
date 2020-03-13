import java.util.Scanner;

public class Arvorexp 
{
    
    private CaixaArvore cx1, cx2, cx3, cx4, cx5, cx6, cx7;
    private CaixaArvore aux, raiz;

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

    }

    public void criacx2(String v)
    {
        
    }

    public void criacx3(String v)
    {
        cx3 = new CaixaArvore(v);
        cx2.setDir(cx3);
    }

    public void criacx4(int v)
    {
        
    }   

    public void criacx5(int v)
    {
        cx5 = new CaixaArvore(v);
        cx4.setDir(cx5);
    }

    public void criacx6(int v)
    {
        cx6 = new CaixaArvore(v);
        cx3.setDir(cx6);
    }

     public void criacx7(int v)
    {
        cx7 = new CaixaArvore(v);
        cx3.setDir(cx7);
    }
    
}