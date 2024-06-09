interface M
{
    abstract void sum();
}
class G implements M
{
    public void sum()
    {
        int a=1;int b=90;
        System.out.println("SUM:"+(a+b));
    }
}
public class interfaceex {
    public static void main(String[] args) {
        G mi=new G();
        mi.sum();
    }
}
