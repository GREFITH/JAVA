abstract class M
{
    abstract void sum();
}
class G extends M
{
    void sum()
    {
        int a=1,b=5;
        System.out.println("SUM:"+(a+b));
    }
}
public class abstractex {
    public static void main(String[] args) {
        G mi=new G();
        mi.sum();
    }
}
