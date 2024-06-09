class Mie
{
    void sum()
    {
        int a=5,b=10;
        System.out.println("M:"+(a+b));
    }
}
class Gi extends Mie
{
    void sum()
    {
        int a=1,b=1;
        System.out.println("G:"+(a+b));
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        Mie m=new Mie();
        m.sum();
        Gi g=new Gi();
        g.sum();
        // g.sum();
    }
    
}
