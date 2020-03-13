public class Caixarv
{
    private Caixarv esq;
    private Caixarv dir;
    private String valor;

    public Caixarv(String valorn)
    {
        setValor(valorn);
        setEsq(null);
        setDir(null);
    }

    public void setEsq(Caixarv endereco)
    {
        this.esq=endereco;
    }

    public void setDir(Caixarv endereco)
    {
        this.dir=endereco;
    }

    public Caixarv getEsq()
    {
        return this.esq;
    }

    public Caixarv getDir()
    {
        return this.dir;
    }

    public void setValor(String v)
    {
        this.valor=v;
    }

    public String getValor()
    {
        return this.valor;
    }
}