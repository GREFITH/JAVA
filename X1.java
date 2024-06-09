public class X {
    static void methodOfx()
    {
        System.out.println("Class X");
    }
}
class Y extends X
{
    static void methodOfX()
    {
        System.out.println("Class X");
    }
}
class Z
{
    public static void main(String [] args)
    {
        X x=new y();
        x.methodOfX();
    }
}
