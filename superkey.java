class A
{
    int a1=21,b1=4;
}
class B extends A
{
    int a1=9,b1=6;
    void disc()
    {
        System.out.println("ADD:"+(super.a1+super.b1));
    }
}
public class superkey {
    public static void main(String[] args) {
        B o=new B();
        o.disc();
    }
}
