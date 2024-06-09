class b1{
    void sum1()
    {
        int a=1,b=2;
        System.out.println("B1:"+(a+b));
    }
}
class b2 extends b1
{
    void sum1()
    {
        int a=3,b=9;
        System.out.println("B2:"+(a+b));
    }
    void sum2()
    {
        int a=9,b=0;
        System.out.println("B3:"+(a+b));
    }
    void s()
    {
        super.sum1();
        
    }
}
class b4 extends b2
{
    void sum2()
    {
        int a=0,b=8;
        System.out.println("B4:"+(a+b));
    }
    void sum3()
    {
        int a=0,b=1;
        System.out.println("B5:"+(a+b));
    }
    void f()
    {
        super.sum2();
    }
}
class b3 extends b1
{
    void sum2()
    {
        int a=9,b=8;
        System.out.println("B6:"+(a+b));
    }
}
class b5 extends b3
{
    void sum2()
    {
        int a=0,b=8;
        System.out.println("B7:"+(a+b));
    }
    void sum4()
    {
        int a=90,b=8;
        System.out.println("B8:"+(a+b));
    }
    void p()
    {
        super.sum2();
    }
}
class b6 extends b3
{
    void sum1()
    {
        int a=7,b=8;
        System.out.println("B9:"+(a+b));
    }
    void sum2()
    {
        int a=6,b=8;
        System.out.println("B10:"+(a+b));
    }
}
public class all {
    public static void main(String[] args) {
         {
            b4 b=new b4();
            b.s();
            b.sum1();
            // b.sum1();
            // b.sum2();
            b.f();
            b.sum2();

            b.sum3();
            b5 c=new b5();
            // c.sum1();
            c.p();
            c.sum2();
            // c.sum2();
            c.sum4();
            b6 v=new b6();
            v.sum1();
            v.sum2();
            // v.sum1();
            // v.sum2();
         }    
        }
    }
