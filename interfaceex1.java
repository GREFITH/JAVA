interface A
{
    abstract void sum();
}
interface B
{
    abstract void sub();
}
class C implements A,B
{
    public void sum()
    {
        int a=1;int b=34;
        System.out.println("SUM:"+(a+b));
    }
    public void sub()
    {
        int a=12;int b=23;
        System.out.println("SUB:"+(a-b));
    }
}
public class interfaceex1 {
   public static void main(String[] args) {
       C v=new C();
        v.sum();
        v.sub();
        A d=new C();
        d.sum();
        B s=new C();
        s.sub();
   }
}
