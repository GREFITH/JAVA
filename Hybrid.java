class M
{
    void sum()
    {
        int a=4,b=5;
        System.out.println("M:"+(a+b));
    }
}
class G extends M
{
    void sub()
    {
        int a=3,b=5;
        System.out.println("G:"+(a-b));
    }
}
class Mi extends G
{
    void mul()
    {
        int a=4,b=0;
        System.out.println("Mi:"+(a*b));
    }
}
class Ma extends M
{
    void div()
    {
        int a=5, b=7;
        System.out.println("Ma:"+(a/b));
    }
}
public class Hybrid {
    public static void main(String[] args) {
        Mi m=new Mi();
        m.sum();
        m.sub();
        m.mul();
        Ma g=new Ma();
        g.div();
    }
}
